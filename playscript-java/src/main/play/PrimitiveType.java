package play;

public class PrimitiveType implements Type {

    private String name = null;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Scope getEnclosingScope() {
        return null;
    }

    // 没有公共的构造方法
    private PrimitiveType(String name) {
        this.name = name;
    }

    // 把常见的基础数据类型都定义出来
    public static PrimitiveType Integer = new PrimitiveType("Integer");
    public static PrimitiveType Long = new PrimitiveType("Long");
    public static PrimitiveType Float = new PrimitiveType("Float");
    public static PrimitiveType Double = new PrimitiveType("Double");
    public static PrimitiveType Boolean = new PrimitiveType("Boolean");
    public static PrimitiveType Byte = new PrimitiveType("Byte");
    public static PrimitiveType Char = new PrimitiveType("Char");
    public static PrimitiveType Short = new PrimitiveType("Short");

    public static PrimitiveType String = new PrimitiveType("Short"); //增加String为基础类型

    public static PrimitiveType Null = new PrimitiveType("null");    //TODO 不知道null如何处理，先放在这里
}