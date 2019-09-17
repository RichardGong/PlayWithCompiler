package play.parser;

import java.util.Collections;
import java.util.Set;

/**
 * DFA的状态。
 * 每个DFN包含多个NFA。
 */
public class DFAState extends State {

    //组成这个DFAState的NFAState的集合
    private Set<State> states = null;


    public DFAState(Set<State> states) {
        this.states = states;
    }


    protected Set<State> states(){
        return Collections.unmodifiableSet(states);
    }

    /**
     * 提供一个字符，看能否迁移到下一个状态
     * @param ch
     * @return
     */
    protected DFAState getNextState(char ch) {
        for (Transition transition : transitions()) {
            if (transition.match(ch)) {
                return (DFAState) getState(transition);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String rtn = super.toString();
        rtn += "\t(";
        int i = 0;
        for (State state : states) {
            if (i++ > 0) {
                rtn += ", ";
            }
            rtn += state.getName();
            if (state.getGrammarNode() != null && state.getGrammarNode().isNamedNode()) {
                rtn += "(" + state.getGrammarNode().getName() + ")";
            }
        }
        rtn += ")\n";
        return rtn;
    }

    /**
     * 只要它所包含的NFA有一个是接受状态，该DFAState就是接受状态。
     * @return
     */
    @Override
    public boolean isAcceptable() {
        for (State state : states) {
            if (state.isAcceptable()) {
                return true;
            }
        }
        return false;
    }

}
