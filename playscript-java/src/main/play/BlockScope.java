package play;

import org.antlr.v4.runtime.ParserRuleContext;

public class BlockScope extends Scope{
    //给block编号的数字
    private static int index = 1;

    protected BlockScope(){
        this.name = "block" +index++;
    }
    
    protected BlockScope(Scope enclosingScope, ParserRuleContext ctx) {
        this.name = "block" +index++;
        this.enclosingScope = enclosingScope;
        this.ctx = ctx;
    }


    @Override
    public String toString(){
        return "Block " + name;
    }

}