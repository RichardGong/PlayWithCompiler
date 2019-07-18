package script2;

public class PlayScript {
    public static void main(String args[]) {
        //String script = "45+10*2;";
        //String script = "int age = 44; { int i = 10; age+i;}";
        //String script = "int age = 44; for(int i = 0;i<10;i++) { age = age + 2;} int i = 8;";
        //String script = "int b= 10; int myfunc(int a) {return a+b+3;} myfunc(2);";
        //String script = "class myclass{int a=2; int b; myclass(){ b = 3;} }  myclass c = myclass(); c.b;";
        //String script = "class myclass{int a; int b; myclass(){a=1; b=2;} int calc(){return a + b;} } myclass c = myclass(); c.calc();";
        //String script = "println(2);";
        //String script = "int fun1(int a){return a+1;} println(fun1(2)); function int(int) fun2=fun1; fun2(3);";
        //String script = "int a=0; function int() fun1(){int b=0; int inner(){a=a+1; b=b+1; return b;} return inner;} function int() fun2 = fun1(); println(fun2()); println(fun2());";
        String script = "println(2+3.5); println(\"Hello \" + 45); ";
        
        PlayScriptCompiler compiler = new PlayScriptCompiler();

        CompilationRecord cr = compiler.Compile(script);

        Object result = compiler.Execute(cr);

        System.out.println(result);
    }
}