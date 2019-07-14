package script2;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class PlayScript {
    public static void main(String args[]) {
        //String script = "45+10*2;";
        //String script = "int age = 44; { int i = 10; age+i;}";
        //String script = "int age = 44; for(int i = 0;i<10;i++) { age = age + 2;} int i = 8;";
        //String script = "int b= 10; int myfunc(int a) {return a+b+3;} myfunc(2);";
        String script = "class myclass{int a=2; int b; }  myclass c = new myclass(); c.a;";
        // String script = "class myclass{int a; int b; myclass(){a=1; b=2;} int calc(){return a + b;} }  myclass c = new myclass(); c.calc();";
        PlayScriptLexer lexer = new PlayScriptLexer(CharStreams.fromString(script));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlayScriptParser parser = new PlayScriptParser(tokens);
        ParseTree tree = parser.prog();
        
        ParseTreeWalker walker = new ParseTreeWalker();
        AttributeAnalyzer analyzer = new AttributeAnalyzer();
        walker.walk(analyzer, tree);
        
        ObjectVisitor visitor = new ObjectVisitor(analyzer.node2Symbol, analyzer.node2Scope, analyzer.scopeTree);
        Object result = visitor.visit(tree);
        System.out.println(result);
    }
}