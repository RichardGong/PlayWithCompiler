package play.parser;

import java.util.*;

/**
 * 正则表达式功能的测试
 */
public class Regex {

    public static void main(String args[]) {

        ///////////////////
        //第一个例子
        //正则表达式：int|[a-zA-Z][a-zA-Z0-9]*|[0-9]+
        //也就是：int关键字、标识符或数字字面量
        GrammarNode rootNode = sampleGrammar1();
        rootNode.dump();

        System.out.println("\nNFA states:");
        State[] states = regexToNFA(rootNode);
        states[0].dump();

        //用NFA来匹配
        matchWithNFA(states[0], "int");
        matchWithNFA(states[0], "intA");
        matchWithNFA(states[0], "23");
        matchWithNFA(states[0], "0A");

        //转换成DFA
        System.out.println("\nNFA to DFA:");
        List<DFAState> dfaStates = NFA2DFA(states[0], CharSet.letterAndDigits);
        dfaStates.get(0).dump();

        //用DFA来匹配
        matchWithDFA(dfaStates.get(0), "int");
        matchWithDFA(dfaStates.get(0), "intA");
        matchWithDFA(dfaStates.get(0), "23");
        matchWithDFA(dfaStates.get(0), "0A");


        ///////////////////
        //第二个例子
        //正则表达式：a[a-zA-Z0-9]*bc，也就是以a开头，bc结尾，中间可以是任何字母或数字

        GrammarNode rootNode2 = sampleGrammar2();
        rootNode2.dump();

        System.out.println("\nNFA states:");
        State[] states2 = regexToNFA(rootNode2);
        states2[0].dump();

        //用NFA来匹配
        matchWithNFA(states2[0], "abc");
        matchWithNFA(states2[0], "abcbbbcbc");
        matchWithNFA(states2[0], "abde");

        //转换成DFA
        System.out.println("\nNFA to DFA:");
        List<DFAState> dfaStates2 = NFA2DFA(states2[0], CharSet.letterAndDigits);
        dfaStates2.get(0).dump();

        //用DFA来匹配
        matchWithDFA(dfaStates2.get(0), "abc");
        matchWithDFA(dfaStates2.get(0), "abcbbbcbc");
        matchWithDFA(dfaStates2.get(0), "abcb");
    }


    /**
     * 把正则表达式翻译成NFA
     *
     * @param node
     * @return
     */
    public static State[] regexToNFA(GrammarNode node) {
        State beginState = null;
        State endState = null;

        switch (node.getType()) {
            //转换s|t
            case Or:
                beginState = new State(); //新的开始状态
                endState = new State(true); //新的接受状态
                for (GrammarNode child : node.children()) {
                    //递归，生成子图，返回头尾两个状态
                    State[] childState = regexToNFA(child);
                    //beginState，通过ε接到子图的开始状态
                    beginState.addTransition(new CharTransition(), childState[0]);
                    //子图的结束状态，通过ε接到endState
                    childState[1].addTransition(new CharTransition(), endState);
                    childState[1].setAcceptable(false);
                }
                break;
            //转换st
            case And:
                State[] lastChildState = null;
                for (int i = 0; i < node.getChildCount(); i++) {
                    State[] childState = regexToNFA(node.getChild(i)); //生成子图
                    if (lastChildState != null) {
                        //把前一个子图的接受状态和后一个子图的开始状态合并，把两个子图接到一起
                        lastChildState[1].copyTransitions(childState[0]);
                        lastChildState[1].setAcceptable(false);
                    }
                    lastChildState = childState;

                    if (i == 0) {
                        beginState = childState[0];  //整体的开始状态
                        endState = childState[1];
                    } else {
                        endState = childState[1];    //整体的接受状态
                    }
                }
                break;
            //处理普通的字符
            case Char:
                beginState = new State();
                endState = new State(true);
                //图的边上是当前节点的charSet，也就是导致迁移的字符的集合，比如所有字母
                beginState.addTransition(new CharTransition(node.getCharSet()), endState);
                break;

        }

        State[] rtn = null;

        //考虑重复的情况，增加必要的节点和边
        if (node.getMinTimes() != 1 || node.getMaxTimes() != 1) {
            rtn = addRepitition(beginState, endState, node);
        } else {
            rtn = new State[]{beginState, endState};
        }

        //为命了名的语法节点做标记，后面将用来设置Token类型。
        if (node.getName() != null) {
            rtn[1].setGrammarNode(node);
        }
        return rtn;
    }

    /**
     * 支持 * ？ +
     * 在两边增加额外的状态，并增加额外的连线
     *
     * @param state1
     * @param state2
     * @param node
     * @return
     */
    private static State[] addRepitition(State state1, State state2, GrammarNode node) {
        State beginState = null;
        State endState = null;

        //允许循环
        if (node.getMaxTimes() == -1 || node.getMaxTimes() > 1) {
            state2.addTransition(new CharTransition(node.getMaxTimes()), state1);
        }

        //允许0次，这时候要再加上两个节点
        if (node.getMinTimes() == 0) {
            beginState = new State();
            endState = new State(true);
            beginState.addTransition(new CharTransition(), state1);
            state2.addTransition(new CharTransition(), endState);
            state2.setAcceptable(false);

            beginState.addTransition(new CharTransition(), endState);
        } else {
            beginState = state1;
            endState = state2;
        }

        return new State[]{beginState, endState};
    }


    /**
     * 看看str是否符合NFA
     *
     * @param state NFA的起始状态
     * @param str
     * @return
     */
    private static boolean matchWithNFA(State state, String str) {
        System.out.println("NFA matching: '" + str + "'");
        char[] chars = str.toCharArray();
        int index = matchWithNFA(state, chars, 0);

        boolean match = index == chars.length;

        System.out.println("matched? : " + match + "\n");

        return match;
    }

    /**
     * 用NFA来匹配字符串
     * @param state 当前所在的状态
     * @param chars 要匹配的字符串，用数组表示
     * @param index1 当前匹配字符开始的位置。
     * @return 匹配后，新index的位置。指向匹配成功的字符的下一个字符。
     */
    private static int matchWithNFA(State state, char[] chars, int index1) {
        System.out.println("trying state : " + state.getName() + ", index =" + index1);

        int index2 = index1;

        for (Transition transition : state.transitions()) {
            State nextState = state.getState(transition);
            //epsilon转换
            if (transition.isEpsilon()) {
                index2 = matchWithNFA(nextState, chars, index1);
                if (index2 == chars.length) {
                    break;
                }
            }
            //消化掉一个字符，指针前移；
            else if (transition.match(chars[index1])) {
                index2++; //消耗掉一个字符

                if (index2 < chars.length) {
                    index2 = matchWithNFA(nextState, chars, index1 + 1);
                }
                //如果已经扫描完所有字符
                //检查当前状态是否是接受状态，或者可以通过epsilon到达接受状态
                //如果状态机还没有到达接受状态，本次匹配失败
                else {
                    if (acceptable(nextState)) {
                        break;
                    } else {
                        index2 = -1;
                    }
                }
            }
        }

        return index2;
    }


    private static boolean matchWithDFA(DFAState state, String str) {
        System.out.println("DFA matching: '" + str + "'");
        char[] chars = str.toCharArray();
        boolean match = matchWithDFA(state, chars, 0);

        System.out.println("matched? : " + match + "\n");

        return match;
    }

    /**
     * 基于DFA做字符串匹配
     *
     * @param state
     * @param chars
     * @param index
     * @return
     */
    private static boolean matchWithDFA(DFAState state, char[] chars, int index) {
        System.out.println("trying DFAState : " + state.getName() + ", index =" + index);
        //根据字符，找到下一个状态
        DFAState nextState = null;
        for (Transition transition : state.transitions()) {
            if (transition.match(chars[index])) {
                nextState = (DFAState) state.getState(transition);
                break;
            }
        }

        if (nextState != null) {
            //继续匹配字符串
            if (index < chars.length - 1) {
                return matchWithDFA(nextState, chars, index + 1);
            } else {
                //字符串已经匹配完毕
                //看看是否到达了接受状态
                if (nextState.isAcceptable()) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }


    /**
     * 查找当前状态是不是一个接受状态，或者可以通过epsilon迁移到一个接受状态。
     *
     * @param state
     * @return
     */
    private static boolean acceptable(State state) {
        if (state.isAcceptable()) {
            return true;
        }

        boolean rtn = false;

        for (Transition transition : state.transitions()) {
            if (transition.isEpsilon()) {
                State nextState = state.getState(transition);
                if (nextState.isAcceptable()) {
                    rtn = true;
                    break;
                } else {
                    rtn = acceptable(nextState);
                    if (rtn) {
                        break;
                    }
                }
            }
        }

        return rtn;
    }


    /**
     * 把NFA转换成DFA
     *
     * @param startState 起始的NFA状态
     * @param alphabet   该词法所采用的字符的集合
     * @return
     */
    protected static List<DFAState> NFA2DFA(State startState, List<Character> alphabet) {
        List<DFAState> dfaStates = new LinkedList<DFAState>();
        List<DFAState> newStates = new LinkedList<DFAState>();

        Map<State, Set<State>> calculatedClosures = new HashMap<State, Set<State>>();

        Set<State> stateSet = calcClosure(startState, calculatedClosures);
        DFAState dfaState = new DFAState(stateSet);
        dfaStates.add(dfaState);
        newStates.add(dfaState);

        //每次循环，都会计算出一些新的StateSet来。
        //如果没有新的了，计算结束。
        while (newStates.size() > 0) {
            List<DFAState> calculating = newStates;
            newStates = new LinkedList<DFAState>();

            for (DFAState dfaState2 : calculating) {
                //为字母表中的每个字母循环
                for (Character ch : alphabet) {
                    Set<State> nextStateSet = move(dfaState2.states(), ch);
                    if (nextStateSet.size() == 0) {
                        continue;
                    }

                    calcClosure(nextStateSet, calculatedClosures);

                    //看看是不是一个新的状态
                    dfaState = findDFAState(dfaStates, nextStateSet);
                    Transition transition = null;
                    if (dfaState == null) {
                        dfaState = new DFAState(nextStateSet);
                        dfaStates.add(dfaState);
                        newStates.add(dfaState);
                        transition = new CharTransition();
                        dfaState2.addTransition(transition, dfaState);
                    }

                    //复用已有的迁移
                    if (transition == null) {
                        transition = dfaState2.getTransitionTo(dfaState);
                        if (transition == null) {
                            transition = new CharTransition();
                            dfaState2.addTransition(transition, dfaState);
                        }
                    }

                    //往transition上添加字母
                    ((CharTransition)transition).condition.addSubSet(new CharSet(ch));
                }
            }

        }

        return dfaStates;
    }

    //根据NFA State集合，查找是否已经存在一个DFAState，包含同样的NFA状态集合
    private static DFAState findDFAState(List<DFAState> dfaStates, Set<State> states) {
        DFAState dfaState = null;
        for (DFAState dfaState1 : dfaStates) {
            if (sameStateSet(dfaState1.states(), states)) {
                dfaState = dfaState1;
                break;
            }
        }
        return dfaState;
    }

    //比较两个NFA state的集合是否相等
    private static boolean sameStateSet(Set<State> stateSet1, Set<State> stateSet2) {
        if (stateSet1.size() != stateSet2.size())
            return false;
        else {
            return stateSet1.containsAll(stateSet2);
        }
    }

    /**
     * 计算某个state通过epsilon能到达的所有State
     *
     * @param state
     * @return
     */
    private static Set<State> calcClosure(State state, Map<State, Set<State>> calculatedClosures) {
        if (calculatedClosures.keySet().contains(state)) {
            return calculatedClosures.get(state);
        }

        Set<State> closure = new HashSet<State>();
        closure.add(state); //加上自身
        for (Transition transition : state.transitions()) {
            if (transition.isEpsilon()) {
                State nextState = state.getState(transition);
                closure.add(nextState);
                closure.addAll(calcClosure(nextState, calculatedClosures));
            }
        }

        calculatedClosures.put(state, closure);
        return closure;
    }

    /**
     * 计算一个状态集合的闭包，包括这些状态以及可以通过epsilon到达的状态。
     *
     * @param states
     * @param calculatedClosures
     */
    private static void calcClosure(Set<State> states, Map<State, Set<State>> calculatedClosures) {
        Set<State> newStates = new HashSet<State>();
        for (State state : states) {
            Set<State> closure = calcClosure(state, calculatedClosures);
            newStates.addAll(closure);
        }

        states.addAll(newStates);
    }

    /**
     * 计算从某个状态集合，在接收某个字符以后，会迁移到哪些新的集合
     *
     * @param states
     * @param ch
     * @return
     */
    private static Set<State> move(Set<State> states, Character ch) {
        Set<State> rtn = new HashSet<State>();
        for (State state : states) {
            for (Transition transition : state.transitions()) {
                if (transition.match(ch)) {
                    State nextState = state.getState(transition);
                    rtn.add(nextState);
                }
            }
        }
        return rtn;
    }


    /**
     * 创建一个示例用的正则表达式：
     * int | [a-zA-z][a-zA-Z0-9]* | [0-9]*
     *
     * @return
     */
    private static GrammarNode sampleGrammar1() {
        GrammarNode node = new GrammarNode("regex1",GrammarNodeType.Or);

        //int关键字
        GrammarNode intNode = node.createChild(GrammarNodeType.And);
        intNode.createChild(new CharSet('i'));
        intNode.createChild(new CharSet('n'));
        intNode.createChild(new CharSet('t'));

        //标识符
        GrammarNode idNode = node.createChild(GrammarNodeType.And);
        GrammarNode firstLetter = idNode.createChild(CharSet.letter);

        GrammarNode letterOrDigit = idNode.createChild(CharSet.letterOrDigit);
        letterOrDigit.setRepeatTimes(0, -1);


        //数字字面量
        GrammarNode literalNode = node.createChild(CharSet.digit);
        literalNode.setRepeatTimes(1, -1);

        return node;
    }

    /**
     * 正则表达式：a[a-zA-Z0-9]*bc
     *
     * @return
     */
    private static GrammarNode sampleGrammar2() {
        GrammarNode node = new GrammarNode("regex2", GrammarNodeType.And);

        node.createChild(new CharSet('a'));
        GrammarNode letterOrDigit = node.createChild(CharSet.letterOrDigit);
        letterOrDigit.setRepeatTimes(0, -1);

        node.createChild(new CharSet('b'));
        node.createChild(new CharSet('c'));

        return node;
    }

}
