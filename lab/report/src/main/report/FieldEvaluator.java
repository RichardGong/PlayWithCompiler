package report;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import report.parser.*;
import report.parser.PlayReportParser.BracedExpressionContext;
import report.parser.PlayReportParser.ExpressionContext;
import report.parser.PlayReportParser.ExpressionListContext;
import report.parser.PlayReportParser.FloatLiteralContext;
import report.parser.PlayReportParser.FunctionCallContext;
import report.parser.PlayReportParser.IntegerLiteralContext;
import report.parser.PlayReportParser.LiteralContext;
import report.parser.PlayReportParser.PrimaryContext;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class FieldEvaluator extends PlayReportBaseVisitor<Object> {

    // 报表数据
    private TabularData data = null;

    private Add add = new Add();
    private Minus minus = new Minus();
    private Mul mul = new Mul();
    private Div div = new Div();
    private EQ eq = new EQ();
    private GE ge = new GE();
    private GT gt = new GT();
    private LE le = new LE();
    private LT lt = new LT();

    public FieldEvaluator(TabularData data) {
        this.data = data;
    }

    @Override
    public Object visitBracedExpression(BracedExpressionContext ctx) {
        return visitExpression(ctx.expression());
    }

    @Override
    public Object visitExpression(ExpressionContext ctx) {
        Object rtn = null;
        if (ctx.bop != null && ctx.expression().size() >= 2) {
            Object left = visitExpression(ctx.expression(0));
            Object right = visitExpression(ctx.expression(1));

            PrimitiveType type = calcType(left, right);

            switch (ctx.bop.getType()) {
            case PlayReportParser.ADD:
                rtn = add.vectorOp(left, right, type);
                break;
            case PlayReportParser.SUB:
                rtn = minus.vectorOp(left, right, type);
                break;
            case PlayReportParser.MUL:
                rtn = mul.vectorOp(left, right, type);
                break;
            case PlayReportParser.DIV:
                rtn = div.vectorOp(left, right, type);
                break;
            case PlayReportParser.EQUAL:
                rtn = eq.vectorOp(left, right, type);
                break;
            case PlayReportParser.LE:
                rtn = le.vectorOp(left, right, type);
                break;
            case PlayReportParser.LT:
                rtn = lt.vectorOp(left, right, type);
                break;
            case PlayReportParser.GE:
                rtn = ge.vectorOp(left, right, type);
                break;
            case PlayReportParser.GT:
                rtn = gt.vectorOp(left, right, type);
                break;
            default:
                break;
            }

        } else if (ctx.primary() != null) {
            rtn = visitPrimary(ctx.primary());

        } else if (ctx.functionCall() != null) {
            rtn = visitFunctionCall(ctx.functionCall());
        }
        return rtn;
    }

    @Override
    public Object visitPrimary(PrimaryContext ctx) {
        Object rtn = null;
        if (ctx.literal() != null) {
            rtn = visitLiteral(ctx.literal());
        } else if (ctx.IDENTIFIER() != null) {
            String fieldName = ctx.IDENTIFIER().getText();
            rtn = data.getField(fieldName);
        }
        return rtn;
    }

    @Override
    public Object visitLiteral(LiteralContext ctx) {
        Object rtn = null;
        if (ctx.integerLiteral() != null) {
            rtn = visitIntegerLiteral(ctx.integerLiteral());
        } else if (ctx.floatLiteral() != null) {
            rtn = visitFloatLiteral(ctx.floatLiteral());
        } else if (ctx.BOOL_LITERAL() != null) {
            if (ctx.BOOL_LITERAL().getText().equals("true")) {
                rtn = Boolean.TRUE;
            } else {
                rtn = Boolean.FALSE;
            }
        } else if (ctx.STRING_LITERAL() != null) {
            String withQuotationMark = ctx.STRING_LITERAL().getText();
            rtn = withQuotationMark.substring(1, withQuotationMark.length() - 1);
        } else if (ctx.CHAR_LITERAL() != null) {
            rtn = ctx.CHAR_LITERAL().getText().charAt(0);
        }
        return rtn;
    }

    @Override
    public Object visitFloatLiteral(FloatLiteralContext ctx) {
        return Float.valueOf(ctx.getText());
    }

    @Override
    public Object visitIntegerLiteral(IntegerLiteralContext ctx) {
        Object rtn = null;
        if (ctx.DECIMAL_LITERAL() != null) {
            rtn = Integer.valueOf(ctx.DECIMAL_LITERAL().getText());
        }
        return rtn;
    }

    @Override
    public Object visitFunctionCall(FunctionCallContext ctx) {
        Object rtn = null;
        String functionName = ctx.IDENTIFIER().getText().toLowerCase();
        if (functionName.equals("rank")) {
            rtn = rank(ctx);
        }
        else if (functionName.equals("max")) {
            rtn = max(ctx);
        }
        else if (functionName.equals("sum")) {
            rtn = sum(ctx);
        }
        else if (functionName.equals("runningsum")) {
            rtn = runningSum(ctx);
        }

        return rtn;

    }

    @Override
    public Object visitExpressionList(ExpressionListContext ctx) {
        Object rtn = null;
        for (ExpressionContext child : ctx.expression()) {
            rtn = visitExpression(child);
        }
        return rtn;
    }

    //////////////////////////////////////////////////////////
    // 内置函数

    // 求排序值（向量）
    private Object rank(FunctionCallContext ctx) {
        Object rtn = null;
        String functionFieldName = ctx.getText();

        if (!data.hasField(functionFieldName)) {
            // 计算参数列
            String fieldName = ctx.expressionList().expression(0).getText();
            if (!data.hasField(fieldName)) {
                addCalculatedField(ctx.expressionList().expression(0));
            }

            Object rank = null;
            // 计算rank
            if (data.getField(fieldName) instanceof List<?>) {
                List<Object> paramCol = (List<Object>) data.getField(fieldName);
                List<Object> sorted = paramCol.stream().sorted().collect(Collectors.toList());

                List<Object> rankList = new ArrayList<>(paramCol.size());
                rank = rankList;
                int numRows = data.getNumRows();
                for (Object obj : paramCol) {
                    int index = sorted.indexOf(obj);
                    rankList.add(numRows - index);
                }
            } else { // 标量
                rank = 1;
            }

            // 增加一个字段
            data.setField(functionFieldName, rank);
        }

        rtn = data.getField(functionFieldName);

        return rtn;
    }

    // 求最大值（标量）
    private Object max(FunctionCallContext ctx) {
        Object rtn = null;
        String functionFieldName = ctx.getText();

        if (!data.hasField(functionFieldName)) {
            // 计算参数列
            String fieldName = ctx.expressionList().expression(0).getText();
            if (!data.hasField(fieldName)) {
                addCalculatedField(ctx.expressionList().expression(0));
            }

            // 计算max
            Object max = null;
            Object field = data.getField(fieldName);
            if (field instanceof List<?>) {
                List<Object> paramCol = (List<Object>) field;
                if (paramCol.size() > 0) {
                    if (paramCol.get(0) instanceof Integer) {
                        max = paramCol.stream().mapToInt(x -> (Integer) x).max().getAsInt();
                    } else if (paramCol.get(0) instanceof Long) {
                        max = paramCol.stream().mapToLong(x -> (Long) x).max().getAsLong();
                    } else if (paramCol.get(0) instanceof Double) {
                        max = paramCol.stream().mapToDouble(x -> (Double) x).max().getAsDouble();
                    }
                }
            } else { // 标量
                max = field;
            }

            // 增加一个field
            data.setField(functionFieldName, max);
        }

        rtn = data.getField(functionFieldName);

        return rtn;
    }

    // 求汇总值（标量）
    private Object sum(FunctionCallContext ctx) {
        Object rtn = null;
        String functionFieldName = ctx.getText();

        if (!data.hasField(functionFieldName)) {
            // 计算参数列
            String fieldName = ctx.expressionList().expression(0).getText();
            if (!data.hasField(fieldName)) {
                addCalculatedField(ctx.expressionList().expression(0));
            }

            // 计算sum
            Object sum = null;
            Object field = data.getField(fieldName);
            if (field instanceof List<?>) {
                List<Object> paramCol = (List<Object>) field;
                if (paramCol.size() > 0) {
                    if (paramCol.get(0) instanceof Integer) {
                        sum = paramCol.stream().mapToInt(x -> (Integer) x).sum();
                    } else if (paramCol.get(0) instanceof Long) {
                        sum = paramCol.stream().mapToLong(x -> (Long) x).sum();
                    } else if (paramCol.get(0) instanceof Double) {
                        sum = paramCol.stream().mapToDouble(x -> (Double) x).sum();
                    }
                }
            } else { // 标量
                sum = field;
            }

            // 增加一个field
            data.setField(functionFieldName, sum);
        }

        rtn = data.getField(functionFieldName);

        return rtn;
    }

    // 求累计汇总值（向量）
    private Object runningSum(FunctionCallContext ctx) {
        Object rtn = null;
        String functionFieldName = ctx.getText();

        if (!data.hasField(functionFieldName)) {
            // 计算参数列
            String fieldName = ctx.expressionList().expression(0).getText();
            if (!data.hasField(fieldName)) {
                addCalculatedField(ctx.expressionList().expression(0));
            }

            Object runningSum = null;

            // 计算rank
            if (data.getField(fieldName) instanceof List<?>) {
                List<Object> paramCol = (List<Object>) data.getField(fieldName);
                runningSum = new ArrayList<>(paramCol.size());
                if (paramCol.size() > 0){
                    if (paramCol.get(0) instanceof Integer){
                        Integer iSum = 0;
                        for (Object o: paramCol){
                            iSum += (Integer)o;
                            ((List<Object>)runningSum).add(iSum);
                        }
                    }
                    else if (paramCol.get(0) instanceof Long){
                        Long lSum = 0L;
                        for (Object o: paramCol){
                            lSum += (Long)o;
                            ((List<Object>)runningSum).add(lSum);
                        }
                    }
                    else if (paramCol.get(0) instanceof Double){
                        Double dSum = 0.0;
                        for (Object o: paramCol){
                            dSum += (Double)o;
                            ((List<Object>)runningSum).add(dSum);
                        }
                    }
                }
                
            } else { // 标量
                runningSum = data.getField(fieldName);
            }

            // 增加一个字段
            data.setField(functionFieldName, runningSum);
        }

        rtn = data.getField(functionFieldName);

        return rtn;
    }

    // 根据公式，往数据源里添加一个计算字段
    private void addCalculatedField(ExpressionContext ctx) {
        Object value = visitExpression(ctx);
        String fieldName = ctx.getText();
        data.setField(fieldName, value);
    }

    ///////////////////////////////////////////////////////////
    /// 工具性的方法

    private PrimitiveType calcType(Object obj1, Object obj2) {
        PrimitiveType type = PrimitiveType.String;

        // 处理向量的情况
        if (obj1 instanceof List<?> && ((List<Object>) obj1).size() > 0) {
            obj1 = ((List<Object>) obj1).get(0);
        }

        if (obj2 instanceof List<?> && ((List<Object>) obj2).size() > 0) {
            obj2 = ((List<Object>) obj2).get(0);
        }

        if (obj1 instanceof String || obj2 instanceof String) {
            type = PrimitiveType.String;
        } else if (obj1 instanceof Double || obj2 instanceof Double) {
            type = PrimitiveType.Double;
        } else if (obj1 instanceof Float || obj2 instanceof Float) {
            type = PrimitiveType.Float;
        } else if (obj1 instanceof Long || obj2 instanceof Long) {
            type = PrimitiveType.Long;
        } else if (obj1 instanceof Integer || obj2 instanceof Integer) {
            type = PrimitiveType.Integer;
        }

        return type;
    }

    private abstract class BinaryOp {
        // 支持向量运算
        public Object vectorOp(Object obj1, Object obj2, PrimitiveType targetType) {
            Object rtn = null;

            List<Object> list1 = null;
            Object data2 = null;
            if (obj1 instanceof List<?>) {
                list1 = (List<Object>) obj1;
                data2 = obj2;
            } else if (obj2 instanceof List<?>) {
                list1 = (List<Object>) obj2;
                data2 = obj1;
            }

            if (list1 != null) {
                List<Object> vector = new ArrayList<Object>();
                for (int i = 0; i < list1.size(); i++) {
                    Object o1 = list1.get(i);
                    Object o2 = data2;
                    if (data2 instanceof List<?>) {
                        o2 = ((List<Object>) data2).get(i);
                    }
                    Object value = op(o1, o2, targetType);
                    vector.add(value);
                }
                rtn = vector;
            } else {
                rtn = op(obj1, obj2, targetType);
            }

            return rtn;
        }

        protected abstract Object op(Object obj1, Object obj2, PrimitiveType targetType);
    }

    private class Add extends BinaryOp {
        protected Object op(Object obj1, Object obj2, PrimitiveType targetType) {
            Object rtn = null;
            if (targetType == PrimitiveType.String) {
                rtn = String.valueOf(obj1) + String.valueOf(obj2);
            } else if (targetType == PrimitiveType.Integer) {
                rtn = ((Number) obj1).intValue() + ((Number) obj2).intValue();
            } else if (targetType == PrimitiveType.Float) {
                rtn = ((Number) obj1).floatValue() + ((Number) obj2).floatValue();
            } else if (targetType == PrimitiveType.Long) {
                rtn = ((Number) obj1).longValue() + ((Number) obj2).longValue();
            } else if (targetType == PrimitiveType.Double) {
                rtn = ((Number) obj1).doubleValue() + ((Number) obj2).doubleValue();
            } else if (targetType == PrimitiveType.Short) {
                rtn = ((Number) obj1).shortValue() + ((Number) obj2).shortValue();
            }

            return rtn;
        }
    }

    private class Minus extends BinaryOp {
        protected Object op(Object obj1, Object obj2, PrimitiveType targetType) {
            Object rtn = null;
            if (targetType == PrimitiveType.Integer) {
                rtn = ((Number) obj1).intValue() - ((Number) obj2).intValue();
            } else if (targetType == PrimitiveType.Float) {
                rtn = ((Number) obj1).floatValue() - ((Number) obj2).floatValue();
            } else if (targetType == PrimitiveType.Long) {
                rtn = ((Number) obj1).longValue() - ((Number) obj2).longValue();
            } else if (targetType == PrimitiveType.Double) {
                rtn = ((Number) obj1).doubleValue() - ((Number) obj2).doubleValue();
            } else if (targetType == PrimitiveType.Short) {
                rtn = ((Number) obj1).shortValue() - ((Number) obj2).shortValue();
            }

            return rtn;
        }
    }

    private class Mul extends BinaryOp {
        protected Object op(Object obj1, Object obj2, PrimitiveType targetType) {
            Object rtn = null;
            if (targetType == PrimitiveType.Integer) {
                rtn = ((Number) obj1).intValue() * ((Number) obj2).intValue();
            } else if (targetType == PrimitiveType.Float) {
                rtn = ((Number) obj1).floatValue() * ((Number) obj2).floatValue();
            } else if (targetType == PrimitiveType.Long) {
                rtn = ((Number) obj1).longValue() * ((Number) obj2).longValue();
            } else if (targetType == PrimitiveType.Double) {
                rtn = ((Number) obj1).doubleValue() * ((Number) obj2).doubleValue();
            } else if (targetType == PrimitiveType.Short) {
                rtn = ((Number) obj1).shortValue() * ((Number) obj2).shortValue();
            }

            return rtn;
        }
    }

    private class Div extends BinaryOp {
        protected Object op(Object obj1, Object obj2, PrimitiveType targetType) {
            Object rtn = null;
            if (targetType == PrimitiveType.Integer) {
                rtn = ((Number) obj1).intValue() / ((Number) obj2).intValue();
            } else if (targetType == PrimitiveType.Float) {
                rtn = ((Number) obj1).floatValue() / ((Number) obj2).floatValue();
            } else if (targetType == PrimitiveType.Long) {
                rtn = ((Number) obj1).longValue() / ((Number) obj2).longValue();
            } else if (targetType == PrimitiveType.Double) {
                rtn = ((Number) obj1).doubleValue() / ((Number) obj2).doubleValue();
            } else if (targetType == PrimitiveType.Short) {
                rtn = ((Number) obj1).shortValue() / ((Number) obj2).shortValue();
            }
            return rtn;
        }
    }

    private class EQ extends BinaryOp {
        protected Object op(Object obj1, Object obj2, PrimitiveType targetType) {
            Object rtn = null;
            if (targetType == PrimitiveType.Integer) {
                rtn = ((Number) obj1).intValue() == ((Number) obj2).intValue();
            } else if (targetType == PrimitiveType.Float) {
                rtn = ((Number) obj1).floatValue() == ((Number) obj2).floatValue();
            } else if (targetType == PrimitiveType.Long) {
                rtn = ((Number) obj1).longValue() == ((Number) obj2).longValue();
            } else if (targetType == PrimitiveType.Double) {
                rtn = ((Number) obj1).doubleValue() == ((Number) obj2).doubleValue();
            } else if (targetType == PrimitiveType.Short) {
                rtn = ((Number) obj1).shortValue() == ((Number) obj2).shortValue();
            }

            return rtn;
        }
    }

    private class GE extends BinaryOp {
        protected Object op(Object obj1, Object obj2, PrimitiveType targetType) {
            Object rtn = null;
            if (targetType == PrimitiveType.Integer) {
                rtn = ((Number) obj1).intValue() >= ((Number) obj2).intValue();
            } else if (targetType == PrimitiveType.Float) {
                rtn = ((Number) obj1).floatValue() >= ((Number) obj2).floatValue();
            } else if (targetType == PrimitiveType.Long) {
                rtn = ((Number) obj1).longValue() >= ((Number) obj2).longValue();
            } else if (targetType == PrimitiveType.Double) {
                rtn = ((Number) obj1).doubleValue() >= ((Number) obj2).doubleValue();
            } else if (targetType == PrimitiveType.Short) {
                rtn = ((Number) obj1).shortValue() >= ((Number) obj2).shortValue();
            }

            return rtn;
        }
    }

    private class GT extends BinaryOp {
        protected Object op(Object obj1, Object obj2, PrimitiveType targetType) {
            Object rtn = null;
            if (targetType == PrimitiveType.Integer) {
                rtn = ((Number) obj1).intValue() > ((Number) obj2).intValue();
            } else if (targetType == PrimitiveType.Float) {
                rtn = ((Number) obj1).floatValue() > ((Number) obj2).floatValue();
            } else if (targetType == PrimitiveType.Long) {
                rtn = ((Number) obj1).longValue() > ((Number) obj2).longValue();
            } else if (targetType == PrimitiveType.Double) {
                rtn = ((Number) obj1).doubleValue() > ((Number) obj2).doubleValue();
            } else if (targetType == PrimitiveType.Short) {
                rtn = ((Number) obj1).shortValue() > ((Number) obj2).shortValue();
            }

            return rtn;
        }
    }

    private class LE extends BinaryOp {
        protected Object op(Object obj1, Object obj2, PrimitiveType targetType) {
            Object rtn = null;
            if (targetType == PrimitiveType.Integer) {
                rtn = ((Number) obj1).intValue() <= ((Number) obj2).intValue();
            } else if (targetType == PrimitiveType.Float) {
                rtn = ((Number) obj1).floatValue() <= ((Number) obj2).floatValue();
            } else if (targetType == PrimitiveType.Long) {
                rtn = ((Number) obj1).longValue() <= ((Number) obj2).longValue();
            } else if (targetType == PrimitiveType.Double) {
                rtn = ((Number) obj1).doubleValue() <= ((Number) obj2).doubleValue();
            } else if (targetType == PrimitiveType.Short) {
                rtn = ((Number) obj1).shortValue() <= ((Number) obj2).shortValue();
            }

            return rtn;
        }
    }

    private class LT extends BinaryOp {
        protected Object op(Object obj1, Object obj2, PrimitiveType targetType) {
            Object rtn = null;
            if (targetType == PrimitiveType.Integer) {
                rtn = ((Number) obj1).intValue() < ((Number) obj2).intValue();
            } else if (targetType == PrimitiveType.Float) {
                rtn = ((Number) obj1).floatValue() < ((Number) obj2).floatValue();
            } else if (targetType == PrimitiveType.Long) {
                rtn = ((Number) obj1).longValue() < ((Number) obj2).longValue();
            } else if (targetType == PrimitiveType.Double) {
                rtn = ((Number) obj1).doubleValue() < ((Number) obj2).doubleValue();
            } else if (targetType == PrimitiveType.Short) {
                rtn = ((Number) obj1).shortValue() < ((Number) obj2).shortValue();
            }

            return rtn;
        }

    }
}