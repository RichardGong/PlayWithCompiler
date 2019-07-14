package script2;

import java.util.HashSet;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

/**
 * 一个简单的类型系统。包括原始数据类型、方法、类等。
 */
public final class Type {
    //类型的类型，Integer等几种原始类型，加上function、class
    TypeType typeType;

    //代码的位置。对于function（method）和class有效。
    //目前先用AST，后面可以用IP。
    protected ParserRuleContext code = null; 

    //上一级的Type。对于function、类的成员有效
    TypeType enclosingType = null;
    
    //类的名称、方法的名称。如果是Integer等原始类型，
    String name;  

    //类的命名空间。如果是内部类，还要带上上级类的名称。
    String nameSpace;

    //类成员,包括field、method、inner class
    HashSet<Type> members = null;

    //方法的参数
    List<Type> parameters = null;
    
    //父类
    Type extendedFrom = null;
    
    //所实现的inteface
    List<Type> interfaces = null;

    public Type(TypeType typeType){
        this.typeType = typeType;
    }

    public Type(TypeType typeType, ParserRuleContext code){
        this.typeType = typeType;
        this.code = code;
    }
}