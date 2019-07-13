package script2;

import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

public final class Type {
    //类型的类型，Integer等几种原始类型，加上function、class
    TypeType typeType;

    //代码的位置。对于function（method）和class有效。
    //目前先用AST，后面可以用IP。
    protected ParserRuleContext code = null; 

    //上一级的Type。对于function、类的成员有效
    TypeType enclosingType = null;

    //function(method)的签名
    // siganature：
    
    // 下面属性只对class有效：
    String name;
    String nameSpace;

    //类成员
    Map<String, Type> members = null;
    
    //父类
    Type extendedFrom = null;
    
    //所实现的inteface
    List<Type> interfaces = null;

    public Type(TypeType typeType){
        this.typeType = typeType;
    }
}