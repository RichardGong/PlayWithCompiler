package play;

import org.objectweb.asm.Label;
import play.PlayScriptParser.*;

import java.util.HashMap;
import java.util.Map;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;


/**
 * 测试把playscript生成字节码的示例程序。
 *
 * 机制：
 * 1.生成一个DefaultPlayClass.class
 *
 * 2.全局的代码，封装到main()方法中。
 *
 * 3.函数变成了DefaultPlayClass的方法。
 *
 * 4.目前特性：
 * (1)数据类型只支持int
 * (2)加减乘除运算
 * (3)变量声明和初始化
 * (4)函数声明和调用
 * (5)println()系统函数，参数目前也只支持一个整数。
 *
 * 5.运行示例程序： java play.PlayScript -bc bytecode.play
 */
public class ByteCodeGen extends PlayScriptBaseVisitor<Object> implements Opcodes{

    // 之前的编译结果
    private AnnotatedTree at = null;

    public ByteCodeGen(AnnotatedTree at) {
        this.at = at;
    }

    ///////////////////////////////////////
    // 一些中间变量
    //创建一个ClassWriter
    ClassWriter cw = null;

    //当前的MethodVisitor
    MethodVisitor mv = null;

    //下一个本地变量的下标，要把方法的参数也算进去
    int localVarIndex = 0;

    //变量名与下标的映射表
    Map<String, Integer> varName2Index = new HashMap<>();

    //是否产生了renturn语句。这是没有经过数据流检查的，所以是不严密的。
    boolean returnGenerated = false;

    //this在参数中的位置。main方法中，我们存在1号位置。普通方法中，是在0好位置
    int instanceIndex = 0;


    ///////////////////////////////////////
    // 主控程序
    public byte[] generate(){
        cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);

        //创建main函数
        visitProg((ProgContext)at.ast);

        //创建其他函数
        for (Type type : at.types){
            if (type instanceof Function){
                Function function = (Function) type;
                FunctionDeclarationContext ctx = (FunctionDeclarationContext)function.ctx;

                genMethod(ctx);
            }
        }

        return cw.toByteArray();
    }


    ///////////////////////////////////////
    // 继承的visitor方法，用于产生asm代码片段

    @Override
    public Object visitProg(ProgContext ctx) {
        //把全局的变量和函数封装到一个缺省的类中。
        cw.visit(Opcodes.V1_8, ACC_PUBLIC + ACC_SUPER,
                "DefaultPlayClass", null, "java/lang/Object",null);

        //缺省的构造函数
        genDefaultConstructor(cw);

        ////Main函数--序曲
        mv = cw.visitMethod(ACC_PUBLIC  + ACC_STATIC,
                "main",
                "([Ljava/lang/String;)V", //参数类型：String []
                null, null);

        //mv.visitCode();
        Label l0 = new Label();
        mv.visitLabel(l0);

        //添加参数args
        mv.visitParameter("args", ACC_PUBLIC);


        ////创建一个DefaultPlayClass的实例，并存到下标为1的位置
        //new
        mv.visitTypeInsn(NEW,"DefaultPlayClass");
        //dup
        mv.visitInsn(DUP);
        mv.visitMethodInsn(INVOKESPECIAL,"DefaultPlayClass","<init>","()V", false);
        mv.visitVarInsn(ASTORE, 1);

        localVarIndex = 1;
        instanceIndex = 1;


        ////生成中间的代码
        visitBlockStatements(ctx.blockStatements());


        ////Main函数--尾声
        mv.visitInsn(RETURN);

        Label l1 = new Label();
        mv.visitLabel(l1);

        //设置本地变量，这一定要放在最后
        for (String varName : varName2Index.keySet()){
            int varIndex = varName2Index.get(varName).intValue();
            mv.visitLocalVariable(varName,"I",null, l0, l1, varIndex);
        }

        //设置操作数栈最大的帧数，以及最大的本地变量数
        mv.visitMaxs(3, 1);

        //结束方法
        mv.visitEnd();

        return null;
    }


    @Override
    public Object visitVariableDeclarator(VariableDeclaratorContext ctx) {
        String varName = ctx.variableDeclaratorId().getText();

        localVarIndex++;

        varName2Index.put(varName, Integer.valueOf(localVarIndex));

        if (ctx.variableInitializer() != null){
            visitVariableInitializer(ctx.variableInitializer());
        }

        return null;
    }


    @Override
    public Object visitVariableInitializer(VariableInitializerContext ctx) {
        //把初始化值压到栈里
        if (ctx.expression() != null) {
            visitExpression(ctx.expression());
        }

        //把栈里的数据存到变量里去
        mv.visitVarInsn(ISTORE, localVarIndex);

        return null;
    }

    @Override
    public Object visitStatement(StatementContext ctx) {
        if (ctx.statementExpression != null) {
            visitExpression(ctx.statementExpression);
        } else if (ctx.RETURN() != null) {
            if (ctx.expression() != null) {
                visitExpression(ctx.expression());

                mv.visitInsn(IRETURN);  //返回整数
            }
            else {
                mv.visitInsn(RETURN);
            }

            returnGenerated = true;
        }
        return null;
    }

    @Override
    public Object visitExpression(ExpressionContext ctx) {
        String address = "";

        //赋值
        if (ctx.bop != null && ctx.bop.getType() == PlayScriptParser.ASSIGN){
            //左侧必须是一个左值，现在只考虑变量名
            if (ctx.expression(0).primary() != null && ctx.expression(0).primary().IDENTIFIER() != null) {
                String varName = ctx.expression(0).getText();
                int varIndex = varName2Index.get(varName).intValue();

                //右边必须是一个右值
                visitExpression(ctx.expression(1));

                //设置变量的值
                mv.visitVarInsn(ISTORE, varIndex);
            }
        }

        // 二元运算
        else if (ctx.bop != null && ctx.expression().size() >= 2) {
            visitExpression(ctx.expression(0));
            visitExpression(ctx.expression(1));
            switch (ctx.bop.getType()) {
            case PlayScriptParser.ADD:
                mv.visitInsn(IADD);
                break;
            case PlayScriptParser.SUB:
                mv.visitInsn(ISUB);
                break;
            case PlayScriptParser.MUL:
                mv.visitInsn(IMUL);
                break;
            case PlayScriptParser.DIV:
                mv.visitInsn(IDIV);
                break;
            }
        } else if (ctx.primary() != null) {
            visitPrimary(ctx.primary());
        } else if (ctx.functionCall() != null) {// functionCall
            visitFunctionCall(ctx.functionCall());
        }
        return address;
    }

    @Override
    public Object visitPrimary(PrimaryContext ctx) {
        String rtn = "";
        if (ctx.literal() != null) {
            visitLiteral(ctx.literal()); // 直接操作数
        } else if (ctx.IDENTIFIER() != null) {
            Symbol symbol = at.symbolOfNode.get(ctx);
            if (symbol instanceof Variable) {
                Variable variable = (Variable) symbol;
                int varIndex = varName2Index.get(variable.getName());

                mv.visitVarInsn(ILOAD, varIndex);
            }
        }
        return rtn;
    }

    //只支持整数常量
    @Override
    public Object visitLiteral(LiteralContext ctx) {
        String rtn = "";
        if (ctx.integerLiteral() != null) {
            visitIntegerLiteral(ctx.integerLiteral());
        }
        else if (ctx.STRING_LITERAL() != null) {
//            String withQuotationMark = ctx.STRING_LITERAL().getText();
//            String withoutQuotationMark = withQuotationMark.substring(1, withQuotationMark.length() - 1);
        }
        return rtn;
    }

    @Override
    public Object visitIntegerLiteral(IntegerLiteralContext ctx) {
        int value = 0;
        if (ctx.DECIMAL_LITERAL() != null) {
            value = Integer.valueOf(ctx.DECIMAL_LITERAL().getText()).intValue();
        }

        //0-5之间的数字，直接用快捷指令
        if (value >= 0 && value <= 5) {
            switch (value) {
                case 0:
                    mv.visitInsn(ICONST_0);
                    break;
                case 1:
                    mv.visitInsn(ICONST_1);
                    break;
                case 2:
                    mv.visitInsn(ICONST_2);
                    break;
                case 3:
                    mv.visitInsn(ICONST_3);
                    break;
                case 4:
                    mv.visitInsn(ICONST_4);
                    break;
                case 5:
                    mv.visitInsn(ICONST_5);
                    break;
            }
        }

        //如果是8位整数，用bipush指令，直接放在后面的一个字节的操作数里就行了
        else if (value >= -128 && value <128){
            mv.visitIntInsn(BIPUSH, value);
        }

        //如果是16位整数，用sipush指令
        else if (value >= -32768 && value <32768){
            mv.visitIntInsn(SIPUSH, value);
        }

        //大于16位的，采用ldc指令，从常量池中去取
        else{
            mv.visitLdcInsn(new Integer(value));
        }

        return null;
    }

    @Override
    public Object visitFunctionCall(FunctionCallContext ctx) {
        Function function = null;

        Symbol symbol = at.symbolOfNode.get(ctx);

        if (symbol instanceof Function) {
            function = (Function) symbol;
        } else {
            // TODO 临时代码，用于打印输出
            if (ctx.IDENTIFIER().getText().equals("println")) {

                //调用System.out.println()方法
                genPrintln(ctx.expressionList().expression(0));

                return null;

            } else {
                at.log("unable to find function " + ctx.IDENTIFIER().getText(), ctx);
            }
        }

        //把对象示例放入栈，作为第一个参数
        mv.visitVarInsn(ALOAD, instanceIndex);

        //设置参数
        if (ctx.expressionList() != null) {
            visitExpressionList(ctx.expressionList());
        }

        //调用方法
        mv.visitMethodInsn(INVOKEVIRTUAL,"DefaultPlayClass", function.getName(),
                genFunctionDescriptor(function),false);

        return null;
    }



    @Override
    public Object visitFunctionDeclaration(FunctionDeclarationContext ctx){
        //在这里不做任何事情，阻断缺省的遍历逻辑
        return null;
    }


    //根据函数生成方法。是在main函数生成完毕以后调用。
    private void genMethod(FunctionDeclarationContext ctx) {
        //重置中间变量
        localVarIndex = 0; //第0个参数是this
        varName2Index = new HashMap<>();
        instanceIndex = 0;

        Function function = (Function) at.node2Scope.get(ctx);

        mv = cw.visitMethod(ACC_PUBLIC,
                function.getName(),
                genFunctionDescriptor(function),
                null, null);

        //mv.visitCode();
        Label l0 = new Label();
        mv.visitLabel(l0);

        //添加参数
        for (Variable param : function.parameters){
            mv.visitParameter(param.getName(), ACC_PUBLIC);
            localVarIndex++;   //参数也存在栈桢中的本地变量列表中。
            varName2Index.put(param.getName(), Integer.valueOf(localVarIndex));
        }

        int lastParamIndex = localVarIndex;


        ////生成中间的代码
        visitFunctionBody(ctx.functionBody());


        ////Main函数--尾声

        if(!returnGenerated) {
            mv.visitInsn(RETURN);
        }

        Label l1 = new Label();
        mv.visitLabel(l1);

        //设置本地变量，这一定要放在最后
        for (String varName : varName2Index.keySet()){
            int varIndex = varName2Index.get(varName).intValue();
            if (varIndex > lastParamIndex) {
                mv.visitLocalVariable(varName, "I", null, l0, l1, varIndex);
            }
        }

        //设置操作数栈最大的帧数，以及最大的本地变量数
        mv.visitMaxs(3, 1);

        //结束方法
        mv.visitEnd();
    }


    ///////////////////////////////////////
    ///一些工具方法
    //创建缺省构造方法
    private static void genDefaultConstructor(ClassWriter cw){
        MethodVisitor constructor = cw.visitMethod(ACC_PUBLIC, "<init>",
                "()V", null, null);

        constructor.visitCode();
        constructor.visitVarInsn(ALOAD, 0);
        constructor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        constructor.visitInsn(RETURN);
        constructor.visitMaxs(1,1);
        constructor.visitEnd();
    }

    //产生对System.out.println方法的调用。
    private void genPrintln(ExpressionContext ctx){
        //getstatic     #5                  // Field java/lang/System.out:Ljava/io/PrintStream;
        mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");

        //计算参数
        visitExpression(ctx);

        mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);
    }



    //形成函数的描述符。参数只支持int型的，返回值只支持void和int。
    private String genFunctionDescriptor(Function function){
        StringBuffer sb = new StringBuffer();
        sb.append('(');

        for (int i = 0; i < function.parameters.size(); i++){
            sb.append('I');
        }

        sb.append(')');

        if (function.getReturnType() instanceof  VoidType){
            sb.append('V');
        }
        else{
            sb.append('I');
        }

        return sb.toString();
    }


}