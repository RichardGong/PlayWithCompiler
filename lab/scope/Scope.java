
/**
 * Scope.java
 * 测试Java的作用域
 */ 
public class Scope{

    public static void main(String args[]){
        int a = 1;
        int b = 2;

        if (a > 0){
            //int b = 3; //不允许声明与外部变量同名的变量
            int c = 3;
        }
        else{
            int c = 4;   //允许声明另一个c，各有各的作用域
        }
        
        int c = 5;  //这里也可以声明一个新的c
    }
}