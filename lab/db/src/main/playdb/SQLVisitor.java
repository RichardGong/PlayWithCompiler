package playdb;

import java.util.LinkedList;
import java.util.List;

import playdb.parser.*;
import playdb.parser.SQLiteParser.Any_nameContext;
import playdb.parser.SQLiteParser.Column_nameContext;
import playdb.parser.SQLiteParser.ExprContext;
import playdb.parser.SQLiteParser.Factored_select_stmtContext;
import playdb.parser.SQLiteParser.Literal_valueContext;
import playdb.parser.SQLiteParser.Result_columnContext;
import playdb.parser.SQLiteParser.Select_coreContext;
import playdb.parser.SQLiteParser.Sql_stmtContext;
import playdb.parser.SQLiteParser.Table_nameContext;
import playdb.parser.SQLiteParser.Table_or_subqueryContext;

public class SQLVisitor extends SQLiteBaseVisitor<Object> {

    @Override
    public Object visitSql_stmt(Sql_stmtContext ctx) {
        Object result = null;
        if(ctx.factored_select_stmt() != null &&
            ctx.factored_select_stmt().select_core().size() > 0){
                result = visitSelect_core(ctx.factored_select_stmt().select_core(0));
        }
        return result;
        
    }

    @Override
    @SuppressWarnings("unchecked")
    public Object visitSelect_core(Select_coreContext ctx) {
        Object result = null;

        String tableName = null;

        List<WhereExpr> whereExprs = null;
        

        if (ctx.K_FROM()!= null){
            if (ctx.table_or_subquery().size()>0){
                tableName = (String)visitTable_or_subquery(ctx.table_or_subquery(0));
            }
        }
        if (ctx.K_WHERE() != null){
            if (ctx.expr().size() > 0){
                whereExprs = (List<WhereExpr>)visitExpr(ctx.expr(0));
            }
        }

        result = new SelectStmt(tableName, whereExprs);
        
        return result;
    }

    @Override
    public Object visitAny_name(Any_nameContext ctx) {
        Object result = null;
        System.out.println(ctx.toString());
        if (ctx.IDENTIFIER()!= null){
            result = ctx.IDENTIFIER().getText();
        }
        return result;
    }

    @Override
    public Object visitColumn_name(Column_nameContext ctx) {
        Object result = null;
        if (ctx.any_name() != null){
            result = visitAny_name(ctx.any_name());
        }
        return result;
    }

    @Override
    public Object visitFactored_select_stmt(Factored_select_stmtContext ctx) {
        Object result = null;
        return result;
    }

    @Override
    public Object visitResult_column(Result_columnContext ctx) {
        Object result = null;
        return result;
    }

    @Override
    public Object visitTable_name(Table_nameContext ctx) {
        Object result = null;
        if (ctx.any_name()!= null){
            result = visitAny_name(ctx.any_name());
        }
        return result;
    }

    @Override
    public Object visitTable_or_subquery(Table_or_subqueryContext ctx) {
        Object result = null;
        if (ctx.table_name()!= null){
            result = visitTable_name(ctx.table_name());
        }
        return result;
    }

    @Override
    public Object visitExpr(ExprContext ctx) {
        Object result = null;
        if (ctx.K_AND() != null){
            Object left = visitExpr(ctx.expr(0));
            Object right = visitExpr(ctx.expr(1));
            List<WhereExpr> list = new LinkedList<WhereExpr>();
            addWhereExpr(list, left);
            addWhereExpr(list,right);
            result = list;
        }
        else if (ctx.ASSIGN()!=null){
            String left = (String)visitExpr(ctx.expr(0));
            String right =(String)visitExpr(ctx.expr(1));
            result = new WhereExpr(left, "=", right);
        }
        else if (ctx.literal_value()!=null){
            result = visitLiteral_value(ctx.literal_value());
        }
        else if(ctx.column_name() != null){
            result = visitColumn_name(ctx.column_name());
        }
        return result;
    }

    @Override
    public Object visitLiteral_value(Literal_valueContext ctx) {
        Object result = null;
            if (ctx.STRING_LITERAL() != null){
                result = ctx.STRING_LITERAL().getText();
            }
        return result;
    }

    @SuppressWarnings("unchecked")
    private void addWhereExpr(List<WhereExpr> list, Object obj){
        if (obj instanceof WhereExpr){
            list.add((WhereExpr)obj);
        }
        else if (obj instanceof List ){
            list.addAll((List<WhereExpr>) obj);
        }
    }


}