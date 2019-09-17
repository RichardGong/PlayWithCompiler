package play.parser;

/**
 * 状态迁移
 */
public class Transition {
    //状态迁移条件
    protected CharSet condition = new CharSet();

    //对于重复的情况，最多可以重复几次。
    //这是把GrammarNode中的maxTimes属性转义到这里来了。
    //对于 ？maxTimes = 1，对于+和*，maxTimes=-1
    protected int maxTimes = 1;

    public Transition(){

    }

    public Transition(CharSet charSet){
        condition = charSet;
    }

    public Transition(int maxTimes){
        this.maxTimes = maxTimes;
    }

    /**
     * 是否满足迁移条件
     * 算法：
     * 1. 如果没有任何conditions，那么就代表epsilon，就是可以迁移的。
     * 2. 否则就要检查字符是否落在CharRange中。
     * @param ch
     * @return
     */
    public boolean match(Character ch){
        if (isEpsilon()) return false;

        return condition.match(ch);
    }

    public boolean isEpsilon(){
        return condition.isEmpty();
    }

    @Override
    public String toString(){
        if (isEpsilon()){
            return "ε";
        }
        else{
            CharSet charSet = condition;
            if (charSet.subSets != null && charSet.subSets.size()>=10){
                charSet = charSet.getShorterForm();
            }
            return charSet.toString();
        }
    }

}
