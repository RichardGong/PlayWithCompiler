package script2;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class Symbol {
    protected String name = null;
    protected Scope scope = null;

    protected int visibility = 0;

    //Symbol关联的AST节点，便于查错
    ParserRuleContext ctx = null;
}