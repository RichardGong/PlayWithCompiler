package script2;

import java.util.HashMap;
import java.util.Map;

public class ActivationRecord {
    Map<String, Object> variables = new HashMap<String, Object>();

    Scope scope = null;
    public ActivationRecord(Scope scope){
        this.scope = scope;
    }    
}