package script2;

import org.antlr.v4.runtime.ParserRuleContext;

public class Class extends Type {
    // class的属性
    //protected List<Variable> fields = new LinkedList<Variable>();
    //protected List<Function> functions = new LinkedList<Function>();

    protected Class(String name, Scope enclosingScope, ParserRuleContext ctx) {
        this.name = name;
        this.enclosingScope = enclosingScope;
        this.ctx = ctx;
    }
}