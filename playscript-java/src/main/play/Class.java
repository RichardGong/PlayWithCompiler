package play;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class Class extends Scope implements Type{
    // class的属性
    //protected List<Variable> fields = new LinkedList<Variable>();
    //protected List<Function> functions = new LinkedList<Function>();

    //父类
    private Class parentClass = null; //= rootClass;

    protected Class(String name, ParserRuleContext ctx) {
        this.name = name;
        this.ctx = ctx;

        thisRef = new This(this,ctx);
        thisRef.type = this;

    }

    protected Class getParentClass(){
        return parentClass;
    }

    protected void setParentClass(Class theClass){
        parentClass = theClass;

        //其实superRef引用的也是自己
        superRef = new Super(parentClass,ctx);
        superRef.type = parentClass;
    }


    //这个类的This变量
    private This thisRef = null;

    private Super superRef = null;

    //最顶层的基类
    private static Class rootClass = new Class("Object", null);

    public This getThis(){
        return thisRef;
    }

    public Super getSuper() {return superRef;}

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

    protected Variable getFunctionVariable(String name, List<Type> paramTypes){
        Variable rtn = super.getFunctionVariable(name, paramTypes);  //TODO 是否要检查visibility?

        if (rtn == null && parentClass != null){
            rtn = parentClass.getFunctionVariable(name,paramTypes);
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
        //this关键字
        if(symbol == thisRef || symbol == superRef){
            return true;
        }

        boolean rtn = false;
        rtn = symbols.contains(symbol);
        if (!rtn && parentClass != null){
            rtn = parentClass.containsSymbol(symbol);
        }
        return rtn;
    }

    /**
     * 当自身是目标类型的子类型的时候，返回true;
     * @param type 目标类型
     * @return
     */
    @Override
    public boolean isType(Type type){
        if (this == type) return true; //shortcut

        if (type instanceof Class){
            return ((Class) type).isAncestor(this);
        }
        return false;
    }

    /**
     * 本类型是不是另一个类型的祖先类型
     * @param theClass
     * @return
     */
    public boolean isAncestor(Class theClass){
        if (theClass.getParentClass() != null) {
            if (theClass.getParentClass()==this){
                return true;
            }
            else{
                return isAncestor(theClass.getParentClass());
            }
        }
        return false;
    }

}