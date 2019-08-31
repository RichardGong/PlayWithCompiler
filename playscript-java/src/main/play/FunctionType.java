package play;

import java.util.List;

/**
 * 函数类型
 */
public interface FunctionType extends Type {
    
    public Type getReturnType();

    public List<Type> getParamTypes();

    public boolean matchParameterTypes(List<Type> paramTypes);

}