package script;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class PlayScript {
    public static void main(String args[]) {
        String script = "2+6%3;";
        PlayScriptLexer lexer = new PlayScriptLexer(CharStreams.fromString(script));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlayScriptParser parser = new PlayScriptParser(tokens);
        ParseTree tree = parser.additiveExpression();
        IntegerVisitor visitor = new IntegerVisitor();
        Integer result = visitor.visit(tree);
        System.out.println(result);
    }
}