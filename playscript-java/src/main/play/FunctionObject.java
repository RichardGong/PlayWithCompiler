package play;

/**
 * 存放一个函数运行时的本地变量的值，包括参数的值。
 */
public class FunctionObject extends PlayObject{
     //类型
     protected Function function = null;

     public FunctionObject (Function function){
          this.function = function;
     }

     protected void setFunction(Function function){
          this.function = function;
     }

}