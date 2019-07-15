package script2;

public class Variable extends Symbol {
    protected Type type = null;

    // parameter的属性
    protected Object defaultValue = null;
    protected Integer multiplicity = 1;

    protected Variable(String name, Scope scope) {
        this.name = name;
        this.scope = scope;
    }
}