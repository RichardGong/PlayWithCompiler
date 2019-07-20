package play;

import java.util.HashMap;
import java.util.Map;

/**
 * PlayScript的对象
 */
public class PlayObject {
    //类型
    //protected Type type = null;

    //成员变量
    protected Map<Variable, Object> fields = new HashMap<Variable, Object>();

    //引用次数
    // protected int refCount = 0;

    public Object getValue(Variable variable){
        Object rtn = fields.get(variable);
        //TODO 父类的属性如何返回？还是说都在这里了？
        return rtn;
    }

    public void setValue(Variable variable, Object value){
        fields.put(variable, value);
    }
}