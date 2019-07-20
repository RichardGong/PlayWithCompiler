package play;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class VMHeap {
    // 保存在堆中的数据
    protected List<PlayObject> objects = new LinkedList<PlayObject>();

    // 模拟在堆中申请空间，来保存对象
    protected ClassObject alloc(Class theClass) {
        ClassObject obj = new ClassObject();
        obj.type = theClass;

        objects.add(obj);

        Stack<ClassObject> ancestorChain = new Stack<ClassObject>();

        // 把父类一层层的创建出来
        ClassObject theObject = obj;
        while (theClass.parentClass != null) {
            ClassObject newObject = new ClassObject();
            obj.type = theClass.parentClass;
            theObject.parentObject = newObject;
            ancestorChain.push(newObject);

            theClass = theClass.parentClass;
            theObject = newObject;
        }

        // 执行缺省的初始化方法
        for(ClassObject object : ancestorChain){
            defaultObjectInit(object);
        }

        return obj;
    }

    protected FunctionObject alloc(Function function) {
        FunctionObject obj = new FunctionObject();
        obj.function = function;

        objects.add(obj);

        return obj;
    }

    // TODO 类的缺省初始化方法
    protected void defaultObjectInit(ClassObject obj) {

    }

    // 模拟释放一个对象所占的空间
    protected void release(PlayObject obj) {
        objects.remove(obj);
    }
}