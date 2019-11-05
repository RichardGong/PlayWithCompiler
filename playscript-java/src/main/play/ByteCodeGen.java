package play;

import org.antlr.v4.runtime.ParserRuleContext;
import play.PlayScriptParser.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;


/**
 * 基于AST，产生汇编代码。 限制： 1.目前仅针对macos，64位； 2.仅支持整型，字符串仅支持字面量； 3.运算仅支持加减法。
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

    //当前本地变量的下标，要把方法的参数也算进去
    int localVarIndex = 0;

    //变量名与下标的映射表
    Map<String, Integer> varName2Index = new HashMap<>();


    ///////////////////////////////////////
    // 主控程序
    public byte[] generate(){
        cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);

        //从根节点开始翻译成字节码
        visitProg((ProgContext)at.ast);

        return cw.toByteArray();
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

    ///////////////////////////////////////
    // 继承的visitor方法，用于产生asm代码片段

    @Override
    public Object visitProg(ProgContext ctx) {
        //把全局的变量和函数封装到一个缺省的类中。
        cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC,
                "DefaultPlayClass", null, "java/lang/Object",null);

        //缺省的构造函数
        genDefaultConstructor(cw);

        ////Main函数--序曲
        mv = cw.visitMethod(ACC_PUBLIC  + ACC_STATIC,
                "main",
                "([Ljava/lang/String;)V", //参数类型：String []
                null, null);

        //添加参数args
        mv.visitParameter("args", ACC_PUBLIC);


        ////生成中间的代码
        visitBlockStatements(ctx.blockStatements());


        ////Main函数--尾声
        mv.visitInsn(RETURN);

        //设置操作数栈最大的帧数，以及最大的本地变量数
        mv.visitMaxs(3, 1);

        //结束方法
        mv.visitEnd();

        return null;
    }


/*
    @Override
    public Object visitBlockStatements(BlockStatementsContext ctx) {

        return null;
    }

    @Override
    public Object visitBlockStatement(BlockStatementContext ctx) {

        return null;
    }

    @Override
    public Object visitVariableDeclarators(VariableDeclaratorsContext ctx) {

        return null;
    }
*/

    @Override
    public Object visitVariableDeclarator(VariableDeclaratorContext ctx) {
        String varName = ctx.variableDeclaratorId().getText();

        localVarIndex++;

        varName2Index.put(varName, Integer.valueOf(localVarIndex));

        //mv.visitLocalVariable(varName,"I",null,null,null,localVarIndex++);


        if (ctx.variableInitializer() != null){
            visitVariableInitializer(ctx.variableInitializer());
        }

        return null;
    }



    @Override
    public Object visitVariableDeclaratorId(VariableDeclaratorIdContext ctx) {

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
    public Object visitExpression(ExpressionContext ctx) {
        String address = "";
        // 二元运算
        if (ctx.bop != null && ctx.expression().size() >= 2) {
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
//            case PlayScriptParser.ASSIGN:
//                bodyAsm.append("\tmovl\t").append(right).append(", ").append(left).append("\n");
//                break;
            }
        } else if (ctx.primary() != null) {
            visitPrimary(ctx.primary());
        } else if (ctx.functionCall() != null) {// functionCall
            //address = visitFunctionCall(ctx.functionCall());
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

    @Override
    public Object visitLiteral(LiteralContext ctx) {
        String rtn = "";
        if (ctx.integerLiteral() != null) {
            visitIntegerLiteral(ctx.integerLiteral());
        }
        else if (ctx.STRING_LITERAL() != null) {
            String withQuotationMark = ctx.STRING_LITERAL().getText();
            String withoutQuotationMark = withQuotationMark.substring(1, withQuotationMark.length() - 1);
            //rtn = getStringLiteralAddress(withoutQuotationMark);
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

    /*
    @Override
    public Object visitStatement(StatementContext ctx) {
        String value = "";
        if (ctx.statementExpression != null) {
            value = visitExpression(ctx.statementExpression);
        } else if (ctx.RETURN() != null) {
            if (ctx.expression() != null) {
                value = visitExpression(ctx.expression());
                // 在%eax中设置返回值
                bodyAsm.append("\n\t# 返回值\n");
                if (value.equals("%eax")){
                    bodyAsm.append("\t# 返回值在之前的计算中,已经存入%eax\n");
                }
                else{
                    bodyAsm.append("\tmovl\t" + value + ", %eax\n");
                }
            }
        }
        return value;
    }

    @Override
    public Object visitFunctionCall(FunctionCallContext ctx) {
        String address = "%eax"; // 缺省获得返回值的地方

        String functionName = null;

        Symbol symbol = at.symbolOfNode.get(ctx);

        if (symbol instanceof Function) {
            Function function = (Function) symbol;
            functionName = function.name;
        } else {
            // TODO 临时代码，用于打印输出
            if (ctx.IDENTIFIER().getText().equals("println")) {
                functionName = "printf";
            } else {
                at.log("unable to find function " + ctx.IDENTIFIER().getText(), ctx);
            }
        }

        // 设置参数
        if (ctx.expressionList() != null) {
            int paramOffset = 0;
            int numParams = ctx.expressionList().expression().size();

            // 1. 先计算所有参数的值，这个时候可能会引起栈的变化，用来存放临时变量
            int oldOffset = rspOffset;
            List<String> values = new LinkedList<String>();
            for (int i = 0; i < numParams; i++) {
                values.add(visitExpression(ctx.expressionList().expression(i)));
            }
            int offset1 = rspOffset - oldOffset;

            // 2.扩展栈
            if (numParams > 6) {
                paramOffset = 8 * (numParams - 6) + offset1;
                bodyAsm.append("\n\t# 为参数而扩展栈\n");
                bodyAsm.append("\tsubq\t$").append(paramOffset).append(", %rsp\n");
            }

            // 3.设置参数
            if (numParams > 0) {
                bodyAsm.append("\n\t# 设置参数\n");
            }

            for (int i = 0; i < numParams; i++) {
                String value = values.get(i);
                String paramAddress = "";
                if (i < 6) {
                    if (value.startsWith("ref:")){
                        paramAddress = paramRegisterq[i];
                    }else{
                        paramAddress = paramRegisterl[i];
                    }
                } else {
                    if (i == 6) {
                        paramAddress = "(%rsp)";
                    } else {
                        paramAddress = "" + ((i - 6) * 8) + "(%rsp)";
                    }
                }

                if (value.startsWith("ref:")){
                    //传地址
                    bodyAsm.append("\tleaq\t").append(value.substring(4)).append(", ").append(paramAddress).append("\n");
                }else{
                    bodyAsm.append("\tmovl\t").append(value).append(", ").append(paramAddress).append("\n");
                }
            }

            // 4.调用函数
            bodyAsm.append("\n\t# 调用函数\n");
            bodyAsm.append("\tcallq\t_").append(functionName).append("\n");

            // 5.恢复栈
            if (numParams > 6) {
                paramOffset = 8 * (numParams - 6);
                bodyAsm.append("\n\t# 收回参数的栈空间\n");
                bodyAsm.append("\taddq\t$").append(paramOffset).append(", %rsp\n");
            }

        }

        return address;
    }

    @Override
    public Object visitFunctionDeclaration(FunctionDeclarationContext ctx) {
        // 给所有参数确定地址

        Function function = (Function) at.typeOfNode.get(ctx);
        for (int i = 0; i < function.parameters.size(); i++) {
            if (i < 6) {
                // 少于6个参数，使用寄存器
                localVars.put(function.parameters.get(i), paramRegisterl[i]);
            } else {
                int paramOffset = (i - 6) * 8 + 16; // 参数在栈中相对于%rbp的偏移量
                String paramAddress = "" + paramOffset + "(%rbp)";
                localVars.put(function.parameters.get(i), paramAddress);
            }
        }

        return visitFunctionBody(ctx.functionBody());
    }

    @Override
    public Object visitFunctionBody(FunctionBodyContext ctx) {
        String value = null;
        if (ctx.block() != null) {
            value = visitBlock(ctx.block());
        }
        return value;
    }

    */

    @Override
    public Object visitBlock(BlockContext ctx) {
        return visitBlockStatements(ctx.blockStatements());
    }

    @Override
    public Object visitExpressionList(ExpressionListContext ctx) {
        return super.visitExpressionList(ctx);
    }

    @Override
    public Object visitFormalParameter(FormalParameterContext ctx) {
        return super.visitFormalParameter(ctx);
    }

    @Override
    public Object visitFormalParameterList(FormalParameterListContext ctx) {
        return super.visitFormalParameterList(ctx);
    }

    @Override
    public Object visitFormalParameters(FormalParametersContext ctx) {
        return super.visitFormalParameters(ctx);
    }

    @Override
    public Object visitPrimitiveType(PrimitiveTypeContext ctx) {
        return super.visitPrimitiveType(ctx);
    }

    @Override
    public Object visitTypeType(TypeTypeContext ctx) {
        return super.visitTypeType(ctx);
    }

}