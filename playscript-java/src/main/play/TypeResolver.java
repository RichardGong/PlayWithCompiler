package play;

import play.PlayScriptParser.*;

/**
 * 第二遍扫描。把变量、类继承、函数声明的类型都解析出来。
 * 也就是所有用到typeTpe的地方。
 */
public class TypeResolver extends PlayScriptBaseListener {

    private AnnotatedTree cr = null;

    public TypeResolver(AnnotatedTree cr) {
        this.cr = cr;
    }

    //设置所声明的变量的类型
    @Override
    public void exitVariableDeclarators(VariableDeclaratorsContext ctx) {
        // 设置变量类型
        Type type = (Type) cr.typeOfNode.get(ctx.typeType());

        for (VariableDeclaratorContext child : ctx.variableDeclarator()) {
            Variable variable = (Variable) cr.symbolOfNode.get(child.variableDeclaratorId());
            variable.type = type;
        }
    }

    //把所有的变量声明加入符号表
    @Override
    public void enterVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
        String idName = ctx.IDENTIFIER().getText();
        Scope scope = cr.enclosingScopeOfNode(ctx);
        Variable variable = new Variable(idName, scope, ctx);

        if (scope instanceof BlockScope){
            if (cr.checkDuplicateVariable(scope, idName)) {
                cr.log("Variable already Declared: " + idName, ctx);
            }
        }

        scope.symbols.add(variable);
        cr.symbolOfNode.put(ctx, variable);
    }

    //设置函数的返回值类型
    @Override
    public void exitFunctionDeclaration(FunctionDeclarationContext ctx) {
        Function function = (Function) cr.node2Scope.get(ctx);
        if (ctx.typeTypeOrVoid() != null) {
            function.returnType = cr.typeOfNode.get(ctx.typeTypeOrVoid());
        }
        else{
            //TODO 如果是类的构建函数，返回值应该是一个类吧？

        }

        //函数查重
        Scope scope = cr.enclosingScopeOfNode(ctx);
        for (Symbol symbol : scope.symbols){
            if (symbol instanceof Function){
                if (function.equals(symbol)){
                    cr.log("Function or method already Declared: " + ctx.getText(), ctx);
                }
            }
        }

    }

    //设置函数的参数的类型，这些参数已经在enterVariableDeclaratorId中作为变量声明了，现在设置它们的类型
    @Override
    public void exitFormalParameter(FormalParameterContext ctx) {
        // 设置参数类型
        Type type = cr.typeOfNode.get(ctx.typeType());
        Variable variable = (Variable) cr.symbolOfNode.get(ctx.variableDeclaratorId());
        variable.type = (Type) type;

        // 添加到函数的参数列表里
        Scope scope = cr.enclosingScopeOfNode(ctx);
        if (scope instanceof Function) {    //TODO 从目前的语法来看，只有function才会使用FormalParameter
            ((Function) scope).parameters.add(variable);
        }
    }

    //设置类的父类
    @Override
    public void enterClassDeclaration(ClassDeclarationContext ctx) {
        Class theClass = (Class) cr.node2Scope.get(ctx);

        //设置父类
        if (ctx.EXTENDS() != null){
            String parentClassName = ctx.typeType().getText();
            Type type = cr.lookupType(parentClassName);
            if (type != null && type instanceof Class){
                theClass.setParentClass ( (Class)type);
            }
            else{
                cr.log("unknown class: " + parentClassName, ctx);
            }
        }

    }


    @Override
    public void exitTypeTypeOrVoid(TypeTypeOrVoidContext ctx) {
        if (ctx.VOID() != null) {
            cr.typeOfNode.put(ctx, VoidType.voidType);
        } else if (ctx.typeType() != null) {
            cr.typeOfNode.put(ctx, (Type) cr.typeOfNode.get(ctx.typeType()));
        }
    }


    @Override
    public void exitTypeType(TypeTypeContext ctx) {
        // 冒泡，将下级的属性标注在本级
        if (ctx.classOrInterfaceType() != null) {
            Type type = (Type) cr.typeOfNode.get(ctx.classOrInterfaceType());
            cr.typeOfNode.put(ctx, type);
        } else if (ctx.functionType() != null) {
            Type type = (Type) cr.typeOfNode.get(ctx.functionType());
            cr.typeOfNode.put(ctx, type);
        } else if (ctx.primitiveType() != null) {
            Type type = (Type) cr.typeOfNode.get(ctx.primitiveType());
            cr.typeOfNode.put(ctx, type);
        }

    }

    @Override
    public void enterClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            Scope scope = cr.enclosingScopeOfNode(ctx);
            String idName = ctx.getText();
            Class theClass = cr.lookupClass(scope, idName);
            cr.typeOfNode.put(ctx, theClass);
        }
    }

    @Override
    public void exitFunctionType(FunctionTypeContext ctx) {
        DefaultFunctionType functionType = new DefaultFunctionType();
        cr.types.add(functionType);

        cr.typeOfNode.put(ctx, functionType);

        functionType.returnType = (Type) cr.typeOfNode.get(ctx.typeTypeOrVoid());

        // 参数的类型
        if (ctx.typeList() != null) {
            TypeListContext tcl = (TypeListContext) ctx.typeList();
            for (TypeTypeContext ttc : tcl.typeType()) {
                Type type = (Type) cr.typeOfNode.get(ttc);
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

        cr.typeOfNode.put(ctx, type);
    }


}