/**
 * 一个报表引擎的示意性实现，展示其中用到的编译技术。
 */

package report;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import report.parser.*;

public class PlayReport {
    Map<String, String> region2DB = new HashMap<String, String>();

    public PlayReport() {
      
    }

    public String renderReport(ReportTemplate template, TabularData data){
        StringBuffer sb = new StringBuffer();

        //输出表格头
        for (String columnHeader: template.columnHeaders){
            sb.append(columnHeader).append('\t');
        }
        sb.append("\n");

        //编译报表的每个字段
        List<ParseTree> fieldASTs = new LinkedList<ParseTree>();
        for (String fieldExpr : template.fields){
            ParseTree tree = parse(fieldExpr);
            fieldASTs.add(tree);
        }

        //为每一行做计算，并执行
        FieldEvaluator evaluator = new FieldEvaluator(data);
        for (int row = 0; row< data.getNumRows(); row++){
            evaluator.setRowIndex(row);
            for (ParseTree tree: fieldASTs){
                Object value = evaluator.visit(tree);
                sb.append(value).append("\t");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public ParseTree parse(String exp) {
        // 词法解析
        PlayReportLexer lexer = new PlayReportLexer(CharStreams.fromString(exp));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 语法解析
        PlayReportParser parser = new PlayReportParser(tokens);
        ParseTree tree = parser.bracedExpression();

        // 以lisp格式打印AST
        System.out.println(tree.toStringTree(parser));

        return tree;
    }


    public static void main(String args[]) {
        System.out.println("Play Report!");

        PlayReport report = new PlayReport();
        //report.parse("{=sales_amount/num_person}");

        //打印报表1
        String reportString = report.renderReport(ReportTemplate.sampleReport1(), TabularData.sampleData());
        System.out.println(reportString);

        //打印报表2
        reportString = report.renderReport(ReportTemplate.sampleReport2(), TabularData.sampleData());
        System.out.println(reportString);
    }

}