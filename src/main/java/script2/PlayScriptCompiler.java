package script2;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class PlayScriptCompiler {

    public CompilationRecord Compile(String script) {
        CompilationRecord cr = new CompilationRecord();

        PlayScriptLexer lexer = new PlayScriptLexer(CharStreams.fromString(script));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlayScriptParser parser = new PlayScriptParser(tokens);
        cr.ast = parser.prog();

        ParseTreeWalker walker = new ParseTreeWalker();
        RefPass refPass = new RefPass(cr);
        walker.walk(refPass, cr.ast);

        return cr;
    }

    public Object Execute(CompilationRecord cr) {
        ASTEvaluator visitor = new ASTEvaluator(cr);
        Object result = visitor.visit(cr.ast);
        return result;
    }
}