package script2;

import java.util.HashMap;
import java.util.Map;

public class VMHeap{
    protected Map<Reference, Object> variables = new HashMap<Reference, Object>();

    protected Reference alloc(Type type){
        PlayObject obj = new PlayObject();
        obj.type = type;

        Reference ref = new Reference();
        ref.object = obj;

        return ref;
    }

    protected void release(Reference ref){
        variables.remove(ref);
    }
}