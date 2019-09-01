package play;

import org.antlr.v4.runtime.ParserRuleContext;
import play.PlayScriptParser.*;

/**
 * 类型检查。
 * 主要检查:
 * 1.赋值表达式；
 * 2.变量初始化；
 * 3.表达式里的一些运算，比如加减乘除，是否类型匹配；
 * 4.返回值的类型；
 *
 */

public class TypeChecker extends PlayScriptBaseListener {

    private AnnotatedTree at = null;

    public TypeChecker(AnnotatedTree at) {
        this.at = at;
    }


    @Override
    public void exitVariableDeclarator(VariableDeclaratorContext ctx) {
        if (ctx.variableInitializer() != null){
            Variable variable = (Variable) at.symbolOfNode.get(ctx.variableDeclaratorId());
            Type type1 = variable.type;
            Type type2 = at.typeOfNode.get(ctx.variableDeclaratorId());
            checkAssign(type1,type2,ctx,ctx.variableDeclaratorId(),ctx.variableInitializer());
        }
    }

    @Override
    public void exitExpression(ExpressionContext ctx) {
        if (ctx.bop != null && ctx.expression().size() >= 2) {

            Type type1 = at.typeOfNode.get(ctx.expression(0));
            Type type2 = at.typeOfNode.get(ctx.expression(1));

            switch (ctx.bop.getType()) {
                case PlayScriptParser.ADD:
                    //字符串能够跟任何对象做 + 运算
                    if (type1 != PrimitiveType.String && type2 != PrimitiveType.String){
                        checkNumericOperand(type1, ctx, ctx.expression(0));
                        checkNumericOperand(type2, ctx, ctx.expression(1));
                    }
                    break;
                case PlayScriptParser.SUB:
                case PlayScriptParser.MUL:
                case PlayScriptParser.DIV:
                case PlayScriptParser.LE:
                case PlayScriptParser.LT:
                case PlayScriptParser.GE:
                case PlayScriptParser.GT:
                    checkNumericOperand(type1, ctx, ctx.expression(0));
                    checkNumericOperand(type2, ctx, ctx.expression(1));
                    break;
                case PlayScriptParser.EQUAL:
                case PlayScriptParser.NOTEQUAL:

                    break;

                case PlayScriptParser.AND:
                case PlayScriptParser.OR:
                    checkBooleanOperand(type1, ctx, ctx.expression(0));
                    checkBooleanOperand(type2, ctx, ctx.expression(1));
                    break;

                case PlayScriptParser.ASSIGN:
                    checkAssign(type1,type2,ctx,ctx.expression(0),ctx.expression(1));
                    break;

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
                    if (PrimitiveType.isNumeric(type2)) {
                        if (!checkNumericAssign(type2, type1)) {
                            at.log("can not assign " + ctx.expression(1).getText() + " of type " + type2 + " to " + ctx.expression(0) + " of type " + type1, ctx);
                        }
                    }
                    else{
                        at.log("operand + " + ctx.expression(1).getText() + " should be numeric。", ctx );
                    }

                    break;
            }
        }


        //TODO 对各种一元运算做类型检查，比如NOT操作

    }


//    /**
//     * 检查加法的操作数。允许数值和字符串
//     *
//     * @param type
//     * @param exp
//     * @param operand
//     */
//    private void checkAddOperand(Type type, ExpressionContext exp, ExpressionContext operand) {
//        if (!(PrimitiveType.isNumeric(type) || type == PrimitiveType.String)) {
//            at.log("operand for add should be numeric or string: " + operand.getText(), exp);
//        }
//    }

    /**
     * 检查类型是不是数值型的。
     *
     * @param type
     * @param exp
     * @param operand
     */
    private void checkNumericOperand(Type type, ExpressionContext exp, ExpressionContext operand) {
        if (!(PrimitiveType.isNumeric(type))) {
            at.log("operand for arithmetic operation should be numeric : " + operand.getText(), exp);
        }
    }

    /**
     * 检查类型是不是Boolean型的
     *
     * @param type
     * @param exp
     * @param operand
     */
    private void checkBooleanOperand(Type type, ExpressionContext exp, ExpressionContext operand) {
        if (!(type == PrimitiveType.Boolean)) {
            at.log("operand for logical operation should be boolean : " + operand.getText(), exp);
        }
    }

    /**
     * 检查是否能做赋值操作
     * @param type1
     * @param type2
     * @param ctx
     * @param operand1
     * @param operand2
     */
    private void checkAssign(Type type1, Type type2,  ParserRuleContext ctx, ParserRuleContext operand1, ParserRuleContext operand2){
        if (PrimitiveType.isNumeric(type2)) {
            if (!checkNumericAssign(type2, type1)) {
                at.log("can not assign " + operand2.getText() + " of type " + type2 + " to " + operand1.getText() + " of type " + type1, ctx);
            }
        }
        else if (type2 instanceof Class){
            //TODO 检查类的兼容性
        }
        else if (type2 instanceof Function){
            //TODO 检查函数的兼容性
        }
    }

    /**
     * 看一个类型能否赋值成另一个类型，比如：
     * (1) 整型可以转成浮点型；
     * (2) 子类的对象可以赋给父类;
     * (3) 函数赋值，要求签名是一致的。
     * @param from
     * @param to
     * @return
     */
    private boolean checkNumericAssign(Type from, Type to){
        boolean canAssign = false;
        if (to == PrimitiveType.Double){
            canAssign = (PrimitiveType.isNumeric(from));
        }
        else if (to == PrimitiveType.Float){
            canAssign = (from == PrimitiveType.Byte ||
                    from == PrimitiveType.Short ||
                    from == PrimitiveType.Integer ||
                    from == PrimitiveType.Long ||
                    from == PrimitiveType.Float);
        }
        else if (to == PrimitiveType.Long){
            canAssign = (from == PrimitiveType.Byte ||
                    from == PrimitiveType.Short ||
                    from == PrimitiveType.Integer ||
                    from == PrimitiveType.Long);
        }
        else if (to == PrimitiveType.Integer){
            canAssign = (from == PrimitiveType.Byte ||
                    from == PrimitiveType.Short ||
                    from == PrimitiveType.Integer);
        }
        else if (to == PrimitiveType.Short){
            canAssign = (from == PrimitiveType.Byte ||
                    from == PrimitiveType.Short );
        }
        else if (to == PrimitiveType.Byte){
            canAssign = (from == PrimitiveType.Byte);
        }

        return canAssign;
    }

}