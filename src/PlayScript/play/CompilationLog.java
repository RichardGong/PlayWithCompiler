package play;

import org.antlr.v4.runtime.ParserRuleContext;

/**
 * 记录编译过程中产生的信息。
 */
public class CompilationLog {
    protected String message = null;

    protected int line;
    protected int positionInLine;

    // 相关的AST节点
    protected ParserRuleContext ctx;

    // log的类型，包括信息、警告、错误。
    protected int type = INFO;

    public static int INFO = 0;
    public static int WARNING = 1;
    public static int ERROR = 2;

    @Override
    public String toString() {
        return message + " @" + line + ":" + positionInLine;
    }

    
}