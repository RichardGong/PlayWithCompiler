/**
 * 一个报表引擎的示意性实现，展示其中用到的编译技术。
 */

package report;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import report.parser.*;

public class PlayReport {
    Map<String, String> region2DB = new HashMap<String, String>();

    public PlayReport() {
      
    }

    // public String getDBName(String sql) {
    //     // 词法解析
    //     SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(sql));
    //     CommonTokenStream tokens = new CommonTokenStream(lexer);

    //     // 语法解析
    //     SQLiteParser parser = new SQLiteParser(tokens);
    //     ParseTree tree = parser.sql_stmt();

    //     // 以lisp格式打印AST
    //     System.out.println(tree.toStringTree(parser));

    //     // 获得select语句的要素
    //     SQLVisitor visitor = new SQLVisitor();
    //     SelectStmt select = (SelectStmt) visitor.visit(tree);

    //     return dbName;
    // }

    public static void main(String args[]) {
        System.out.println("Play Report!");
    }

}