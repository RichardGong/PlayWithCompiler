package play;

/**
 * 用来代表null值的对象。
 * 采用单例模式。用instance()方法来获得一个对象实例。
 */
public final class NullObject extends ClassObject {
    private static NullObject instance = null;

    private NullObject(){

    }

    //获取唯一的实例。
    public static NullObject instance(){
        if (instance == null){
            instance = new NullObject();
        }
        return instance;
    }

    //在打印时输出null。
    @Override
    public String toString() {
        return "Null";
    }

}
