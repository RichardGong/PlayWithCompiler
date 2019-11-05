package play;

/**
 * 代表一个缺省的构造函数。
 * 这不是在程序里声明的。因此没有对应的FunctionDeclarationContext
 */
public class DefaultConstructor extends Function {
    protected DefaultConstructor(String name, Class theClass) {
        super(name, theClass, null);
    }

    public Class Class(){
        return (Class)enclosingScope;
    }
}
