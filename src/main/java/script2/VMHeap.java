package script2;

import java.util.LinkedList;
import java.util.List;

public class VMHeap{
    //保存在堆中的数据
    protected List<PlayObject> objects = new LinkedList<PlayObject>();

    //模拟在堆中申请空间，来保存对象
    protected PlayObject alloc(Type type){
        PlayObject obj = new PlayObject();
        obj.type = type;

        objects.add(obj);

        return obj;
    }

    //模拟释放一个对象所占的空间
    protected void release(PlayObject obj){
        objects.remove(obj);
    }
}