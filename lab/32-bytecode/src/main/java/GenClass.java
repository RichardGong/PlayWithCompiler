import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;


public class GenClass {

    public static void main(String[] args) throws IOException {

        genMyClass2();

//        MyClass2 myClass2 = new MyClass2();
//        int b = myClass2.foo(5);
//        System.out.println(b);

    }


    /**
     用asm创建下面这个类的字节码：
     public class Person{
        public int age = 0;
        public void setAge(int age){
            this.age = age;
        }

        public int getAge(){
            return age;
        }
     }
     */
    public static void genPerson() throws IOException{
        ClassWriter cw = new ClassWriter(0);

        cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC + Opcodes.ACC_MODULE,
                "Person", null, "java/lang/Object",null);

        cw.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL,
                "age", "I", null, new Integer(-1)).visitEnd();

        MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "setAge",
                "(Ljava/lang/Object;)I", null, null);

        mv.visitEnd();

        cw.visitEnd();

        byte[] data = cw.toByteArray();
        File file = new File("Person.class");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(data);
        fos.close();
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
        cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC,
                "MyClass2", null, "java/lang/Object",null);

        //////创建缺省构造方法
        MethodVisitor constructor = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>",
                "()V", null, null);

        constructor.visitCode();
        constructor.visitVarInsn(Opcodes.ALOAD, 0);
        constructor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        constructor.visitInsn(Opcodes.RETURN);
        constructor.visitMaxs(1,1);
        constructor.visitEnd();


        //////创建foo方法
        MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "foo",
                "(I)I",  //括号中的是参数类型，括号后面的是返回值类型
                null, null);

        //添加参数a
        mv.visitParameter("a", Opcodes.ACC_PUBLIC);

        mv.visitVarInsn(Opcodes.ILOAD, 1); //iload_1
        mv.visitInsn(Opcodes.ICONST_3);         //iconst_3
        mv.visitInsn(Opcodes.IADD);             //iadd
        mv.visitInsn(Opcodes.IRETURN);          //ireturn

        //设置操作数栈最大的帧数，以及最大的本地变量数
        mv.visitMaxs(2,2);

        //结束方法
        mv.visitEnd();

        //结束类
        cw.visitEnd();

        //写到MyClass2.class文件中
        byte[] data = cw.toByteArray();
        File file = new File("MyClass2.class");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(data);
        fos.close();
    }

}
