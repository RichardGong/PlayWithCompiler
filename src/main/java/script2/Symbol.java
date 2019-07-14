package script2;

//import org.antlr.v4.runtime.ParserRuleContext;

/**
 * 符号信息，构成符号表
 */
public class Symbol {
    protected String name;
    protected Type type;

    protected Scope scope = null;

    // 方法或变量的定义
    // protected ParserRuleContext definition = null;

    public Symbol(String name, Scope scope) {
        this.name = name;
        this.scope = scope;
    }
    public Symbol(String name, Scope scope, Type type) {
        this.name = name;
        this.type = type;
        this.scope = scope;
    }

    @Override
    public boolean equals(Object obj) {
        Symbol symbol = (Symbol) obj;
        boolean rtn = false;
        if (this.type == symbol.type && this.scope == symbol.scope && this.name.equals(symbol.name)) {
            rtn = true;
        }
        return rtn;
    }

    @Override
    public int hashCode() {
        int rtn = name.hashCode() + scope.hashCode();
        if (type != null){
            rtn += type.hashCode();
        }
        return rtn;
    }

}