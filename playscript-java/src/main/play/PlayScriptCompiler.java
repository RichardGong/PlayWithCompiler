package play;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * 把词法分析、语法分析、语义分析和解释执行封装在一起。
 */
public class PlayScriptCompiler {

    public AnnotatedTree Compile(String script) {
        AnnotatedTree at = new AnnotatedTree();

        //词法分析
        PlayScriptLexer lexer = new PlayScriptLexer(CharStreams.fromString(script));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //语法分析
        PlayScriptParser parser = new PlayScriptParser(tokens);
        at.ast = parser.prog();

        //打印AST，以lisp格式
        System.out.println(at.ast.toStringTree(parser));

        //语义分析
        ParseTreeWalker walker = new ParseTreeWalker();
        
        //多步的语义解析。
        //优点：1.代码更清晰；2.允许使用在声明之前，这在支持面向对象、递归函数等特征时是必须的。
        //pass1：类型和Scope
        TypeAndScopeScanner pass1 = new TypeAndScopeScanner(at);
        walker.walk(pass1,at.ast);

        //pass2：把变量、类继承、函数声明的类型都解析出来。也就是所有声明时用到类型的地方。
        TypeResolver pass2 = new TypeResolver(at);
        walker.walk(pass2,at.ast);

        //pass3：消解有的变量应用、函数引用。另外还做了类型的推断。
        RefResolver pass3 = new RefResolver(at);
        walker.walk(pass3,at.ast);

        //pass4：类型检查
        TypeChecker pass4 = new TypeChecker(at);
        walker.walk(pass4,at.ast);

        //pass5：其他语义检查


        //显示一下语义解析结果
        System.out.println(at.getScopeTreeString());

        return at;
    }

    public Object Execute(AnnotatedTree at) {
        ASTEvaluator visitor = new ASTEvaluator(at);
        Object result = visitor.visit(at.ast);
        return result;
    }
}