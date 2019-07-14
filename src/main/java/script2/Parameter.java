package script2;

/**
 * 方法的参数
 */
public interface Parameter extends Element{
    //参数类型
    public Type getType();

    //缺省值。
    //TODO 这里除了是常量以外，还可以是在编译器求出确定值的量。
    public Object getDefaultValue();

    //数量multiplicity
    //允许该参数出现几次。
    public Integer getMultiplicity();

}
