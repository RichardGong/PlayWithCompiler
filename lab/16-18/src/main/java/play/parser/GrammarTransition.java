package play.parser;

/**
 * 状态迁移
 */
public class GrammarTransition extends Transition{
    //状态迁移条件
    protected String condition = null;

    public GrammarTransition(){}

    public GrammarTransition(String condition){
        this.condition = condition;
    }

    public GrammarTransition(int maxTimes){
        this.maxTimes = maxTimes;
    }

    /**
     * 是否满足迁移条件
     * 算法：输入的GrammarNode和迁移条件相等。
     * @param grammarName
     * @return
     */
    public boolean match(String grammarName){
        if (isEpsilon()) return false;

        return condition.equals(grammarName);
    }

    public boolean match(Object obj){
        return match((String)obj);
    }

    public boolean isEpsilon(){
        return condition==null;
    }

    @Override
    public String toString(){
        if (isEpsilon()){
            return "ε";
        }
        else{
            return condition;
        }
    }

}
