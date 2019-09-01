package play;

import java.util.LinkedList;
import java.util.List;

public abstract class Scope extends Symbol{
    // 该Scope中的成员，包括变量、方法、类等。
    protected List<Symbol> symbols = new LinkedList<Symbol>();

    /**
     * 向scope中添加符号，同时设置好该符号的enclosingScope
     * @param symbol
     */
    protected void addSymbol(Symbol symbol){
        symbols.add(symbol);
        symbol.enclosingScope = this;
    }

    /**
     * 是否包含某个Variable
     * @param name
     * @return
     */
    protected Variable getVariable(String name){
         return getVariable(this,name);
    }

    protected static Variable getVariable(Scope scope, String name){
        for (Symbol s : scope.symbols) {
            if (s instanceof Variable && s.name.equals(name)){
                return (Variable) s;
            }
        }
        return null;
    }

    /**
     * 是否包含某个Function
     * @param name
     * @param paramTypes 参数类型。不允许为空。该参数不允许为空。如果没有参数，需要传入一个0长度的列表。
     * @return
     */
    protected Function getFunction(String name, List<Type> paramTypes){
       return getFunction(this,name,paramTypes);
    }

    /**
     * 是否包含某个Function。这是个静态方法，可以做为工具方法重用。避免类里要超找父类的情况。
     * @param scope
     * @param name
     * @param paramTypes
     * @return
     */
    protected static Function getFunction(Scope scope, String name, List<Type> paramTypes){
        Function rtn = null;
        for (Symbol s : scope.symbols) {
            if (s instanceof Function && s.name.equals(name)) {
                Function function = (Function) s;
                if (function.matchParameterTypes(paramTypes)){
                    rtn = function;
                    break;
                }
            }
        }


        return rtn;
    }

    /**
     * 获取一个函数类型的变量，能匹配相应的参数类型
     * @param name
     * @param paramTypes
     * @return
     */
    protected Variable getFunctionVariable(String name, List<Type> paramTypes){
        return getFunctionVariable(this,name,paramTypes);
    }

    protected static Variable getFunctionVariable(Scope scope, String name, List<Type> paramTypes){
        Variable rtn = null;
        for (Symbol s : scope.symbols) {
            if (s instanceof Variable && ((Variable) s).type instanceof FunctionType && s.name.equals(name)) {
                Variable v = (Variable) s;
                FunctionType functionType = (FunctionType) v.type;
                if (functionType.matchParameterTypes(paramTypes)){
                    rtn = v;
                    break;
                }
            }
        }


        return rtn;
    }

    /**
     * 是否包含某个Class
     * @param name
     * @return
     */
    protected Class getClass(String name){
        return getClass(this,name);
    }

    protected static Class getClass(Scope scope, String name){
        for (Symbol s : scope.symbols) {
            if (s instanceof Class && s.name.equals(name)){
                return (Class) s;
            }
        }
        return null;
    }


    /**
     * 是否包含某个Symbol
     * @param symbol
     * @return
     */
    protected boolean containsSymbol(Symbol symbol){
        return symbols.contains(symbol);
    }

//    /**
//     * 是否能在该Scope中访问这个symbol，包括层层的enclosingScope
//     */
//    protected boolean accessible(Symbol symbol){
//        boolean rtn = false;
//        rtn = containsSymbol(symbol);
//        if (!rtn && enclosingScope!=null){
//            rtn = enclosingScope.accessible(symbol);
//        }
//        return rtn;
//    }


    @Override
    public String toString(){
        return "Scope: " + name;
    }

}