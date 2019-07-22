package antlrtest;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class PlayScript {
    public static void main(String args[]) {
        String antlr = "2+6%3;";
        PlayScriptLexer lexer = new PlayScriptLexer(CharStreams.fromString(antlr));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlayScriptParser parser = new PlayScriptParser(tokens);
        ParseTree tree = parser.additiveExpression();
        ASTEvaluator visitor = new ASTEvaluator();
        Integer result = visitor.visit(tree);
        System.out.println(result);
    }
}