package play;

import org.antlr.v4.runtime.ParserRuleContext;

public class Class extends Scope implements Type{
    // class的属性
    //protected List<Variable> fields = new LinkedList<Variable>();
    //protected List<Function> functions = new LinkedList<Function>();

    protected Class(String name, ParserRuleContext ctx) {
        this.name = name;
        this.ctx = ctx;
    }

    protected Class getParentClass(){
        return (Class)enclosingScope;
    }

    protected void setParentClass(Class theClass){
        enclosingScope = theClass;
    }


    @Override
    public String toString(){
        return "Class " + name;
    }
}