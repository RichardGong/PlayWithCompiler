package script;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Calculator {
    public static void main(String args[]) {
        String script = "2+6%3;";
        PlayScriptLexer lexer = new PlayScriptLexer(CharStreams.fromString(script));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlayScriptParser parser = new PlayScriptParser(tokens);
        ParseTree tree = parser.additiveExpression();
        CalcVisitor visitor = new CalcVisitor();
        Integer result = visitor.visit(tree);
        System.out.println(result);
    }
}