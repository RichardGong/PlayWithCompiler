package play;

/**
 * 用来代表null值的对象。
 * 采用单例模式。用instance()方法来获得一个对象实例。
 */
public final class NullObject extends ClassObject {
    private static NullObject instance = new NullObject();

    private NullObject(){

    }

    //获取唯一的实例。
    public static NullObject instance(){
        return instance;
    }

    //在打印时输出Null。
    @Override
    public String toString() {
        return "Null";
    }

}
