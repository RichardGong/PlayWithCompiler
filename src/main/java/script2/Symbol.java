package script2;

/**
 * 符号信息，构成符号表
 */
public class Symbol{
    //String name;
    SymbolType symbolType;
    int typeType;

    Scope scope = null;

    public Symbol(SymbolType symbolType, Scope scope){
        //this.name = name;
        this.symbolType = symbolType;
        this.scope = scope;
    }
}