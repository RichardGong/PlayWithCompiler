package script2;

import java.util.HashMap;
import java.util.Map;


/**
 * 类型字典。单例。
 */
public final class TypeDict{
    private static TypeDict instance = null;

    private Map<String, Type> types = new HashMap<String, Type>();

    private TypeDict(){
        put("Boolean","", new Type(TypeType.Boolean));
        put("Integer","", new Type(TypeType.Integer));
    }

    public static TypeDict instance(){
        if (instance == null){
            instance = new TypeDict();
        }
        return instance;
    }

    public Type lookup(String name, String namespace){
        return types.get(namespace+"."+name);
    }

    public void put(String name, String namespace, Type type){
        types.put(namespace+"."+name, type);
    }

    public Type IntegerType(){
        return lookup("Integer","");
    }
}