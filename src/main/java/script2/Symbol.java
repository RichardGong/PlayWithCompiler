package script2;

import org.antlr.v4.runtime.ParserRuleContext;

/**
 * 符号信息，构成符号表
 */
public class Symbol{
    //String name;
    protected SymbolType symbolType;
    protected int typeType;

    protected Scope scope = null;

    //方法或变量的定义
    protected ParserRuleContext definition = null;

    public Symbol(SymbolType symbolType, Scope scope){
        //this.name = name;
        this.symbolType = symbolType;
        this.scope = scope;
    }
}