package report;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import report.parser.*;
import report.parser.PlayReportParser.BracedExpressionContext;
import report.parser.PlayReportParser.ExpressionContext;
import report.parser.PlayReportParser.ExpressionListContext;
import report.parser.PlayReportParser.FloatLiteralContext;
import report.parser.PlayReportParser.FunctionCallContext;
import report.parser.PlayReportParser.IntegerLiteralContext;
import report.parser.PlayReportParser.LiteralContext;
import report.parser.PlayReportParser.PrimaryContext;

public class FieldEvaluator extends PlayReportBaseVisitor<Object> {

    // 报表数据
    private TabularData data = null;

    // 当前行
    private int rowIndex = 0;

    public FieldEvaluator(TabularData data) {
        this.data = data;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
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
                rtn = add(left, right, type);
                break;
            case PlayReportParser.SUB:
                rtn = minus(left, right, type);
                break;
            case PlayReportParser.MUL:
                rtn = mul(left, right, type);
                break;
            case PlayReportParser.DIV:
                rtn = div(left, right, type);
                break;
            case PlayReportParser.EQUAL:
                rtn = EQ(left, right, type);
                break;
            case PlayReportParser.LE:
                rtn = LE(left, right, type);
                break;
            case PlayReportParser.LT:
                rtn = LT(left, right, type);
                break;
            case PlayReportParser.GE:
                rtn = GE(left, right, type);
                break;
            case PlayReportParser.GT:
                rtn = GT(left, right, type);
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
            int colIndex = data.fieldNames.indexOf(fieldName);
            rtn = data.cols.get(colIndex).get(rowIndex);
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
            String functionFieldName = ctx.getText();
            if (!data.fieldNames.contains(functionFieldName)) {
                //计算参数列
                String fieldName = ctx.expressionList().expression(0).getText();
                if (!data.fieldNames.contains(fieldName)) {
                    addCalculatedField(ctx.expressionList().expression(0));
                }
                //计算rank
                List<Object> paramCol = data.cols.get(data.fieldNames.indexOf(fieldName));
                List<Object> sorted = paramCol.stream().sorted().collect(Collectors.toList());
                
                List<Object> rank = new ArrayList<>(paramCol.size());
                int numRows = data.getNumRows();
                for (Object obj: paramCol){
                    int index = sorted.indexOf(obj);
                    rank.add(numRows-index);
                }

                //增加一列
                data.addColumn(functionFieldName, rank);
            }

            int colIndex = data.fieldNames.indexOf(functionFieldName);
            rtn = data.cols.get(colIndex).get(rowIndex);
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

    // 根据公式，往数据源里添加一个计算字段
    private void addCalculatedField(ExpressionContext ctx) {
        int oldRowIndex = rowIndex;
        List<Object> calcedColumn = new ArrayList<Object>();
        int numRows = data.getNumRows();
        for (int row = 0; row < numRows ; row++) {
            rowIndex = row;
            Object value = visitExpression(ctx);
            calcedColumn.add(value);
        }
        String fieldName = ctx.getText();
        data.addColumn(fieldName, calcedColumn);
        rowIndex = oldRowIndex;
    }

    ///////////////////////////////////////////////////////////
    /// 工具性的方法

    private PrimitiveType calcType(Object obj1, Object obj2) {
        PrimitiveType type = PrimitiveType.String;

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

    private Object add(Object obj1, Object obj2, PrimitiveType targetType) {
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

    private Object minus(Object obj1, Object obj2, PrimitiveType targetType) {
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

    private Object mul(Object obj1, Object obj2, PrimitiveType targetType) {
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

    private Object div(Object obj1, Object obj2, PrimitiveType targetType) {
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

    private Object EQ(Object obj1, Object obj2, PrimitiveType targetType) {
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

    private Object GE(Object obj1, Object obj2, PrimitiveType targetType) {
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

    private Object GT(Object obj1, Object obj2, PrimitiveType targetType) {
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

    private Object LE(Object obj1, Object obj2, PrimitiveType targetType) {
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

    private Object LT(Object obj1, Object obj2, PrimitiveType targetType) {
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