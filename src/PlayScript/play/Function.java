package play;

import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

public class Function extends Scope implements FunctionType{
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
        if (paramTypes == null){
            paramTypes = new LinkedList<Type>();
        }

        for (Variable param: parameters){
            paramTypes.add(param.type);
        }

        return paramTypes;
    }
}