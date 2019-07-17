package script2;

public class PlayScript {
    public static void main(String args[]) {
        //String script = "45+10*2;";
        //String script = "int age = 44; { int i = 10; age+i;}";
        //String script = "int age = 44; for(int i = 0;i<10;i++) { age = age + 2;} int i = 8;";
        // String script = "int b= 10; int myfunc(int a) {return a+b+3;} myfunc(2);";
        String script = "class myclass{int a=2; int b; function myclass(){ b = 3;} }  myclass c = myclass(); c.a;";
        // String script = "class myclass{int a; int b; myclass(){a=1; b=2;} int
        // calc(){return a + b;} } myclass c = new myclass(); c.calc();";
        
        PlayScriptCompiler compiler = new PlayScriptCompiler();

        CompilationRecord cr = compiler.Compile(script);

        Object result = compiler.Execute(cr);

        System.out.println(result);

    }
}