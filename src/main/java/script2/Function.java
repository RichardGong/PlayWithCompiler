package script2;

import java.util.List;

public interface Function extends Type {

    //函数的参数列表。
    //todo 可以有特殊参数。支持多个值。
    public List<Parameter> parameters();
    
    //返回值的类型，只允许一个返回值
    public Type getReturnType();
    
}