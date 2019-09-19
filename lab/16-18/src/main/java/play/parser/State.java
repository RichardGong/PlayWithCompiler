package play.parser;

import java.util.*;

/**
 * 代表有限自动机的一个状态。
 */
public class State {

    //计数器，用于自动给状态起名字
    private static int count = 0;

    //状态名称，是自动增长的数字，0, 1 ...
    private String name;

    //是不是最终状态（接受状态）
    private boolean acceptable = false;

    //状态间的连线
    private List<Transition> transitions = new LinkedList<Transition>();

    //连线与下一个状态的对照表
    private Map<Transition, State> transition2State = new HashMap<Transition, State>();

    //跟这个节点关联的语法
    //用于词法分析时，分辨是哪个词法的结束状态
    private GrammarNode grammarNode = null;


    public State(){
        name = String.valueOf(count++);
    }

    public State(boolean acceptable){
        this();
        this.acceptable = acceptable;
    }

    public void addTransition(Transition transition, State toState){
        transitions.add(transition);
        transition2State.put(transition,toState);
    }

    /**
     * 把另一个状态的连线全部拷贝成自己的。
     * 这相当于把State这个节点替换成自己
     * @param state
     */
    public void copyTransitions(State state){
        this.transitions = state.transitions;
        this.transition2State = state.transition2State;
    }

    public State getState(Transition transition){
        return transition2State.get(transition);
    }

    /**
     * 获得到某个状态的Transition。  //TODO 这里假设每个两个状态之间只可能有一个Transition
     * @param toState
     * @return
     */
    public Transition getTransitionTo(State toState){
        for (Transition transition: transitions){
            if (transition2State.get(transition) == toState){
                return transition;
            }
        }
        return null;
    }

    public List<Transition> transitions(){
        return Collections.unmodifiableList(transitions);
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(name);
        if (transitions.size() > 0){
            for (Transition transition : transitions){
                State state = transition2State.get(transition);
                sb.append("\t").append(transition).append(" -> ").append(state.name).append('\n');
            }
        }
        else{
            sb.append("\t(end)").append('\n');
        }

        if (isAcceptable()){
            sb.append("\tacceptable\n");
        }
        return sb.toString();
    }

    public boolean isAcceptable() {
        return acceptable;
    }

    public void setAcceptable(boolean acceptable){
        this.acceptable = acceptable;
    }


    protected void dump(){
        dump(this, new HashSet<State>());
    }

    /**
     * 打印FSA中的所有状态
     * @param state
     * @param dumpedStates
     */
    private static void dump(State state, Set<State> dumpedStates){
        System.out.println(state);
        dumpedStates.add(state);
        for (Transition transition: state.transitions()){
            State state2 = state.getState(transition);
            if (!dumpedStates.contains(state2)){
                dump(state2, dumpedStates);
            }
        }
    }

    public String getName() {
        return name;
    }

    public GrammarNode getGrammarNode() {
        return grammarNode;
    }

    public void setGrammarNode(GrammarNode grammarNode) {
        this.grammarNode = grammarNode;
    }
}
