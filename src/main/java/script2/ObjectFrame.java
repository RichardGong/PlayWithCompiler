package script2;

public class ObjectFrame extends StackFrame {
    PlayObject object = null;

    public ObjectFrame(PlayObject object){
        this.object = object;
        this.scope = object.type;
    }

    @Override
    protected Object getValue(Variable variable) {
        return object.getValue(variable);
    }

    @Override
    protected void setValue(Variable variable, Object value) {
        object.setValue(variable, value);
    }
}
