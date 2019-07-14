package script2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Scope {
    protected Scope parent;
    protected List<Scope> children = new LinkedList<Scope>();
    protected HashSet<Symbol> symbols = new HashSet<Symbol>();

    public Scope() {
    }

    public Scope(Scope parent) {
        this.parent = parent;
        if (parent !=null){
            parent.children.add(this);
        }
    }

    public boolean isRoot() {
        return (parent == null);
    }

    /**
     * 在下级节点中根据context查找Scope。用于...
     * @param context
     * @return
     */
    // public Scope findDescendantByContext(ParserRuleContext context){
    //     Scope rtn = null;
    //     for(Scope scope : children){
    //         if (scope.context == context){
    //             rtn = scope;
    //             break;
    //         }
    //     }

    //     if (rtn == null){
    //         for(Scope scope : children){
    //             rtn = scope.findDescendantByContext(context);
    //             if (rtn != null){
    //                 break;
    //             }
    //         }
    //     }

    //     return rtn;
    // }

}