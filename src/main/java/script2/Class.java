package script2;

import java.util.LinkedList;
import java.util.List;

public class Class extends Type {
    // class的属性
    protected List<Variable> fields = new LinkedList<Variable>();
    protected List<Function> functions = new LinkedList<Function>();

    protected Class(String name, Scope scope) {
        this.name = name;
        this.scope = scope;
    }
}