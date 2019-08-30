package play;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 命令行工具。可以执行一个脚本，或者以REPL模式运行。
 */
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
        //String script =  null; //"int a = 1; int b =2; int c;  c=a+b;";
        //String script = "int fun1(int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8){int c = 10; return x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + c;} println(\"fun1: %d\", fun1(1,2,3,4,5,6,7,8));".replaceAll("\\\\", "");


        //脚本
        String script = null;

        // 是否生成汇编代码
        boolean genAsm = false;

        Map params = null;

        //解析参数
        try{
            params = parseParams(args);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return;
        }

        boolean help = params.containsKey("help") ? (Boolean) params.get("help") : false;
        if (help){
            showHelp();
            return;
        }

        //从源代码读取脚本
        String scriptFile = params.containsKey("scriptFile") ? (String)params.get("scriptFile") : null;
        if (scriptFile != null) {
            try {
                script = readTextFile(scriptFile);
            } catch (IOException e) {
                System.out.println("unable to read from : " + scriptFile);
                return;
            }
        }

        //打印编译过程中的信息
        boolean verbose = params.containsKey("verbose") ? (Boolean) params.get("verbose") : false;

        //打印AST
        boolean ast_dump = params.containsKey("ast_dump") ? (Boolean) params.get("ast_dump") : false;

        //进入REPL
        if (script == null) {
            REPL(verbose, ast_dump);
        }

        //生成汇编代码
        else if (genAsm) {
            //输出文件
            String outputFile = params.containsKey("outputFile") ? (String)params.get("outputFile") : null;
            generateAsm(script, outputFile);
        }

        //执行脚本
        else {
            PlayScriptCompiler compiler = new PlayScriptCompiler();
            AnnotatedTree at = compiler.compile(script, verbose, ast_dump);

            if (!at.hasCompilationError()) {
                Object result = compiler.Execute(at);
                //System.out.println(result);
            }
        }

    }

    /**
     * 解析参数
     * @param args
     * @return
     */
    private static Map parseParams(String args[]) throws Exception {
        Map<String,Object> params = new HashMap<>();

        for (int i = 0; i < args.length; i++) {

            //输出汇编代码
            if (args[i].equals("-S")) {
                params.put("genAsm",true);
            }

            //显示作用域和符号
            else if (args[i].equals("-h") || args[i].equals("--help")){
                params.put("help",true);
            }

            //显示作用域和符号
            else if (args[i].equals("-v")){
                params.put("verbose",true);
            }

            //显示作用域和符号
            else if (args[i].equals("-ast-dump")){
                params.put("ast_dump",true);
            }

            //输出文件
            else if (args[i].equals("-o")) {
                if (i + 1 < args.length) {
                    //outputFile = args[++i];  //让i的序号增加一个
                    params.put("outputFile", args[++i]);
                } else {
                    //System.out.println("Expecting a filename after -o");
                    throw new Exception("Expecting a filename after -o");
                }
            }

            //不认识的参数
            else if (args[i].startsWith("-")){
                throw new Exception("Unknow parameter : " + args[i]);
            }

            //脚本文件
            else {
                params.put("scriptFile", args[i]);
                //scriptFile = args[i];
            }
        }

        return params;
    }

    /**
     * 打印帮助信息
     */
    private static void showHelp(){
        System.out.println("usage: java play.PlayScript [-h | --help | -o outputfile | -S | -v | -ast-dump] [scriptfile]");

        System.out.println("\t-h or --help : print this help information");
        System.out.println("\t-v verbose mode : dump AST and symbols");
        System.out.println("\t-ast-dump : dump AST in lisp style");
        System.out.println("\t-o outputfile : file pathname used to save generated code, eg. assembly code");
        System.out.println("\t-S : compile to assembly code");
        System.out.println("\tscriptfile : file contains playscript code");

        System.out.println("\nexamples:");
        System.out.println("\tjava play.PlayScript");
        System.out.println("\t>>interactive REPL mode");
        System.out.println();

        System.out.println("\tjava play.PlayScript -v");
        System.out.println("\t>>enter REPL with verbose mode, dump ast and symbols");
        System.out.println();

        System.out.println("\tjava play.PlayScript scratch.play");
        System.out.println("\t>>compile and execute scratch.play");
        System.out.println();

        System.out.println("\tjava play.PlayScript -v scratch.play");
        System.out.println("\t>>compile and execute scratch.play in verbose mode, dump ast and symbols");
        System.out.println();
    }

    /**
     * 生成ASM
     *
     * @param script     脚本
     * @param outputFile 输出的文件名
     */
    private static void generateAsm(String script, String outputFile) {
        PlayScriptCompiler compiler = new PlayScriptCompiler();
        AnnotatedTree at = compiler.compile(script);
        AsmGen asmGen = new AsmGen(at);
        String asm = asmGen.generate();
        if (outputFile != null) {
            try {
                writeTextFile(outputFile, asm);
            } catch (IOException e) {
                System.out.println("unable to write to : " + outputFile);
                return;
            }
        } else {
            System.out.println(asm);
        }
    }

    /**
     * 读文本文件
     * @param pathName
     * @return
     * @throws IOException
     */
    private static String readTextFile(String pathName) throws IOException {
        StringBuffer buffer = new StringBuffer();
        try (FileReader reader = new FileReader(pathName);
             BufferedReader br = new BufferedReader(reader)) {
            String line;
            while ((line = br.readLine()) != null) {
                buffer.append(line).append('\n');
            }
        }
        return buffer.toString();
    }

    /**
     * 写文本文件
     * @param pathName
     * @param text
     * @throws IOException
     */
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

    /**
     * REPL
     */
    private static void REPL(boolean verbose, boolean ast_dump) {
        System.out.println("Enjoy PlayScript!");

        PlayScriptCompiler compiler = new PlayScriptCompiler();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String script = "";

        String scriptLet = "";
        System.out.print("\n>");   //提示符

        while (true) {
            try {
                String line = reader.readLine().trim();
                if (line.equals("exit();")) {
                    System.out.println("good bye!");
                    break;
                }
                scriptLet += line + "\n";
                if (line.endsWith(";")) {

                    // 解析整个脚本文件
                    AnnotatedTree at = compiler.compile(script + scriptLet, verbose, ast_dump);

                    //重新执行整个脚本
                    if (!at.hasCompilationError()) {
                        Object result = compiler.Execute(at);
                        System.out.println(result);
                        script = script + scriptLet;
                    }

                    System.out.print("\n>");   //提示符

                    scriptLet = "";
                }

            } catch (Exception e) {
                // e.printStackTrace();

                System.out.println(e.getLocalizedMessage());
                System.out.print("\n>");   //提示符
                scriptLet = "";
            }
        }
    }

    /**
     * 批量运行所有的示例程序，每个示例程序执行完毕以后，需要按一个键，再继续执行下一个程序。
     */
    private static void batchTest() {

    }


}