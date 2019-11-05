/**
测试把playscript生成字节码的示例程序。

机制：
1.生成一个DefaultPlayClass.class

2.全局的代码，封装到main()方法中。

3.函数变成了DefaultPlayClass的方法。

4.目前特性：
(1)数据类型只支持int
(2)加减乘除运算
(3)变量声明和初始化
(4)函数声明和调用
(5)println()系统函数，参数目前也只支持一个整数。

5.运行示例程序： java play.PlayScript -bc bytecode.play

本示例代码生成的.class文件反编译后是下面的样子：
public class DefaultPlayClass {
    public DefaultPlayClass() {
    }

    public static void main(String[] args) {
        DefaultPlayClass var1 = new DefaultPlayClass();
        int b = 200;
        int c = 2 + b;
        System.out.println(c);
        System.out.println(b);
        System.out.println(var1.foo(30));
    }

    public int foo(int a) {
        int b = var1 + 30;
        System.out.println(b);
        return b;
    }

    public void bar(int a, int b) {
        int c = var1 + var2;
        System.out.println(c);
    }
}
*/


int b = 200;    //变量声明
int c = 2 + b;  //表达式，支持加减乘除

println(c);     //目前只支持int作为println()的参数
println(b);  

//返回值为int的方法
int foo(int a){
    int b = a + 30;
    println(b);
    return b;
}

//返回值为void的方法
void bar(int a, int b){
    int c = a + b;
    println(c);
    return;
}

//调用函数
println(foo(30));

