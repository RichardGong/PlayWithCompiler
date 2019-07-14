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

    //AST节点对应的Symbol
    protected Map<ParserRuleContext, Symbol> node2Symbol = new HashMap<ParserRuleContext, Symbol>();

    //AST节点对应的Scope，如for、函数调用会启动新的Scope
    protected Map<ParserRuleContext, Scope> node2Scope = new HashMap<ParserRuleContext, Scope>();


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
    //TODO 如果支持方法重载，还需要比较方法签名
    private Symbol findSymbol(Scope scope, String idName, TypeType typeType){
        Symbol symbol = null;
        for (Symbol s : scope.symbols){
            //typeType是可选的参数
            if (s.name.equals(idName)  && (typeType == null || s.type.typeType == typeType)){
                symbol = s;
                break;
            }
        }

        if (symbol == null){
            symbol = findSymbol(scope.parent, idName, typeType);
        }
        return symbol;
    }

    private Scope createAndPushScope(ParserRuleContext ctx){
        Scope scope = new Scope(currentScope);
        node2Scope.put(ctx,scope);
        currentScope = scope;
        return scope;
    }

    private void popScope(){
        currentScope = currentScope.parent;
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
        createAndPushScope(ctx);
    }

    @Override
    public void enterPrimary(PrimaryContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            String idName = ctx.IDENTIFIER().getText();
            Symbol symbol = findSymbol(currentScope, idName,null);
            if (symbol == null) {
                System.out.println("unknown variable: " + idName);
            } else {
                node2Symbol.put(ctx, symbol);
            }
        }
    }

    @Override
    public void enterProg(ProgContext ctx) {
        scopeTree = createAndPushScope(ctx);;
    }

    @Override
    public void enterStatement(StatementContext ctx) {
        if (ctx.FOR() != null || ctx.WHILE() != null) {
            createAndPushScope(ctx);
        }
    }

    @Override
    public void enterVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
        String idName = ctx.IDENTIFIER().getText();
        Symbol symbol = new Symbol(idName, TypeDict.instance().IntegerType(), currentScope);  //TODO 根据上下文确定正确的类型
        if (currentScope.symbols.contains(symbol)) {
            System.out.println("Variable already Declared: " + idName);
        } else {
            currentScope.symbols.add(symbol);
            node2Symbol.put(ctx, symbol);
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
        popScope();
    }

    @Override
    public void exitProg(ProgContext ctx) {
        popScope();
    }

    @Override
    public void exitStatement(StatementContext ctx) {
        if (ctx.FOR() != null || ctx.WHILE() != null) {
            popScope();
        }
    }

    @Override
    public void enterMethodCall(MethodCallContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            String idName = ctx.IDENTIFIER().getText();
            Symbol symbol = findSymbol(currentScope, idName, TypeType.Method);
            if (symbol == null) {
                System.out.println("unknown method: " + idName);
            } else {
                node2Symbol.put(ctx, symbol);
            }
        }
    }

    @Override
    public void enterMethodDeclaration(MethodDeclarationContext ctx) {
        // 把方法的签名存到符号表中,目前不支持方法的重载，每个方法名称必须唯一，并且也不能跟变量名称冲突
        String idName = ctx.IDENTIFIER().getText();
        Type type = new Type(TypeType.Method,ctx);
        TypeDict.instance().put(idName, "", type);
        Symbol symbol = new Symbol(idName, type, currentScope);

        if (currentScope.symbols.contains(symbol)){
            System.out.println("Symbol already Declared: " + idName);
        } else {
            currentScope.symbols.add(symbol);
        }

        // 创建一个新的scope
        createAndPushScope(ctx);
    }

    @Override
    public void exitMethodCall(MethodCallContext ctx) {
        super.exitMethodCall(ctx);
    }

    @Override
    public void exitMethodDeclaration(MethodDeclarationContext ctx) {
        popScope();
    }

    @Override
    public void enterClassDeclaration(ClassDeclarationContext ctx) {
        // 把类的签名存到符号表中，不能跟已有符号名称冲突
        String idName = ctx.IDENTIFIER().getText();
        Type type = new Type(TypeType.Class,ctx);
        TypeDict.instance().put(idName, "", type);
        Symbol symbol = new Symbol(idName, type, currentScope);

        if (currentScope.symbols.contains(symbol)) {
            System.out.println("Class name conflict with existing symbol: " + idName);
        } else {
            currentScope.symbols.add(symbol);
        }

        // 创建一个新的scope
        createAndPushScope(ctx);

    }

    @Override
    public void exitClassDeclaration(ClassDeclarationContext ctx) {
        popScope();
    }

    // 处理DOT引用的情形，要进入类的scope

    @Override
    public void enterExpression(ExpressionContext ctx) {
        if (ctx.bop != null && ctx.bop.getType() == PlayScriptParser.DOT) {

            if (ctx.expression(0).primary() !=null){
                String idName = ctx.expression(0).primary().getText();
                Symbol symbol = node2Symbol.get(ctx.expression(0).primary());
                if (symbol == null) {
                    System.out.println("unknown object: " + idName);
                } else {
                    node2Symbol.put(ctx, symbol);
                    // if(symbol.definition instanceof ClassDeclarationContext){
                    //     //把类的scope变成当前scope,这有两个前提：
                    //     //1.类的声明在当前中，是当前scope的子scope；
                    //     //2.类的声明在引用之前，其scope对象已经被建立起来。
                    //     currentScope = scopeTree.findDescendantByContext(symbol.definition);   
                    // }
                }
            }         
        }
    }

    @Override
    public void exitExpression(ExpressionContext ctx) {
        if (ctx.bop != null && ctx.bop.getType() == PlayScriptParser.DOT) {

            if (ctx.expression(0).primary() !=null){
                String idName = ctx.expression(0).primary().getText();
                Symbol symbol = node2Symbol.get(ctx.expression(0).primary());
                if (symbol == null) {
                    System.out.println("unknown object: " + idName);
                } else {
                    popScope();
                }
            }         
        }
    }

}