package play;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * 把词法分析、语法分析、语义分析和解释执行简单地封装在一起。
 */
public class PlayScriptCompiler {

    AnnotatedTree at = null;
    PlayScriptLexer lexer = null;
    PlayScriptParser parser = null;

    public AnnotatedTree compile(String script, boolean verbose, boolean ast_dump) {
        at = new AnnotatedTree();

        //词法分析
        lexer = new PlayScriptLexer(CharStreams.fromString(script));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //语法分析
        parser = new PlayScriptParser(tokens);
        at.ast = parser.prog();

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
        SematicValidator pass5 = new SematicValidator(at);
        walker.walk(pass5,at.ast);

        //pass6：做闭包的分析
        ClosureAnalyzer closureAnalyzer = new ClosureAnalyzer(at);
        closureAnalyzer.analyzeClosures();

        //打印AST
        if (verbose || ast_dump){
            dumpAST();
        }

        //打印符号表
        if(verbose){
            dumpSymbols();
        }

        return at;
    }

    public AnnotatedTree compile(String script) {
        return  compile(script,false, false);
    }

    /**
     * 打印符号表
     */
    public void dumpSymbols(){
        if (at != null){
            System.out.println(at.getScopeTreeString());
        }
    }

    /**
     * 打印AST，以lisp格式
     */
    public void dumpAST(){
        if (at!=null) {
            System.out.println(at.ast.toStringTree(parser));
        }
    }

    /**
     * 输出编译信息
     */
    public void dumpCompilationLogs(){
        if (at != null){
            for (CompilationLog log : at.logs){
                System.out.println(log);
            }
        }
    }

    public Object Execute(AnnotatedTree at) {
        ASTEvaluator visitor = new ASTEvaluator(at);
        Object result = visitor.visit(at.ast);
        return result;
    }
}