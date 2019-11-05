import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;

/**
 * 示例代码：用asm生成java字节码
 */
public class GenClass implements Opcodes{

    public static void main(String[] args) throws IOException {
        genMyClass2();
        genMyClass3();
        genMyClass4();
    }


    /**
     用asm创建下面这个类的字节码：
     public class MyClass2{
        public int foo(int a){
             return a + 3;
        }
     }
     */
    public static void genMyClass2() throws IOException{
        //创建一个ClassWriter
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);

        //创建MyClass2类
        cw.visit(V1_8, ACC_PUBLIC,
                "MyClass2", null, "java/lang/Object",null);

        //创建缺省构造方法
        genDefaultConstructor(cw);

        //创建foo方法
        genFooMethod(cw);

        //结束类
        cw.visitEnd();

        //写到MyClass2.class文件中
        byte[] data = cw.toByteArray();
        File file = new File("MyClass2.class");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(data);
        fos.close();
    }

    //创建缺省构造方法
    private static void genDefaultConstructor(ClassWriter cw){
        MethodVisitor constructor = cw.visitMethod(ACC_PUBLIC, "<init>",
                "()V", null, null);

        constructor.visitCode();
        constructor.visitVarInsn(ALOAD, 0);
        constructor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        constructor.visitInsn(RETURN);
        constructor.visitMaxs(1,1);
        constructor.visitEnd();
    }

    //创建foo方法
    private static void genFooMethod(ClassWriter cw){
        MethodVisitor mv = cw.visitMethod(ACC_PUBLIC, "foo",
                "(I)I",  //括号中的是参数类型，括号后面的是返回值类型
                null, null);

        //添加参数a
        mv.visitParameter("a", ACC_PUBLIC);

        mv.visitVarInsn(ILOAD, 1); //iload_1
        mv.visitInsn(ICONST_3);         //iconst_3
        mv.visitInsn(IADD);             //iadd
        mv.visitInsn(IRETURN);          //ireturn

        //设置操作数栈最大的帧数，以及最大的本地变量数
        mv.visitMaxs(2,2);

        //结束方法
        mv.visitEnd();
    }


    /**
     用asm创建下面这个类的字节码：
     public class MyClass3{
        public static int bar(int b){
            return b + 4;
        }
     }

     public static void main(String args[]){
        int c = bar(5);
        System.out.println(c);
     }
     */

    public static void genMyClass3() throws IOException{
        //创建一个ClassWriter
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);

        //创建MyClass2类
        cw.visit(V1_8, ACC_PUBLIC,
                "MyClass3", null, "java/lang/Object",null);

        //创建缺省构造方法
        genDefaultConstructor(cw);

        //创建Bar方法(静态方法)
        genBarMethod(cw);

        //创建main方法
        genMyClass3Main(cw);

        //结束类
        cw.visitEnd();

        //写到MyClass2.class文件中
        byte[] data = cw.toByteArray();
        File file = new File("MyClass3.class");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(data);
        fos.close();
    }

    //创建bar方法
    //这是个静态方法，所以第一个参数的下标是0
    private static void genBarMethod(ClassWriter cw){
        MethodVisitor mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "bar",
                "(I)I",  //括号中的是参数类型，括号后面的是返回值类型
                null, null);

        //添加参数ab
        mv.visitParameter("b", ACC_PUBLIC);

        mv.visitVarInsn(ILOAD, 0); //iload_0
        mv.visitInsn(ICONST_4);         //iconst_4
        mv.visitInsn(IADD);             //iadd
        mv.visitInsn(IRETURN);          //ireturn

        //设置操作数栈最大的帧数，以及最大的本地变量数
        mv.visitMaxs(2,2);

        //结束方法
        mv.visitEnd();
    }

    //创建MyClass3的main函数
    private static void genMyClass3Main(ClassWriter cw){
        MethodVisitor mv = cw.visitMethod(ACC_PUBLIC  + ACC_STATIC,
                "main",
                "([Ljava/lang/String;)V", //参数类型：String []
                null, null);

        //添加参数args
        mv.visitParameter("args", ACC_PUBLIC);

        // iconst_5
        mv.visitInsn(ICONST_5);

        // invokestatic  #7                  // Method foo:(I)I
        mv.visitMethodInsn(INVOKESTATIC,"MyClass3", "bar","(I)I",false);

        // istore_1
        mv.visitVarInsn(ISTORE, 1);

        // getstatic     #5                  // Field java/lang/System.out:Ljava/io/PrintStream;
        mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");

        // iload_1
        mv.visitVarInsn(ILOAD, 1);

        mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);

        mv.visitInsn(RETURN);

        //设置操作数栈最大的帧数，以及最大的本地变量数
        mv.visitMaxs(3, 1);

        //结束方法
        mv.visitEnd();
    }


    /**
     用asm创建下面这个类的字节码：
     public class MyClass4{
         public int foo(int a){
            return a + 3;
         }
     }

     public static void main(String args[]){
        MyClass3 obj = new MyClass4();
        int c = obj.foo(5);
        System.out.println(c);
     }
     */

    public static void genMyClass4() throws IOException{
        //创建一个ClassWriter
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);

        //创建MyClass2类
        cw.visit(V1_8, ACC_PUBLIC,
                "MyClass4", null, "java/lang/Object",null);

        //创建缺省构造方法
        genDefaultConstructor(cw);

        //创建foo方法
        genFooMethod(cw);

        //创建main方法
        genMyClass4Main(cw);

        //结束类
        cw.visitEnd();

        //写到MyClass2.class文件中
        byte[] data = cw.toByteArray();
        File file = new File("MyClass4.class");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(data);
        fos.close();
    }

    //创建MyClass4的main函数
    private static void genMyClass4Main(ClassWriter cw){
        MethodVisitor mv = cw.visitMethod(ACC_PUBLIC  + ACC_STATIC,
                "main",
                "([Ljava/lang/String;)V", //参数类型：String []
                null, null);

        //添加参数args
        mv.visitParameter("args", ACC_PUBLIC);

        //new
        mv.visitTypeInsn(NEW,"MyClass4");

        //dup
        mv.visitInsn(DUP);

        mv.visitMethodInsn(INVOKESPECIAL,"MyClass4","<init>","()V", false);

        mv.visitVarInsn(ASTORE, 1);

        mv.visitVarInsn(ALOAD, 1);

        //iconst_5
        mv.visitInsn(ICONST_5);

        mv.visitMethodInsn(INVOKEVIRTUAL,"MyClass4", "foo","(I)I",false);

        //istore_1
        mv.visitVarInsn(ISTORE, 2);

        //getstatic     #5                  // Field java/lang/System.out:Ljava/io/PrintStream;
        mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");

        //iload_1
        mv.visitVarInsn(ILOAD, 2);

        mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);

        mv.visitInsn(RETURN);

        //设置操作数栈最大的帧数，以及最大的本地变量数
        mv.visitMaxs(3, 1);

        //结束方法
        mv.visitEnd();
    }

}
