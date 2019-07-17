package script2;

import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import script2.PlayScriptParser.BlockContext;
import script2.PlayScriptParser.ClassDeclarationContext;
import script2.PlayScriptParser.ClassOrInterfaceTypeContext;
import script2.PlayScriptParser.EnhancedForControlContext;
import script2.PlayScriptParser.ExpressionContext;
import script2.PlayScriptParser.FormalParameterContext;
import script2.PlayScriptParser.FunctionCallContext;
import script2.PlayScriptParser.FunctionDeclarationContext;
import script2.PlayScriptParser.PrimaryContext;
import script2.PlayScriptParser.PrimitiveTypeContext;
import script2.PlayScriptParser.ProgContext;
import script2.PlayScriptParser.StatementContext;
import script2.PlayScriptParser.TypeTypeContext;
import script2.PlayScriptParser.VariableDeclaratorContext;
import script2.PlayScriptParser.VariableDeclaratorIdContext;
import script2.PlayScriptParser.VariableDeclaratorsContext;

/**
 * 解析符号之间的引用关系。
 */
public class RefPass extends PlayScriptBaseListener {

    // 遍历过程中的临时变量
    private Scope currentScope = null;

    private CompilationRecord cr = null;

    public RefPass(CompilationRecord cr) {
        this.cr = cr;
    }

    private Scope pushScope(Scope scope, ParserRuleContext ctx) {
        // Scope scope = new Scope(currentScope);
        cr.node2Scope.put(ctx, scope);
        scope.ctx = ctx;
        currentScope = scope;
        return scope;
    }

    private void popScope() {
        currentScope = currentScope.enclosingScope;
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
        BlockScope scope = new BlockScope(currentScope, ctx);
        pushScope(scope, ctx);
    }

    @Override
    public void enterPrimary(PrimaryContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            String idName = ctx.IDENTIFIER().getText();
            Variable variable = cr.findVariable(currentScope, idName);
            if (variable == null) {
                cr.log("unknown variable: " + idName, ctx);
            } else {
                cr.node2Symbol.put(ctx, variable);
            }
        }
    }

    @Override
    public void enterProg(ProgContext ctx) {
        BlockScope scope = new BlockScope(currentScope, ctx);
        cr.scopeTree = pushScope(scope, ctx);
    }

    @Override
    public void enterStatement(StatementContext ctx) {
        if (ctx.FOR() != null || ctx.WHILE() != null) {
            BlockScope scope = new BlockScope(currentScope, ctx);
            pushScope(scope, ctx);
        }
    }

    @Override
    public void enterVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
        String idName = ctx.IDENTIFIER().getText();
        Variable variable = new Variable(idName, currentScope, ctx); // TODO 根据上下文确定正确的类型

        if (cr.findVariable(currentScope, idName) != null) {
            cr.log("Variable already Declared: " + idName, ctx);
        }

        currentScope.symbols.add(variable);
        cr.node2Symbol.put(ctx, variable);

        // TODO 这里的类型推断先用比较简单的方法，后面要兼顾各种用到variableDeclaratorId的情况
        // if (ctx.parent instanceof VariableDeclaratorContext
        //         && ctx.parent.parent instanceof VariableDeclaratorsContext) {
        //     VariableDeclaratorsContext vdc = (VariableDeclaratorsContext) ctx.parent.parent;
        //     if (vdc.typeType().classOrInterfaceType() != null) {
        //         variable.type = (Type) cr.node2Symbol.get(vdc.typeType().classOrInterfaceType());
        //     }
        // }

        // 如果是在Class的定义中，则要添加field
        // if (currentScope.ctx instanceof ClassDeclarationContext) {
        // Class theClass = (Class) cr.node2Symbol.get(currentScope.ctx);
        // theClass.fields.add(variable);
        // }
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
    public void exitFunctionCall(FunctionCallContext ctx) {
        //获得类型
        List<Type> paramTypes = new LinkedList<Type>();
        if (ctx.expressionList() != null){
            for (ExpressionContext exp: ctx.expressionList().expression()){
                Type type = cr.node2Type.get(exp);
                paramTypes.add(type);
            }
        }

        if (ctx.IDENTIFIER() != null) {
            String idName = ctx.IDENTIFIER().getText();
            Function function = cr.findFunction(currentScope, idName, paramTypes); // TODO 要更精确的查找方法
            if (function == null) {
                // 看看是不是类的构建函数
                Class theClass = cr.findClass(currentScope, idName);
                if (theClass != null) {
                    Scope classScope = cr.node2Scope.get(theClass.ctx);
                    function = cr.findFunction(classScope, idName, paramTypes); // TODO 可能没有显式的构建函数
                    if (function != null) {
                        cr.node2Symbol.put(ctx, function);
                    } else {
                        cr.node2Symbol.put(ctx, theClass); // TODO 直接赋予class
                    }
                } else {
                    cr.log("unknown function or class: " + idName, ctx);
                }
            } else {
                cr.node2Symbol.put(ctx, function);
            }
        }
    }

    @Override
    public void enterFunctionDeclaration(FunctionDeclarationContext ctx) {
        // 把方法的签名存到符号表中,目前不支持方法的重载，每个方法名称必须唯一，并且也不能跟变量名称冲突
        String idName = ctx.IDENTIFIER().getText();
        Function function = new Function(idName, currentScope, ctx);

        //cr.types.add(function);
        //cr.type2Node.put(function, ctx);

        // TODO 需要查重
        currentScope.symbols.add(function);

        // 如果是在Class的定义中，则要添加成员
        // if (currentScope.ctx instanceof ClassDeclarationContext) {
        // Class theClass = (Class) cr.node2Symbol.get(currentScope.ctx);
        // theClass.functions.add(function);
        // }

        // 创建一个新的scope
        pushScope(function, ctx);
    }


    @Override
    public void exitFunctionDeclaration(FunctionDeclarationContext ctx) {
        popScope();
    }

    @Override
    public void enterClassDeclaration(ClassDeclarationContext ctx) {
        // 把类的签名存到符号表中，不能跟已有符号名称冲突
        String idName = ctx.IDENTIFIER().getText();

        Class theClass = new Class(idName, currentScope, ctx);
        cr.types.add(theClass);
        cr.node2Symbol.put(ctx, theClass);

        if (cr.findClass(currentScope, idName) != null) {
            cr.log("duplicate class name:" + idName, ctx); // 只是报警，但仍然继续解析
        }

        currentScope.symbols.add(theClass);

        // 创建一个新的scope
        pushScope(theClass, ctx);

    }

    @Override
    public void exitClassDeclaration(ClassDeclarationContext ctx) {
        popScope();
    }

    @Override
    public void enterExpression(ExpressionContext ctx) {

    }

    // 处理DOT引用的情形，要进入类的scope

    @Override
    public void exitExpression(ExpressionContext ctx) {
        // TODO 把类的scope变成当前scope,这有两个前提：
        // 1.类的声明在当前中，是当前scope的子scope；
        // 2.类的声明在引用之前，其scope对象已经被建立起来。
        if (ctx.bop != null && ctx.bop.getType() == PlayScriptParser.DOT) {
            // 这是个左递归，要不断的把左边的节点的计算结果存到node2Symbol，所以要在exitExpression里操作
            Symbol symbol = cr.node2Symbol.get(ctx.expression(0));
            if (symbol instanceof Variable && ((Variable) symbol).type instanceof Class) {
                Class theClass = (Class) ((Variable) symbol).type;
                Scope classScope = cr.node2Scope.get(theClass.ctx); // 在类的scope里去查找，不需要改变当前的scope

                if (ctx.IDENTIFIER() != null) {
                    String idName = ctx.IDENTIFIER().getText();
                    Variable variable = cr.findVariable(classScope, idName);
                    if (variable != null) {
                        cr.node2Symbol.put(ctx, variable);
                    } else {
                        cr.log("unable to find field " + idName + " in Class " + theClass.name, ctx);
                    }
                }

            } else {
                cr.log("unable to resolve a class", ctx);
            }
        }

        // 往上冒泡传递
        else if (ctx.primary() != null && ctx.primary().IDENTIFIER() != null) {
            Variable variable = (Variable) cr.node2Symbol.get(ctx.primary());
            cr.node2Symbol.put(ctx, variable);
        }

    }

    @Override
    public void enterClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            String idName = ctx.getText();
            Class theClass = cr.findClass(currentScope, idName);
            cr.node2Type.put(ctx, theClass);
        }
    }

    @Override
    public void enterPrimitiveType(PrimitiveTypeContext ctx) {
        if (ctx.BOOLEAN() != null) {

        }
    }

    @Override
    public void exitFormalParameter(FormalParameterContext ctx) {
        // 设置参数类型
        Type type = cr.node2Type.get(ctx.typeType());
        Variable variable = (Variable) cr.node2Symbol.get(ctx.variableDeclaratorId());
        variable.type = (Type) type;

        // 添加到函数的参数列表里
        if (currentScope instanceof Function){
           ((Function)currentScope).parameters.add(variable);
        }
    }

    @Override
    public void exitTypeType(TypeTypeContext ctx) {
        // 冒泡
        if (ctx.classOrInterfaceType() != null) {
            Type type = (Type) cr.node2Type.get(ctx.classOrInterfaceType());
            cr.node2Type.put(ctx, type);
        }

    }

    @Override
    public void exitVariableDeclarators(VariableDeclaratorsContext ctx) {
        //设置变量类型
        Type type = (Type) cr.node2Type.get(ctx.typeType());

        for (VariableDeclaratorContext child: ctx.variableDeclarator()){
            Variable variable = (Variable) cr.node2Symbol.get(child.variableDeclaratorId());
            variable.type = type;
        }
    }

}