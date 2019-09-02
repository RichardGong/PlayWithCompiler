package play;

import org.antlr.v4.runtime.ParserRuleContext;

/*
 * 用来表示"this"关键字的符号
 */
public class Super extends Variable{

    Super(Class theClass, ParserRuleContext ctx){
        super("super", theClass, ctx);
    }

    private Class Class(){
        return (Class) enclosingScope;
    }
}
