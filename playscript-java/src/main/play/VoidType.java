package play;

public final class VoidType implements Type{

    @Override
    public String getName() {
        return "void";
    }

    @Override
    public Scope getEnclosingScope() {
        return null;
    }

    private VoidType(){
    }

    //只保留一个实例即可。
    private static VoidType voidType = new VoidType();

    public static VoidType instance(){
        return voidType;
    }

    @Override
    public boolean isType(Type type){
        return this == type;
    }

    @Override
    public String toString(){
        return "void";
    }

}