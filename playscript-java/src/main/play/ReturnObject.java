package play;

/**
 * 代表Return语句的返回值
 */
public class ReturnObject {
    Object returnValue = null; //真正的返回值。
    public ReturnObject(Object value){
        this.returnValue = value;
    }

    //在打印时输出ReturnObject。
    @Override
    public String toString() {
        return "ReturnObject";
    }

}
