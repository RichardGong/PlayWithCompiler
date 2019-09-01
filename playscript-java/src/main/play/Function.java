package play;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;

public class Function extends Scope implements FunctionType {
    // 参数
    protected List<Variable> parameters = new LinkedList<Variable>();

    //返回值
    protected Type returnType = null;

    //闭包变量，即它所引用的外部环境变量
    protected Set<Variable> closureVariables = null;

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

    @Override
    public String toString(){
        return "Function " + name;
    }

    @Override
    public boolean isType(Type type){
        if (type instanceof FunctionType){
            return DefaultFunctionType.isType(this, (FunctionType)type);
        }
        return false;
    }

    /**
     * 检查改函数是否匹配所需的参数。
     * @param paramTypes
     * @return
     */
    @Override
    public boolean matchParameterTypes(List<Type> paramTypes){
        // 比较每个参数
        if (parameters.size() != paramTypes.size()) {
            return false;
        }

        boolean match = true;
        for (int i = 0; i < paramTypes.size(); i++) {
            Variable var = parameters.get(i);
            Type type = paramTypes.get(i);
            if (!var.type.isType(type)) {
                match = false;
                break;
            }
        }

        return match;
    }

    /**
     * 该函数是不是类的方法
     * @return
     */
    public boolean isMethod(){
        return enclosingScope instanceof Class;
    }

    /**
     * 该函数是不是类的构建函数
     * @return
     */
    public boolean isConstructor(){
        if (enclosingScope instanceof Class){
            return enclosingScope.name.equals(name);
        }
        return false;
    }

}