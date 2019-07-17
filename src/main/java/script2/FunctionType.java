package script2;

import java.util.List;

public interface FunctionType extends Type {
    
    public Type getReturnType();

    public List<Type> getParamTypes();

}