package script2;

import java.util.HashMap;
import java.util.Map;

/**
 * PlayScript的对象
 */
public class PlayObject {
    //类型
    protected Type type = null;

    //成员变量
    protected Map<Variable, Object> fields = new HashMap<Variable, Object>();

    //引用次数
    // protected int refCount = 0;
}