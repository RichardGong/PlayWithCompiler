/**
 * 分布式数据访问层。能根据传来的SQL，确定所需要连接的数据库，并执行SQL。
 */

package dsql;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTree;

import dsql.parser.*;

public class DistributedDataLayer {
    public int getDBIndex(String sql) {
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLiteParser parser = new SQLiteParser(tokens);

        ParseTree tree = parser.sql_stmt();

        System.out.println(tree.toStringTree(parser));
        // cr.ast = parser.prog();

        // ParseTreeWalker walker = new ParseTreeWalker();
        // AttributeEvaluator refPass = new AttributeEvaluator(cr);
        // walker.walk(refPass, cr.ast);

        return 0;
    }

    public static void main(String args[]) {
        String sql = "select * from order where cust_id = \"SDYT987645\"".replaceAll("\\\\", "");
        DistributedDataLayer dl = new DistributedDataLayer();
        dl.getDBIndex(sql);
    }

}