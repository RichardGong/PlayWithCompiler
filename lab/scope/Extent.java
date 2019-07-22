
/**
 * Extent.java
 * 测试Java的生存期特性
 */
public class Extent{

    int a = 1;
    //int a = myMethod();  //这个调用是允许的。此时a和b的初始值都是0
    //int a = b;           //这个调用是不合法的，变量b还没有产生。
 
    int myMethod(){
        System.out.println("1: a=" + a +" b=" + b);
        int b = 2;         //覆盖掉类成员b
        System.out.println("2: a=" + a +" b=" + b);
        return b;
    }

    int b = 3;

    static int c = 2;      //静态变量，生存周期与类的定义是一样的。

    public static void main(String args[]){
        Extent extent = new Extent();
        extent.myMethod();

        System.out.println("3: c=" + c + " Scope.c=" + Extent.c);
        int c = 5;         //覆盖掉静态成员c
        System.out.println("4: c=" + c + " Scope.c=" + Extent.c);
    }
}