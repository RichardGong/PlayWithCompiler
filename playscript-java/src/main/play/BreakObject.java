package play;

/**
 * 用于代表一个Break语句的对象
 */
public final class BreakObject {
    private static BreakObject instance = new BreakObject();

    private BreakObject(){

    }

    //获取唯一的实例。
    public static BreakObject instance(){
        return instance;
    }

    //在打印时输出Break。
    @Override
    public String toString() {
        return "Break";
    }
}
