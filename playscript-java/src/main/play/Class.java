package play;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class Class extends Scope implements Type{
    // class的属性
    //protected List<Variable> fields = new LinkedList<Variable>();
    //protected List<Function> functions = new LinkedList<Function>();

    //父类
    private Class parentClass = null;

    protected Class(String name, ParserRuleContext ctx) {
        this.name = name;
        this.ctx = ctx;
    }

    protected Class getParentClass(){
        return parentClass;
    }

    protected void setParentClass(Class theClass){
        parentClass = theClass;
    }


    @Override
    public String toString(){
        return "Class " + name;
    }

    /**
     * 是否包含某个Variable，包括自身及父类。
     * @param name
     * @return
     */
    @Override
    protected Variable getVariable(String name){
        Variable rtn = super.getVariable(name);

        if (rtn == null && parentClass != null){
            rtn = parentClass.getVariable(name);  //TODO 是否要检查visibility
        }

        return rtn;
    }


    /**
     * 是否包含某个Class
     * @param name
     * @return
     */
    @Override
    protected Class getClass(String name){
        Class rtn = super.getClass(name);

        if (rtn == null && parentClass != null){
            rtn = parentClass.getClass(name);  //TODO 是否要检查visibility?
        }

        return rtn;
    }

    /**
     * 找到某个构建函数。不需要往父类去找，在本级找就行了。
     * @param paramTypes
     * @return
     */
    protected Function findConstructor(List<Type> paramTypes){
        Function rtn = super.getFunction(name, paramTypes);  //TODO 是否要检查visibility?

        return rtn;
    }

    /**
     * 在自身及父类中找到某个方法
     * @param name
     * @param paramTypes 参数类型列表。该参数不允许为空。如果没有参数，需要传入一个0长度的列表。
     * @return
     */
    protected Function getFunction(String name, List<Type> paramTypes){
        Function rtn = super.getFunction(name, paramTypes);  //TODO 是否要检查visibility?

        if (rtn == null && parentClass != null){
            rtn = parentClass.getFunction(name,paramTypes);
        }

        return rtn;
    }


    /**
     * 是否包含某个Symbol。这时候要把父类的成员考虑进来。
     * @param symbol
     * @return
     */
    @Override
    protected boolean containsSymbol(Symbol symbol){
        boolean rtn = false;
        rtn = symbols.contains(symbol);
        if (!rtn && parentClass != null){
            rtn = parentClass.containsSymbol(symbol);
        }
        return rtn;
    }

}