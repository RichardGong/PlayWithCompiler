package script2;

import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class Scope extends Symbol{
    // 该Scope中的成员，包括变量、方法、类等。
    protected List<Symbol> symbols = new LinkedList<Symbol>();

    // 产生Scope那个AST节点
    protected ParserRuleContext ctx = null;

    
    // public ParserRuleContext getASTNode() {
    //     return ctx;
    // }

    // public Scope getEnclosingScope() {
    //     return enclosingScope;
    // }

    // public List<Symbol> symbols() {
    //     return symbols;
    // }
}