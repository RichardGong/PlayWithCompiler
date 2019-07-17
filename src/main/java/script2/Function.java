package script2;

import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

public class Function extends Type {
    // 参数
    protected List<Variable> parameters = new LinkedList<Variable>();
    //返回值
    protected Type returnType = null;

    protected Function(String name, Scope scope, ParserRuleContext ctx) {
        this.name = name;
        this.scope = scope;
        this.ctx = ctx;
    }
}