
/**
 * Extent2.java
 * 测试Java的生存期特性
 */
public class Extent2{
 
    StringBuffer myMethod(){
        StringBuffer b = new StringBuffer(); //在堆中生成对象实例
        b.append("Hello ");
        System.out.println(System.identityHashCode(b)); //打印内存地址
        return b;  //返回对象引用，本质是一个内存地址
    }

    public static void main(String args[]){
        Extent2 extent2 = new Extent2();
        StringBuffer c = extent2.myMethod(); //获得对象引用
        System.out.println(c);
        c.append("World!");         //修改内存中的内容
        System.out.println(c);

        //跟在myMethod()中打印的值相同。
        System.out.println(System.identityHashCode(c));
    }
}