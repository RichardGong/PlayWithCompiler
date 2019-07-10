package script2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

public class Scope {
    protected Scope parent;
    protected List<Scope> children = new LinkedList<Scope>();
    protected ParserRuleContext context = null;
    // protected Map<String, Object> variables = new HashMap<String, Object>();
    protected Map<String, Symbol> symbols = new HashMap<String, Symbol>();

    public Scope(ParserRuleContext context) {
        this.context = context;
    }

    public Scope(Scope parent, ParserRuleContext context) {
        this.parent = parent;
        parent.children.add(this);
        this.context = context;
    }

    public boolean isRoot() {
        return (parent == null);
    }

    /**
     * 在下级节点中根据context查找Scope
     * @param context
     * @return
     */
    public Scope findDescendantByContext(ParserRuleContext context){
        Scope rtn = null;
        for(Scope scope : children){
            if (scope.context == context){
                rtn = scope;
                break;
            }
        }

        if (rtn == null){
            for(Scope scope : children){
                rtn = scope.findDescendantByContext(context);
                if (rtn != null){
                    break;
                }
            }
        }

        return rtn;
    }

}