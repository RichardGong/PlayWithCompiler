package script2;

import java.util.HashMap;
import java.util.Map;

public class BlockFrame extends StackFrame {
    Map<Variable, Object> objects = null;

    public BlockFrame(BlockScope scope){
        this.scope = scope;
    }

    @Override
    protected Object getValue(Variable variable) {
        Object rtn = null;
        if (objects != null){
            rtn = objects.get(variable);
        }
        return rtn;
    }

    @Override
    protected void setValue(Variable variable, Object value) {
        if (objects == null){
            objects = new HashMap<Variable, Object>();
        }
    }
}
