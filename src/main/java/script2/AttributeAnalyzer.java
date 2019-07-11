package script2;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

import script2.PlayScriptParser.BlockContext;
import script2.PlayScriptParser.ClassDeclarationContext;
import script2.PlayScriptParser.EnhancedForControlContext;
import script2.PlayScriptParser.ExpressionContext;
import script2.PlayScriptParser.MethodCallContext;
import script2.PlayScriptParser.MethodDeclarationContext;
import script2.PlayScriptParser.PrimaryContext;
import script2.PlayScriptParser.ProgContext;
import script2.PlayScriptParser.StatementContext;
import script2.PlayScriptParser.VariableDeclaratorIdContext;

public class AttributeAnalyzer extends PlayScriptBaseListener {

    protected Map<ParserRuleContext, Symbol> id2Symbol = new HashMap<ParserRuleContext, Symbol>();

    protected Scope scopeTree = null;

    // 遍历过程中的临时变量
    private Scope currentScope = null;

    /**
     * 通过id查找Symbol
     * 
     * @param scope
     * @param idName
     * @return
     */
    private Symbol findSymbol(Scope scope, String idName) {
        Symbol symbol = null;
        if (scope.symbols.containsKey(idName)) {
            symbol = scope.symbols.get(idName);
        } else if (scope.parent != null) {
            symbol = findSymbol(scope.parent, idName);
        }
        return symbol;
    }

    // private boolean underForStatement(BlockContext ctx) {
    // return (ctx.parent != null // Statement
    // && ctx.parent.parent != null && ctx.parent.parent instanceof StatementContext
    // // Statement
    // && ((StatementContext) ctx.parent.parent).FOR() != null);// FOR Statement
    // }

    @Override
    public void enterBlock(BlockContext ctx) {
        // if (!underForStatement(ctx)) {
        // Scope scope = new Scope(currentScope, ctx);
        // currentScope = scope;
        // }
    }

    @Override
    public void enterEnhancedForControl(EnhancedForControlContext ctx) {
        Scope scope = new Scope(currentScope, ctx);
        currentScope = scope;
    }

    @Override
    public void enterPrimary(PrimaryContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            String idName = ctx.IDENTIFIER().getText();
            Symbol symbol = findSymbol(currentScope, idName);
            if (symbol == null) {
                System.out.println("unknown variable: " + idName);
            } else {
                id2Symbol.put(ctx, symbol);
            }
        }
    }

    @Override
    public void enterProg(ProgContext ctx) {
        Scope scope = new Scope(ctx);
        currentScope = scope;
        scopeTree = scope;
    }

    @Override
    public void enterStatement(StatementContext ctx) {
        if (ctx.FOR() != null || ctx.WHILE() != null) {
            Scope scope = new Scope(currentScope, ctx);
            currentScope = scope;
        }
    }

    @Override
    public void enterVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
        String idName = ctx.IDENTIFIER().getText();
        if (currentScope.symbols.containsKey(idName)) {
            System.out.println("Variable already Declared: " + idName);
        } else {
            Symbol symbol = new Symbol(SymbolType.Variable, currentScope);
            currentScope.symbols.put(idName, symbol);
            id2Symbol.put(ctx, symbol);
        }
    }

    @Override
    public void exitBlock(BlockContext ctx) {
        // if (!underForStatement(ctx)) {
        // currentScope = currentScope.parent;
        // }
    }

    @Override
    public void exitEnhancedForControl(EnhancedForControlContext ctx) {
        currentScope = currentScope.parent;
    }

    @Override
    public void exitProg(ProgContext ctx) {
        currentScope = null;
    }

    @Override
    public void exitStatement(StatementContext ctx) {
        if (ctx.FOR() != null || ctx.WHILE() != null) {
            currentScope = currentScope.parent;
        }
    }

    @Override
    public void enterMethodCall(MethodCallContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            String idName = ctx.IDENTIFIER().getText();
            Symbol symbol = findSymbol(currentScope, idName);
            if (symbol == null) {
                System.out.println("unknown method: " + idName);
            } else {
                id2Symbol.put(ctx, symbol);
            }
        }
    }

    @Override
    public void enterMethodDeclaration(MethodDeclarationContext ctx) {
        // 把方法的签名存到符号表中,目前不支持方法的重载，每个方法名称必须唯一，并且也不能跟变量名称冲突
        String idName = ctx.IDENTIFIER().getText();
        if (currentScope.symbols.containsKey(idName)) {
            System.out.println("Symbol already Declared: " + idName);
        } else {
            Symbol symbol = new Symbol(SymbolType.Method, currentScope);
            symbol.definition = ctx; // 记下方法定义的节点
            currentScope.symbols.put(idName, symbol);
            // id2Symbol.put(ctx, symbol);
        }

        // 创建一个新的scope
        Scope scope = new Scope(currentScope, ctx);
        currentScope = scope;
    }

    @Override
    public void exitMethodCall(MethodCallContext ctx) {
        super.exitMethodCall(ctx);
    }

    @Override
    public void exitMethodDeclaration(MethodDeclarationContext ctx) {
        currentScope = currentScope.parent;
    }

    @Override
    public void enterClassDeclaration(ClassDeclarationContext ctx) {
        // 把类的签名存到符号表中，不能跟已有符号名称冲突
        String idName = ctx.IDENTIFIER().getText();
        if (currentScope.symbols.containsKey(idName)) {
            System.out.println("Class name conflict with existing symbol: " + idName);
        } else {
            Symbol symbol = new Symbol(SymbolType.Class, currentScope);
            symbol.definition = ctx; // 记下类定义的节点
            currentScope.symbols.put(idName, symbol);
            // id2Symbol.put(ctx, symbol);
        }

        // 创建一个新的scope
        Scope scope = new Scope(currentScope, ctx);
        currentScope = scope;
    }

    @Override
    public void exitClassDeclaration(ClassDeclarationContext ctx) {
        currentScope = currentScope.parent;
    }

    // 处理DOT引用的情形，要进入类的scope

    @Override
    public void enterExpression(ExpressionContext ctx) {
        if (ctx.bop != null && ctx.bop.getType() == PlayScriptParser.DOT) {

            if (ctx.expression(0).primary() !=null){
                String idName = ctx.expression(0).primary().getText();
                Symbol symbol = id2Symbol.get(ctx.expression(0).primary());
                if (symbol == null) {
                    System.out.println("unknown object: " + idName);
                } else {
                    id2Symbol.put(ctx, symbol);
                }

                //设置成类的scope

            }         
        }
    }

    @Override
    public void exitExpression(ExpressionContext ctx) {
        super.exitExpression(ctx);
    }

}