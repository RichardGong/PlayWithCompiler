package play;

import org.antlr.v4.runtime.ParserRuleContext;

/**
 * 用来表示"this"关键字的符号
 */
public class This extends Variable{

    This(Class theClass, ParserRuleContext ctx){
        super("this", theClass, ctx);
    }

    private Class Class(){
        return (Class) enclosingScope;
    }
}
