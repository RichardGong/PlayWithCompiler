package play;

import org.antlr.v4.runtime.ParserRuleContext;

public class Variable extends Symbol {
    //变量类型
    protected Type type = null;
  
    //// 作为parameter的变量的属性
    //缺省值
    protected Object defaultValue = null;
    
    //是否允许多次重复，这是一个创新的参数机制
    protected Integer multiplicity = 1;

    protected Variable(String name, Scope enclosingScope, ParserRuleContext ctx) {
        this.name = name;
        this.enclosingScope = enclosingScope;
        this.ctx = ctx;
    }

    /**
     * 是不是类的属性
     * @return
     */
    public boolean isClassMember(){
        return enclosingScope instanceof Class;
    }

    @Override
    public String toString(){
        return "Variable " + name + " -> "+ type;
    }

}