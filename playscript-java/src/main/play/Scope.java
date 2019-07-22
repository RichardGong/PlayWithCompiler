package play;

import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class Scope extends Symbol{
    // 该Scope中的成员，包括变量、方法、类等。
    protected List<Symbol> symbols = new LinkedList<Symbol>();

    // 产生Scope那个AST节点
    protected ParserRuleContext ctx = null;

    // 是否能在该Scope中访问这个symbol，包括层层的enclosingScope
    protected boolean accessible(Symbol symbol){
        boolean rtn = false;
        rtn = symbols.contains(symbol);
        if (!rtn && enclosingScope!=null){
            rtn = enclosingScope.accessible(symbol);
        }
        return rtn;
    }
}