package playdb;

import java.util.List;

/**
 * 保存select查询语句的概要信息
 */
public class SelectStmt {
    public String tableName = null;
    public List<WhereExpr> whereExprs = null;

    public SelectStmt(String tableName, List<WhereExpr> whereExprs){
        this.tableName = tableName;
        this.whereExprs = whereExprs;
    }
}