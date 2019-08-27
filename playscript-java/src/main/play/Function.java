package play;

import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

public class Function extends Scope implements FunctionType {
    // 参数
    protected List<Variable> parameters = new LinkedList<Variable>();

    //返回值
    protected Type returnType = null;

    private List<Type> paramTypes = null;

    protected Function(String name, Scope enclosingScope, ParserRuleContext ctx) {
        this.name = name;
        this.enclosingScope = enclosingScope;
        this.ctx = ctx;
    }

    @Override
    public Type getReturnType() {
        return returnType;
    }

    @Override
    public List<Type> getParamTypes() {
        if (paramTypes == null) {
            paramTypes = new LinkedList<Type>();
        }

        for (Variable param : parameters) {
            paramTypes.add(param.type);
        }

        return paramTypes;
    }

    /**
     * 比较两个函数定义是否相等，需要作用域相同、名称相同、参数类型相同、返回值类型相同。
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o){
        if (o instanceof Function){
            Function function = (Function)o;

            //scope
            if (function.enclosingScope != this.enclosingScope){
                return false;
            }

            //函数名称
            if (!function.name.equals(name)){
                return false;
            }

            //返回值
            if (!function.returnType.equals(this.returnType)){
                return false;
            }

            //参数
            if (function.paramTypes.size() != this.paramTypes.size()){
                return false;
            }

            for (int i = 0; i< function.paramTypes.size(); i++){
                Type type1 = function.paramTypes.get(i);
                Type type2 = function.paramTypes.get(i);
                if (!type1.equals(type2)){
                    return false;
                }
            }
            return true;  //所有条件都满足
        }
        else{
            return false;
        }
    }

}