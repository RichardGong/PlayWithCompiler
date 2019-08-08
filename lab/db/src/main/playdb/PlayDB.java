/**
 * 分布式数据访问层。能根据传来的SQL，确定所需要连接的数据库，并执行SQL。
 */

package playdb;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import playdb.parser.*;

public class PlayDB {
    Map<String, String> region2DB = new HashMap<String, String>();

    public PlayDB() {
        region2DB.put("SDYT", "db1");
        region2DB.put("BJHD", "db2");
        region2DB.put("FJXM", "db3");
        region2DB.put("SZLG", "db4");
    }

    public String getDBName(String sql) {
        // 词法解析
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 语法解析
        SQLiteParser parser = new SQLiteParser(tokens);
        ParseTree tree = parser.sql_stmt();

        // 以lisp格式打印AST
        System.out.println(tree.toStringTree(parser));

        // 获得select语句的要素
        SQLVisitor visitor = new SQLVisitor();
        SelectStmt select = (SelectStmt) visitor.visit(tree);

        String dbName = null;
        if (select.tableName.equals("orders")) {
            if (select.whereExprs != null) {
                for (WhereExpr expr : select.whereExprs) {
                    // 根据cust_id或order_id来确定库的名称
                    if (expr.columnName.equals("cust_id") || expr.columnName.equals("order_id")) {
                        // 取编号的前4位，即区域编码
                        String region = expr.value.substring(1, 5);
                        // 根据区域编码，获取库名称
                        dbName = region2DB.get(region);
                        break;
                    }
                }
            }
        }
        return dbName;
    }

    public static void main(String args[]) {
        String sql = "select order_id from orders where cust_id = 'SDYT987645' and price > 200";
        PlayDB dl = new PlayDB();
        String dbName = dl.getDBName(sql);
        System.out.println("sql:" + sql);
        System.out.println("db:" + dbName);
    }

}