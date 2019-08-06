package play;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class PlayScriptCompiler {

    public AnnotatedTree Compile(String script) {
        AnnotatedTree cr = new AnnotatedTree();

        PlayScriptLexer lexer = new PlayScriptLexer(CharStreams.fromString(script));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlayScriptParser parser = new PlayScriptParser(tokens);
        cr.ast = parser.prog();

        ParseTreeWalker walker = new ParseTreeWalker();
        AttributeEvaluator refPass = new AttributeEvaluator(cr);
        walker.walk(refPass, cr.ast);

        return cr;
    }

    public Object Execute(AnnotatedTree cr) {
        ASTEvaluator visitor = new ASTEvaluator(cr);
        Object result = visitor.visit(cr.ast);
        return result;
    }
}