package play;

public class ObjectFrame extends StackFrame {
    PlayObject object = null;

    public ObjectFrame(PlayObject object){
        this.object = object;
        if (object instanceof ClassObject){
            this.scope = ((ClassObject)object).type;
        } else if (object instanceof FunctionObject){
            this.scope = ((FunctionObject)object).function;
        }
    }

    @Override
    protected Object getValue(Variable variable) {
        return object.getValue(variable);
    }

    @Override
    protected void setValue(Variable variable, Object value) {
        object.setValue(variable, value);
    }

    @Override
    protected boolean contains(Variable variable) {
        if(object != null && object.fields != null){
            return object.fields.containsKey(variable);
        }
        return false;
    }
}
