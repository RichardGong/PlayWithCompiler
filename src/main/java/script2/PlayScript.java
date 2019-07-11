package script2;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class PlayScript {
    public static void main(String args[]) {
        //String script = "int age = 44; { int i = 10; age+i;}";
        //String script = "45+10*2;";
        //String script = "int age = 44; for(int i = 0;i<10;i++) { age = age + 2;}  int i = 8;";
        String script = "int myfunc(int a) {int b = a+1; return b;} myfunc(2);";
        PlayScriptLexer lexer = new PlayScriptLexer(CharStreams.fromString(script));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlayScriptParser parser = new PlayScriptParser(tokens);
        ParseTree tree = parser.prog();
        
        ParseTreeWalker walker = new ParseTreeWalker();
        AttributeAnalyzer analyzer = new AttributeAnalyzer();
        walker.walk(analyzer, tree);
        
        ObjectVisitor visitor = new ObjectVisitor(analyzer.id2Symbol, analyzer.scopeTree);
        Object result = visitor.visit(tree);
        System.out.println(result);
    }
}