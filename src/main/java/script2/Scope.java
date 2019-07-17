package script2;

import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

public class Scope {
    //上一级的Scope
    protected Scope enclosingScope; 

    //下一级的Scope 
    protected List<Scope> children = new LinkedList<Scope>();

    //该Scope中的成员，包括变量、方法、类等。
    protected List<Symbol> symbols = new LinkedList<Symbol>();

    //产生Scope那个AST节点
    protected ParserRuleContext ctx = null;

    public Scope() {
    }

    public Scope(Scope enclosingScope) {
        this.enclosingScope = enclosingScope;
        if (enclosingScope != null) {
            enclosingScope.children.add(this);
        }
    }

    public boolean isRoot() {
        return (enclosingScope == null);
    }


    /**
     * 在下级节点中根据context查找Scope。用于...
     * 
     * @param context
     * @return
     */
    // public Scope findDescendantByContext(ParserRuleContext context){
    // Scope rtn = null;
    // for(Scope scope : children){
    // if (scope.context == context){
    // rtn = scope;
    // break;
    // }
    // }

    // if (rtn == null){
    // for(Scope scope : children){
    // rtn = scope.findDescendantByContext(context);
    // if (rtn != null){
    // break;
    // }
    // }
    // }

    // return rtn;
    // }
}