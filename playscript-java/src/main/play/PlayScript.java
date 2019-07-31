package play;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class PlayScript {
   
    public static void main(String args[]) {
        //String script = "45+10*2;";
        //String script = "int age = 44; { int i = 10; age+i;}";
        //String script = "int age = 44; for(int i = 0;i<10;i++) { age = age + 2;} int i = 8;";
        //String script = "int b= 10; int myfunc(int a) {return a+b+3;} myfunc(2);";
        //String script = "class myclass{int a=2; int b; myclass(){ b = 3;} }  myclass c = myclass(); c.b;";
        //String script = "class class1{int a=2; int b; void method1(){println(\"in class1\");}} class class2 extends class1{int b = 5; void method1(){println(\"in class2\");} } class1 c = class2(); println(c.a); println(c.b); c.method1();";
        //String script = "class myclass{int a; int b; myclass(){a=1; b=2;} int calc(){return a + b;} } myclass c = myclass(); c.calc();";
        //String script = "println(2);";
        //String script = "int fun1(int a){return a+1;} println(fun1(2)); function int(int) fun2=fun1; fun2(3);";
        //String script = "int a=0; function int() fun1(){int b=0; int inner(){a=a+1; b=b+1; return b;} return inner;} function int() fun2 = fun1(); println(fun2()); println(fun2());";
        //String script = "println(2+3.5); println(\"Hello \" + 45); ";

        //test asm generation
        //String script = "int a = 1; int b =2; int c;  c=a+b;";
        //String script = "int fun1(int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8){int c = 10; return x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + c;} println(\"fun1: %d\", fun1(1,2,3,4,5,6,7,8));".replaceAll("\\\\", "");
        
        //源代码文件
        String scriptFile = null;

        String script = null;

        //输出文件
        String outputFile = null;

        // 是否生成汇编代码
        boolean genAsm = false;

        //解析参数
        for (int i = 0; i< args.length; i++){
            if (args[i].equals("-S")){
                genAsm = true;
            }
            else if (args[i].equals("-o")){
                if (i+1 <args.length){
                    outputFile = args[++i];  //让i的序号增加一个
                }
                else{
                    System.out.println("Expecting a filename after -o");
                    return;
                }
            }
            else{
                scriptFile = args[i];
            }
        }

        if (scriptFile != null){
            try {
                script = readTextFile(scriptFile);
            } catch (IOException e) {
                System.out.println("unable to read from : "+scriptFile);
                return;
            }
        }

        if (scriptFile == null){
            //进入REPL
            REPL();
        }else if (genAsm){
            //生成汇编代码
            PlayScriptCompiler compiler = new PlayScriptCompiler();
            CompilationRecord cr = compiler.Compile(script);
            AsmGen asmGen = new AsmGen(cr);
            String asm = asmGen.generate();
            if (outputFile != null){
                try {
                    writeTextFile(outputFile, asm);
                } catch (IOException e) {
                    System.out.println("unable to write to : "+scriptFile);
                    return;
                }
            } else{
                System.out.println(asm);
            }
        }
        else{
            //执行脚本文件
            PlayScriptCompiler compiler = new PlayScriptCompiler();
            CompilationRecord cr = compiler.Compile(script);
            Object result = compiler.Execute(cr);
            System.out.println(result);
        }
            
    }

    private static String readTextFile(String pathName) throws IOException {
        StringBuffer buffer = new StringBuffer();
        try (FileReader reader = new FileReader(pathName); 
            BufferedReader br = new BufferedReader(reader)) {
            String line;
            while ((line = br.readLine()) != null) {
                buffer.append(line);
            }
        }
        return buffer.toString();
    }

    public static void writeTextFile(String pathName, String text) throws IOException {
        File file = new File(pathName); 
        file.createNewFile(); 
        try (FileWriter writer = new FileWriter(file); 
            BufferedWriter out = new BufferedWriter(writer)) {
            StringReader reader = new StringReader(text);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                out.write(line);
            }    
            out.flush(); // 把缓存区内容压入文件
        }
    }

    private static void REPL() {
        System.out.println("Enjoy PlayScript!");
 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String scriptText = "";
        System.out.print("\n>");   //提示符

        while (true) {
            try {
                String line = reader.readLine().trim();
                if (line.equals("exit();")) {
                    System.out.println("good bye!");
                    break;
                }
                scriptText += line + "\n";
                if (line.endsWith(";")) {
             
                    // 执行脚本文件
                    PlayScriptCompiler compiler = new PlayScriptCompiler();
                    CompilationRecord cr = compiler.Compile(scriptText);
                    Object result = compiler.Execute(cr);
                    System.out.println(result);

                    System.out.print("\n>");   //提示符

                    scriptText = "";
                }

            } catch (Exception e) {
                // e.printStackTrace();

                System.out.println(e.getLocalizedMessage());
                System.out.print("\n>");   //提示符
                scriptText = "";
            } 
        }
    }


}