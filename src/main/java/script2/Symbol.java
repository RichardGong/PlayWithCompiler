package script2;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class Symbol {
    //符号的名称
    protected String name = null;

    //所属作用域
    protected Scope scope = null;

    //可见性，比如public还是private
    protected int visibility = 0;

    //Symbol关联的AST节点
    ParserRuleContext ctx = null;
}