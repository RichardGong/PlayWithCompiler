package play;

import java.util.LinkedList;
import java.util.List;

public class DefaultFunctionType implements FunctionType {
    protected String name = null;
    protected Scope enclosingScope = null;
    protected Type returnType = null;
    protected List<Type> paramTypes = new LinkedList<Type>();

    //对于未命名的类型，自动赋予名字
    private static int nameIndex = 1;

    public DefaultFunctionType (){
        name = "FunctionType" + nameIndex++;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    @Override
    public Type getReturnType() {
        return null;
    }

    @Override
    public List<Type> getParamTypes() {
        return null;
    }
    
}