package script2;

import java.util.LinkedList;
import java.util.List;

public class Function extends Type {
    // function的属性
    protected List<Variable> parameters = new LinkedList<Variable>();
    protected Type returnType = null;

    protected Function(String name, Scope scope) {
        this.name = name;
        this.scope = scope;
    }
}