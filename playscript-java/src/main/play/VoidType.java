package play;

public class VoidType implements Type{

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
    public static VoidType voidType = new VoidType();

    @Override
    public String toString(){
        return "void";
    }

}