package play.parser;

/**
 * 状态迁移
 */
public class CharTransition extends Transition {
    //状态迁移条件
    protected CharSet condition = new CharSet();

    public CharTransition() {
    }

    public CharTransition(CharSet charSet) {
        condition = charSet;
    }

    public CharTransition(int maxTimes) {
        this.maxTimes = maxTimes;
    }

    /**
     * 是否满足迁移条件
     * 算法：
     * 1. 如果没有任何conditions，那么就代表epsilon，就是可以迁移的。
     * 2. 否则就要检查字符是否落在CharRange中。
     *
     * @param ch
     * @return
     */
    public boolean match(Character ch) {
        if (isEpsilon()) return false;

        return condition.match(ch);
    }

    public boolean match(Object obj) {
        return match((Character) obj);
    }

    public boolean isEpsilon() {
        return condition.isEmpty();
    }

    @Override
    public String toString() {
        if (isEpsilon()) {
            return "ε";
        } else {
            CharSet charSet = condition;
            if (charSet.subSets != null && charSet.subSets.size() >= 10) {
                charSet = charSet.getShorterForm();
            }
            return charSet.toString();
        }
    }

}
