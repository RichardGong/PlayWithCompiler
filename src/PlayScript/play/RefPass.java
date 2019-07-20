package play;

import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import play.PlayScriptParser.BlockContext;
import play.PlayScriptParser.ClassDeclarationContext;
import play.PlayScriptParser.ClassOrInterfaceTypeContext;
import play.PlayScriptParser.EnhancedForControlContext;
import play.PlayScriptParser.ExpressionContext;
import play.PlayScriptParser.FloatLiteralContext;
import play.PlayScriptParser.FormalParameterContext;
import play.PlayScriptParser.FunctionCallContext;
import play.PlayScriptParser.FunctionDeclarationContext;
import play.PlayScriptParser.FunctionTypeContext;
import play.PlayScriptParser.IntegerLiteralContext;
import play.PlayScriptParser.LiteralContext;
import play.PlayScriptParser.PrimaryContext;
import play.PlayScriptParser.PrimitiveTypeContext;
import play.PlayScriptParser.ProgContext;
import play.PlayScriptParser.StatementContext;
import play.PlayScriptParser.TypeListContext;
import play.PlayScriptParser.TypeTypeContext;
import play.PlayScriptParser.TypeTypeOrVoidContext;
import play.PlayScriptParser.VariableDeclaratorContext;
import play.PlayScriptParser.VariableDeclaratorIdContext;
import play.PlayScriptParser.VariableDeclaratorsContext;

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
    public void exitPrimary(PrimaryContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            // TODO其实可能需要通过上级节点的要求，选择合适的成员。有时候会有变量和函数同名的情况。
            String idName = ctx.IDENTIFIER().getText();
            Variable variable = cr.findVariable(currentScope, idName);
            if (variable == null) {
                // 看看是不是函数
                Function function = cr.findFunction(currentScope, idName, null); // TODO 应该由上面传递下类型属性下来，然后精确比对
                if (function != null) {
                    cr.node2Symbol.put(ctx, function);
                    cr.node2Type.put(ctx, function);
                } else {
                    cr.log("unknown variable or function: " + idName, ctx);
                }

            } else {
                cr.node2Symbol.put(ctx, variable);

                // 记录类型
                cr.node2Type.put(ctx, variable.type);

                //记录所引用的外部变量
                if (currentScope instanceof Function && variable.enclosingScope != currentScope){
                    List<Variable> referedVariables = cr.outerReference.get(currentScope);
                    if (referedVariables == null){
                        referedVariables = new LinkedList<Variable>();
                        cr.outerReference.put(currentScope,referedVariables);
                    }
                    if(!referedVariables.contains(variable)){
                        referedVariables.add(variable);
                    }
                }
            }
        } else if (ctx.literal() != null) {
            cr.node2Type.put(ctx, cr.node2Type.get(ctx.literal()));
        } else if (ctx.expression() != null) {
            cr.node2Type.put(ctx, cr.node2Type.get(ctx.expression()));
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
        // && ctx.parent.parent instanceof VariableDeclaratorsContext) {
        // VariableDeclaratorsContext vdc = (VariableDeclaratorsContext)
        // ctx.parent.parent;
        // if (vdc.typeType().classOrInterfaceType() != null) {
        // variable.type = (Type)
        // cr.node2Symbol.get(vdc.typeType().classOrInterfaceType());
        // }
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
        //TODO 临时代码，支持println
        if(ctx.IDENTIFIER().getText().equals("println")){
            return;
        }

        // 获得参数类型
        List<Type> paramTypes = new LinkedList<Type>();
        if (ctx.expressionList() != null) {
            for (ExpressionContext exp : ctx.expressionList().expression()) {
                Type type = cr.node2Type.get(exp);
                paramTypes.add(type);
            }
        }

        Function function = null;
        // 看看是不是在被作为类的方法调用，从而确定正确的查找范围
        if (ctx.parent instanceof ExpressionContext) {
            ExpressionContext exp = (ExpressionContext) ctx.parent;
            if (exp.bop != null && exp.bop.getType() == PlayScriptParser.DOT) {
                // 这是个左递归，要不断的把左边的节点的计算结果存到node2Symbol，所以要在exitExpression里操作
                Symbol symbol = cr.node2Symbol.get(exp.expression(0));
                if (symbol instanceof Variable && ((Variable) symbol).type instanceof Class) {
                    Class theClass = (Class) ((Variable) symbol).type;
                    Scope classScope = cr.node2Scope.get(theClass.ctx); // 在类的scope里去查找，不需要改变当前的scope

                    if (ctx.IDENTIFIER() != null) {
                        String idName = ctx.IDENTIFIER().getText();
                        function = cr.findFunction(classScope, idName, paramTypes);
                        if (function != null) {
                            cr.node2Symbol.put(exp, function);
                            cr.node2Type.put(exp, function.returnType);
                            cr.node2Symbol.put(ctx, function); // 父节点也加上
                            cr.node2Type.put(ctx, function.returnType);
                        } else {
                            cr.log("unable to find field " + idName + " in Class " + theClass.name, exp);
                        }
                    }

                } else {
                    cr.log("unable to resolve a class", ctx);
                }
            }
        }

        if (function == null && ctx.IDENTIFIER() != null) {
            String idName = ctx.IDENTIFIER().getText();
            function = cr.findFunction(currentScope, idName, paramTypes); // TODO 要更精确的查找方法
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
                    cr.node2Type.put(ctx, theClass); // 这次函数调用是返回一个对象
                } 

                //看看是不是一个函数型的变量
                if (function == null){
                    Variable variable = cr.findVariable(currentScope, idName);
                    if (variable.type instanceof FunctionType){
                        cr.node2Symbol.put(ctx, variable);
                        cr.node2Type.put(ctx, variable.type);
                    }
                    else{
                        cr.log("unknown function or class constructor or function variable: " + idName, ctx);
                    }
                }
                
            } else {
                cr.node2Symbol.put(ctx, function);
                cr.node2Type.put(ctx, function.returnType);
            }
        }
    }

    @Override
    public void enterFunctionDeclaration(FunctionDeclarationContext ctx) {
        // 把方法的签名存到符号表中,目前不支持方法的重载，每个方法名称必须唯一，并且也不能跟变量名称冲突
        String idName = ctx.IDENTIFIER().getText();
        Function function = new Function(idName, currentScope, ctx);

        cr.types.add(function);
        // cr.type2Node.put(function, ctx);

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
        if (ctx.typeTypeOrVoid() != null) {
            Function function = (Function) currentScope;
            function.returnType = cr.node2Type.get(ctx.typeTypeOrVoid());
        }

        popScope();
    }

    // @Override
    // public void enterConstructorDeclaration(ConstructorDeclarationContext ctx) {
    // String idName = ctx.IDENTIFIER().getText();
    // Function function = new Function(idName, currentScope, ctx);

    // currentScope.symbols.add(function);

    // // 创建一个新的scope
    // pushScope(function, ctx);
    // }

    // @Override
    // public void exitConstructorDeclaration(ConstructorDeclarationContext ctx) {
    // popScope();
    // }

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
                        cr.node2Type.put(ctx, variable.type);
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
            Symbol symbol = cr.node2Symbol.get(ctx.primary());
            cr.node2Symbol.put(ctx, symbol);
        }

        // 设置类型
        if (ctx.primary() != null) {
            cr.node2Type.put(ctx, cr.node2Type.get(ctx.primary()));
        } else if (ctx.functionCall() != null) {
            cr.node2Type.put(ctx, cr.node2Type.get(ctx.functionCall()));
        } else if (ctx.bop != null && ctx.expression().size() >= 2) {
            Type type1 = cr.node2Type.get(ctx.expression(0));
            Type type2 = cr.node2Type.get(ctx.expression(1));
            Type type = null;

            switch (ctx.bop.getType()) {
            case PlayScriptParser.ADD:
            case PlayScriptParser.SUB:
            case PlayScriptParser.MUL:
            case PlayScriptParser.DIV:
                if (type1 == PrimitiveType.String || type2 == PrimitiveType.String) {
                    type = PrimitiveType.String;
                } else if (type1 == PrimitiveType.Double || type2 == PrimitiveType.Double) {
                    type = PrimitiveType.Double;
                } else if (type1 == PrimitiveType.Float || type2 == PrimitiveType.Float) {
                    type = PrimitiveType.Float;
                } else if (type1 == PrimitiveType.Long || type2 == PrimitiveType.Long) {
                    type = PrimitiveType.Long;
                } else if (type1 == PrimitiveType.Integer || type2 == PrimitiveType.Integer) {
                    type = PrimitiveType.Integer;
                } else if (type1 == PrimitiveType.Short || type2 == PrimitiveType.Short) {
                    type = PrimitiveType.Short;
                } else {
                    type = PrimitiveType.Byte; // TODO 以上这些规则有没有漏洞？
                }
                break;
            case PlayScriptParser.EQUAL:
            case PlayScriptParser.LE:
            case PlayScriptParser.LT:
            case PlayScriptParser.GE:
            case PlayScriptParser.GT:
                type = PrimitiveType.Boolean;
                break;
            case PlayScriptParser.ASSIGN:
            case PlayScriptParser.ADD_ASSIGN:
            case PlayScriptParser.SUB_ASSIGN:
            case PlayScriptParser.MUL_ASSIGN:
            case PlayScriptParser.DIV_ASSIGN:
            case PlayScriptParser.AND_ASSIGN:
            case PlayScriptParser.OR_ASSIGN:
            case PlayScriptParser.XOR_ASSIGN:
            case PlayScriptParser.MOD_ASSIGN:
            case PlayScriptParser.LSHIFT_ASSIGN:
            case PlayScriptParser.RSHIFT_ASSIGN:
            case PlayScriptParser.URSHIFT_ASSIGN:
                type = type1;
                break;
            }

            cr.node2Type.put(ctx, type);
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
    public void exitFormalParameter(FormalParameterContext ctx) {
        // 设置参数类型
        Type type = cr.node2Type.get(ctx.typeType());
        Variable variable = (Variable) cr.node2Symbol.get(ctx.variableDeclaratorId());
        variable.type = (Type) type;

        // 添加到函数的参数列表里
        if (currentScope instanceof Function) {
            ((Function) currentScope).parameters.add(variable);
        }
    }

    @Override
    public void exitTypeType(TypeTypeContext ctx) {
        // 冒泡
        if (ctx.classOrInterfaceType() != null) {
            Type type = (Type) cr.node2Type.get(ctx.classOrInterfaceType());
            cr.node2Type.put(ctx, type);
        } else if (ctx.functionType() != null) {
            Type type = (Type) cr.node2Type.get(ctx.functionType());
            cr.node2Type.put(ctx, type);
        } else if (ctx.primitiveType() != null) {
            Type type = (Type) cr.node2Type.get(ctx.primitiveType());
            cr.node2Type.put(ctx, type);
        }

    }

    @Override
    public void exitVariableDeclarators(VariableDeclaratorsContext ctx) {
        // 设置变量类型
        Type type = (Type) cr.node2Type.get(ctx.typeType());

        for (VariableDeclaratorContext child : ctx.variableDeclarator()) {
            Variable variable = (Variable) cr.node2Symbol.get(child.variableDeclaratorId());
            variable.type = type;
        }
    }

    @Override
    public void exitFunctionType(FunctionTypeContext ctx) {
        DefaultFunctionType functionType = new DefaultFunctionType();
        cr.types.add(functionType);

        cr.node2Type.put(ctx, functionType);

        functionType.returnType = (Type) cr.node2Type.get(ctx.typeTypeOrVoid());

        // 参数的类型
        if (ctx.typeList() != null) {
            TypeListContext tcl = (TypeListContext) ctx.typeList();
            for (TypeTypeContext ttc : tcl.typeType()) {
                Type type = (Type) cr.node2Type.get(ttc);
                functionType.paramTypes.add(type);
            }
        }
    }

    @Override
    public void exitPrimitiveType(PrimitiveTypeContext ctx) {
        Type type = null;
        if (ctx.BOOLEAN() != null) {
            type = PrimitiveType.Boolean;
        } else if (ctx.INT() != null) {
            type = PrimitiveType.Integer;
        } else if (ctx.LONG() != null) {
            type = PrimitiveType.Long;
        } else if (ctx.FLOAT() != null) {
            type = PrimitiveType.Float;
        } else if (ctx.DOUBLE() != null) {
            type = PrimitiveType.Double;
        } else if (ctx.BYTE() != null) {
            type = PrimitiveType.Byte;
        } else if (ctx.SHORT() != null) {
            type = PrimitiveType.Short;
        } else if (ctx.CHAR() != null) {
            type = PrimitiveType.Char;
        }

        cr.node2Type.put(ctx, type);
    }

    @Override
    public void exitTypeTypeOrVoid(TypeTypeOrVoidContext ctx) {
        if (ctx.VOID() != null) {
            cr.node2Type.put(ctx, VoidType.voidType);
        } else if (ctx.typeType() != null) {
            cr.node2Type.put(ctx, (Type) cr.node2Type.get(ctx.typeType()));
        }
    }

    @Override
    public void exitFloatLiteral(FloatLiteralContext ctx) {
        cr.node2Type.put(ctx, PrimitiveType.Float);
    }

    @Override
    public void exitIntegerLiteral(IntegerLiteralContext ctx) {
        cr.node2Type.put(ctx, PrimitiveType.Integer);
    }

    @Override
    public void exitLiteral(LiteralContext ctx) {
        if (ctx.BOOL_LITERAL() != null) {
            cr.node2Type.put(ctx, PrimitiveType.Boolean);
        } else if (ctx.CHAR_LITERAL() != null) {
            cr.node2Type.put(ctx, PrimitiveType.Char);
        } else if (ctx.NULL_LITERAL() != null) {
            cr.node2Type.put(ctx, PrimitiveType.Null);
        } else if (ctx.STRING_LITERAL() != null) {
            cr.node2Type.put(ctx, PrimitiveType.String);
        } else if (ctx.integerLiteral() != null) {
            cr.node2Type.put(ctx, PrimitiveType.Integer);
        } else if (ctx.floatLiteral() != null) {
            cr.node2Type.put(ctx, PrimitiveType.Float);
        }

    }

}