package play;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DefaultFunctionType implements FunctionType {
    protected String name = null;
    protected Scope enclosingScope = null;
    protected Type returnType = null;
    protected List<Type> paramTypes = new LinkedList<Type>();

    //对于未命名的类型，自动赋予名字
    private static int nameIndex = 1;

    public DefaultFunctionType (){
        name = "FunctionType" + nameIndex++;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    @Override
    public Type getReturnType() {
        return returnType;
    }

    @Override
    public List<Type> getParamTypes() {
        return Collections.unmodifiableList(paramTypes);
    }

    @Override
    public String toString(){
        return "FunctionType";
    }

    @Override
    public boolean isType(Type type){
        if (type instanceof FunctionType){
            return isType(this, (FunctionType)type);
        }
        return false;
    }

    /**
     * 工具性方法，比较type1是否是type2。
     * 规则：
     * 1.type1的返回值跟type2相等，或者是它的子类型。
     * @param type1
     * @param type2
     * @return
     */
    public static boolean isType(FunctionType type1, FunctionType type2){
        if (type1 == type2) return true;  //shortcut

        if (!type1.getReturnType().isType(type2.getReturnType())){
            return false;
        }

        List<Type> paramTypes1 = type1.getParamTypes();
        List<Type> paramTypes2 = type1.getParamTypes();

        if (paramTypes1.size() != paramTypes2.size()){
            return false;
        }

        for (int i = 0; i< paramTypes1.size(); i++){
            if (!paramTypes1.get(i).isType(paramTypes2.get(i))){
                return false;
            }
        }

        return true;
    }

    /**
     * 检查改函数是否匹配所需的参数。
     * @param paramTypes
     * @return
     */
    @Override
    public boolean matchParameterTypes(List<Type> paramTypes){
        // 比较每个参数
        if (paramTypes.size() != paramTypes.size()) {
            return false;
        }

        boolean match = true;
        for (int i = 0; i < paramTypes.size(); i++) {
            Type type1 = this.paramTypes.get(i);
            Type type = paramTypes.get(i);
            if (!type1.isType(type)) {
                match = false;
                break;
            }
        }

        return match;
    }

}