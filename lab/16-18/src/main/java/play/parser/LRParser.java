package play.parser;

import java.util.*;

public class LRParser {

    public static void main(String args[]) {
        /*
        示例1
        这个例子跟文稿中的例子完全一致。操作符只有加法和乘法，没有减法和除法。
        大家可以看看它打印出的NFA和DFA，跟文稿对照着理解

        语法：
        add		: mul | add '+' mul ;
        mul		: pri | mul '*' pri ;
        pri		: INT_LITERAL | LPAREN add RPAREN ;
         */
        String script1 = "2+3*(4+5)";
        parse(script1, SampleGrammar.simpleLeftRecursiveExpressionGrammar());

        /*
        示例2
        带有加减乘除的语法，并且支持标识符
        NFA状态数：32，DFA状态数：17

        语法：
        expression	: add ;
        add		: mul | add ('+' | '-') mul ;
        mul		: pri | mul ('*' | '/') pri ;
        pri		: ID | INT_LITERAL | LPAREN expression RPAREN ;
         */
        String script2 = "a-3/(4+5)";
        parse(script2, SampleGrammar.leftRecursiveExpressionGrammar());

        /*
        示例3：
        更加完整的表达式语法
        NFA状态数：67，DFA状态数：33

        语法：
        expression	: assign ;
        assign	: equal | assign '=' equal ;
        equal	: rel | equal ('==' | '!=') rel ;
        rel		: add | rel ('>=' | '>' | '<=' | '<') add ;
        add		: mul | add ('+' | '-') mul ;
        mul		: pri | mul ('*' | '/') pri ;
        pri		: ID | INT_LITERAL | LPAREN expression RPAREN ;
         */
        String script3 = "a = 2-3 > (4+5)";   //带有赋值、比较等运算
        parse(script3, SampleGrammar.fullLeftRecursiveExpressionGrammar());

    }

    /**
     * 解析代码，生成AST
     * @param script
     * @param grammar 所使用的语法的入口节点
     * @return
     */
    public static ASTNode parse(String script, GrammarNode grammar) {
        System.out.println("Grammar:");
        grammar.dump();

        //转化成NFA
        List<GrammarNode> allNodes = new LinkedList<GrammarNode>();
        GrammarNFAState startNFAState = grammarToNFA(grammar, allNodes);
        System.out.println("\nNFA:");
        startNFAState.dump();

        //取下所有的命名元素的名称，包括非终结符名称和终结符的名称，待用
        List<String> grammarNames = new LinkedList<String>();
        List<String> tokenNames = new LinkedList<String>();
        for (GrammarNode node : allNodes) {
            String name = node.getGrammarName();
            if (name != null) {
                grammarNames.add(name);
                if (node.isToken()){
                    tokenNames.add(name);
                }
            }
        }

        //计算所有NFA状态的闭包
        Map<State, Set<State>> closures = calcClosure(startNFAState);
//        for (State state : closures.keySet()){
//            Set<State> closure = closures.get(state);
//            System.out.print("Closure " + state.getName() + " -> ");
//            for (State state1 : closure){
//                System.out.print(" " + state1.getName());
//            }
//            System.out.println();
//        }

        //把NFA转换成DFA
        List<DFAState> dfaStates = NFA2DFA(startNFAState, grammarNames, closures);
        System.out.println("\nDFA:");
        dfaStates.get(0).dump();

        //TODO：在这里可以检查语法是否合法，比如是否存在reduce/reduce或shift/reduce冲突

        //词法分析
        List<Token> tokens = Lexer.tokenize(script);
        TokenReader tokenReader = new TokenReader(tokens);

        //语法分析
        ASTNode rootNode = shiftReduce(new Stack<ASTNode>(), tokenReader, dfaStates.get(0));
        System.out.println("\nAST:");
        rootNode.dump();

        return rootNode;
    }


    /**
     * 通过移进、规约算法，做语法解析
     * @param stack
     * @param tokenReader
     * @return
     */
    private static ASTNode shiftReduce(Stack<ASTNode> stack, TokenReader tokenReader, DFAState startState) {
        Token token = tokenReader.peek();
        while (token != null){
            boolean reduced = false;

            //尝试做移进操作，可能会做多次。
            if (stack.size()>0){
                reduced = reduce(stack,token,startState);
            }

            //尝试做移进操作
            token = tokenReader.read();
            if(token != Token.EOF) {
                stack.push(new ASTNode(token.getType(), token.getText()));
            }

            if (!reduced && token == Token.EOF){
                System.out.println("expecting reduce action before EOF");
                break;
            }

            //刷新token的值
            token = tokenReader.peek();
        }

        //找到栈中剩下的元素，作为AST的根节点。
        //如果解析成功，栈里只会剩下一个节点，就是start节点。
        ASTNode rootNode = null;
        if (stack.size() == 1){
            if (stack.get(0).getType().equals("start")){
                rootNode = stack.get(0);
            }
            else{
                System.out.println("error, expecting the start node as root node");
            }
        }
        else {
            System.out.println("error, expecting 1 node in stack ");
        }

        return rootNode;
    }


    /**
     * 基于栈和左边第一个Token，判断正确的句柄，并做规约操作。
     * 成功的情况：
     * (1)可能做了多次reduce，最后nextToken匹配了当前句柄
     * (2)遇到了结尾$
     * @param stack
     * @param nextToken
     * @param startState
     * @return  如果做了移进操作，就返回true，否则返回false
     */
    private static boolean reduce(Stack<ASTNode> stack, Token nextToken, DFAState startState){
        boolean reduced = false;

        //在DFA中找到当前的状态
        DFAState currentState = startState;
        for (int i = 0; i< stack.size(); i++){
            String grammarName = stack.get(i).getType();
            currentState = currentState.getNextState(grammarName);
            assert currentState!=null;
        }

        //如果找不到下一个状态，那当前应该已经是start了。
        if (currentState == null){
            return false;
        }

        //在当前DFA的多个Item中，找到合适的句柄
        //1.首先看，哪个能支持继续Shift，而不是reduce
        //比如：add->add .+ mul
        if (nextToken != Token.EOF) {
            for (State state : currentState.states()) {
                Item item = ((GrammarNFAState) state).item;
                String grammarName = item.getNextGrammarName();
                if (grammarName != null) {
                    if (nextToken.getType().equals(grammarName)) {
                        return false;
                    }
                }
            }
        }

        //2.接下来，要找到一个Item来做Reduce。
        //条件：找到.符号是在结尾的
        for (State state : currentState.states()) {
            Item item = ((GrammarNFAState) state).item;
            if (item.atEnd()){
                //Reduce到Item的左侧代表的语法节点
                String grammarName = item.production.lhs;
                ASTNode node = new ASTNode(grammarName);
                reduced = true;

                //添加子节点
                int delta = stack.size() - item.production.rhs.size();
                for(int i=delta; i< stack.size(); i++){
                    //产生式应该是跟栈的元素一致的
                    if (stack.get(i).getType().equals(item.production.rhs.get(i-delta))){
                        node.addChild(stack.get(i));
                    }
                    else {
                        System.out.println("error reducing for: " + item);
                    }
                }

                //弹出这些子节点
                for (int i = 0; i< item.production.rhs.size();i++)
                    stack.pop();

                //添加父节点
                stack.push(node);

                //基于新的栈，继续做reduce
                reduce(stack, nextToken, startState);
            }
        }

        return reduced;
    }

    /**
     * 把语法翻译成NFA。
     *
     * @param grammar
     * @return
     */

    private static GrammarNFAState grammarToNFA(GrammarNode grammar, List<GrammarNode> allNodes) {

        //1.做一个起始节点，这样会有一个唯一的入口
        GrammarNode start = new GrammarNode("start", GrammarNodeType.And);
        start.addChild(grammar);

        ///////////////
        //2.把GrammarNode转换成用产生式表达的方式，这样处理起来逻辑更简单。

        //2.1获得所有的终结符和非终结符
        allNodes.addAll(start.getAllNodes());

        //2.2从名称查找GrammarNode的一个表
        Map<String, GrammarNode> nodes = new HashMap<String, GrammarNode>();
        for (GrammarNode node : allNodes) {
            nodes.put(node.getName(), node);
        }

        //2.3为每个GrammarNode中的命名节点生成一个或多个产生式。
        //比如，add -> add + mul | mul 会被拆成两个产生式：add->add + mul，以及 add->mul
        //但右边存在未被充分拆解，比如： add -> add (+ | -) mul。其中的（+|-）还需要进一步拆解。
        Set<Production> productions = new HashSet<Production>();
        generateProduction(nodes, productions);

        //2.4把产生式右边的Or节点都展开，变成最简单的产生式。
        //比如add -> add (+ | -) mul。其中的（+|-）还需要进一步拆解，变成两条：
        //add -> add + mul，以及 add-> add - mul
        simplifyProductions(nodes, productions);

        //打印所有产生式看看
        System.out.println("\nProductions:");
        for (Production production : productions) {
            System.out.println(production);
        }

        ////////////////
        //3.基于产生式生成NFA
        //3.1 先把每个产生式，都生成一个子图，子图中每个状态的Item的“.”的位置依次后移。
        //比如：add->.add+mul add->add.+mul add->add+.mul add->add+mul.
        Map<Production, GrammarNFAState> subGraphs = new HashMap<Production, GrammarNFAState>();
        List<GrammarNFAState> states = new LinkedList<GrammarNFAState>();
        calcSubGraphs(productions, subGraphs, states);

        //3.2把各个子图通过Epsilon转换连接在一起。比如：add->add+.mul 可以建立两条连接，分别是 mul->.mul * pri,以及 mul->.pri
        linkSubGraphs(subGraphs, states);

        //4.找到起始结点对应的State
        GrammarNFAState rootState = null;
        for (Production production : productions) {
            if (production.lhs.equals("start")) {
                rootState = subGraphs.get(production);
            }
        }

        return rootState;
    }

    /**
     * 为每个GrammarNode中的命名节点生成一个或多个产生式。
     * 比如，add -> add + mul | mul 会被拆成两个产生式：add->add + mul，以及 add->mul
     *
     * 但右边存在未被充分拆解，比如： add -> add (+ | -) mul。其中的（+|-）还需要进一步拆解。
     *
     * @param nodes
     * @param productions
     */
    private static void generateProduction(Map<String, GrammarNode> nodes, Set<Production> productions) {
        for (String name : nodes.keySet()) {
            GrammarNode node = nodes.get(name);
            if (node.isNamedNode()) {
                if (node.getType() == GrammarNodeType.Or) {
                    for (GrammarNode child : node.children()) {
                        Production production = new Production();
                        production.lhs = node.getName();
                        production.rhs.add(child.getName());
                        productions.add(production);
                    }
                } else if (node.getType() == GrammarNodeType.And) {
                    Production production = new Production();
                    production.lhs = node.getName();
                    for (GrammarNode child : node.children()) {
                        production.rhs.add(child.getName());
                    }
                    productions.add(production);
                }
            }
        }
    }

    /**
     * 把产生式右边的Or节点都展开，变成最简单的产生式。
     * 比如add -> add (+ | -) mul。其中的（+|-）还需要进一步拆解，变成两条：
     * add -> add + mul，以及 add-> add - mul
     * @param nodes
     * @param productions
     */
    private static void simplifyProductions(Map<String, GrammarNode> nodes, Set<Production> productions) {
        boolean modified = true;

        int round = 1;
        while (modified) {
            System.out.println("round:" + round++);
            Set<Production> toRemove = new HashSet<Production>();
            Set<Production> newProductions = new HashSet<Production>();
            for (Production production : productions) {
                for (int i = 0; i < production.rhs.size(); i++) {
                    String name = production.rhs.get(i);
                    GrammarNode node = nodes.get(name);
                    if (node != null && !node.isNamedNode()) {
                        if (node.getType() == GrammarNodeType.Or) {
                            toRemove.add(production);
                            for (int j = 0; j < node.getChildCount(); j++) {
                                //创建一个新的产生式
                                Production newProduction = new Production();
                                newProduction.lhs = production.lhs;
                                //拷贝or左边的部分
                                for (int k = 0; k < i; k++)
                                    newProduction.rhs.add(production.rhs.get(k));
                                //把or的子节点替换上来
                                if (node.getChild(j).isToken()) {
                                    newProduction.rhs.add(node.getChild(j).getToken().getType());
                                } else {
                                    newProduction.rhs.add(node.getChild(j).getName());
                                }
                                //拷贝or右边的部分
                                for (int k = i + 1; k < production.rhs.size(); k++)
                                    newProduction.rhs.add(production.rhs.get(k));

                                newProductions.add(newProduction);
                            }

                            break; //每次只替换右边的一个节点就行
                        } else if (node.getType() == GrammarNodeType.And) {
                            toRemove.add(production);
                            Production newProduction = new Production();
                            newProduction.lhs = production.lhs;

                            //拷贝add左边的部分
                            for (int k = 0; k < i; k++)
                                newProduction.rhs.add(production.rhs.get(k));
                            //把add的子节点替换上来
                            for (int j = 0; j < node.getChildCount(); j++) {
                                if (node.getChild(j).isToken()) {
                                    newProduction.rhs.add(node.getChild(j).getToken().getType());
                                } else {
                                    newProduction.rhs.add(node.getChild(j).getName());
                                }
                            }
                            //拷贝add右边的部分
                            for (int k = i + 1; k < production.rhs.size(); k++)
                                newProduction.rhs.add(production.rhs.get(k));

                            newProductions.add(newProduction);

                            break; //每次只替换右边的一个节点就行
                        } else if (node.getType() == GrammarNodeType.Token) {
                            toRemove.add(production);
                            Production newProduction = new Production();
                            newProduction.lhs = production.lhs;

                            //拷贝Token左边的部分
                            for (int k = 0; k < i; k++)
                                newProduction.rhs.add(production.rhs.get(k));
                            //把Token的子节点替换上来
                            newProduction.rhs.add(node.getToken().getType());

                            //拷贝add右边的部分
                            for (int k = i + 1; k < production.rhs.size(); k++)
                                newProduction.rhs.add(production.rhs.get(k));

                            newProductions.add(newProduction);
                        }

                        else if (node.getType() == GrammarNodeType.Epsilon) {
                            toRemove.add(production);
                            Production newProduction = new Production();
                            newProduction.lhs = production.lhs;

                            //拷贝Token左边的部分
                            for (int k = 0; k < i; k++)
                                newProduction.rhs.add(production.rhs.get(k));
                            //把Token的子节点替换上来
                            newProduction.rhs.add(node.getType().toString());

                            //拷贝add右边的部分
                            for (int k = i + 1; k < production.rhs.size(); k++)
                                newProduction.rhs.add(production.rhs.get(k));

                            newProductions.add(newProduction);
                        }
                    }
                }
            }

            //去掉旧的，替换成新的。
            modified = toRemove.size() > 0;


            productions.removeAll(toRemove);
            productions.addAll(newProductions);
        }
    }


    /**
     * 为每个production产生一个子图
     * 子图中每个状态的Item的“.”的位置依次后移。
     * 比如：add->.add+mul add->add.+mul add->add+.mul add->add+mul.
     *
     * @param productions
     * @return
     */
    private static void calcSubGraphs(Set<Production> productions, Map<Production,
            GrammarNFAState> subGraphs, List<GrammarNFAState> states) {
        for (Production production : productions) {
            Item item = new Item(production, 0);
            GrammarNFAState state = new GrammarNFAState(item);
            subGraphs.put(production, state);
            states.add(state);

            GrammarNFAState lastState = state;

            for (int i = 0; i < production.rhs.size(); i++) {
                item = new Item(production, i + 1);
                state = new GrammarNFAState(item);
                states.add(state);
                if (production.rhs.get(i).equals("Epsilon")) {
                    lastState.addTransition(new GrammarTransition(), state);
                }
                else{
                    lastState.addTransition(new GrammarTransition(production.rhs.get(i)), state);
                }
                lastState = state;
            }
        }
    }

    /**
     * 把各个子图通过Epsilon转换连接在一起。
     * 比如：add->add+.mul 可以建立两条连接，分别是 mul->.mul * pri,以及 mul->.pri
     * @param subGraphs
     * @param states
     */
    private static void linkSubGraphs(Map<Production, GrammarNFAState> subGraphs,
                                      List<GrammarNFAState> states) {
        for (GrammarNFAState state : states) {
            if (state.item.position < state.item.production.rhs.size()) {
                String grammarName = state.item.production.rhs.get(state.item.position);

                for (Production production : subGraphs.keySet()) {
                    if (production.lhs.equals(grammarName)) {
                        GrammarNFAState state1 = subGraphs.get(production);
                        state.addTransition(new GrammarTransition(), state1);
                    }
                }
            }
        }

    }

    //////////////////////////////////////////////////////////////////////
    ///生成DFA

    /**
     * 把NFA转换成DFA
     *
     * @param startState   起始的NFA状态
     * @param grammarNames 所有符号的集合，包括终结符和非终结符
     * @return
     */
    protected static List<DFAState> NFA2DFA(State startState, List<String> grammarNames,
                                            Map<State, Set<State>> closures) {
        List<DFAState> dfaStates = new LinkedList<DFAState>();
        List<DFAState> newStates = new LinkedList<DFAState>();

        Set<State> stateSet = closures.get(startState);
        DFAState dfaState = new DFAState(stateSet);
        dfaStates.add(dfaState);
        newStates.add(dfaState);

        //每次循环，都会计算出一些新的StateSet来。
        //如果没有新的了，计算结束。
        while (newStates.size() > 0) {
            List<DFAState> calculating = newStates;
            newStates = new LinkedList<DFAState>();

            for (DFAState dfaState2 : calculating) {
                //为每个grammarName循环
                for (String grammarName : grammarNames) {
                    Set<State> nextStateSet = move(dfaState2.states(), grammarName);
                    if (nextStateSet.size() == 0) {
                        continue;
                    }

                    //把nextStateSet中每个状态的闭包也加入进来
                    addClosure(nextStateSet, closures);

                    //看看是不是一个新的状态
                    dfaState = findDFAState(dfaStates, nextStateSet);
                    Transition transition = null;
                    if (dfaState == null) {
                        dfaState = new DFAState(nextStateSet);
                        dfaStates.add(dfaState);
                        newStates.add(dfaState);
                    }

                    transition = new GrammarTransition(grammarName);
                    dfaState2.addTransition(transition, dfaState);
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
     * 计算所有的节点的Closure
     *
     * @param state  起始状态。
     * @param
     * @return
     */
    private static Map<State,Set<State>> calcClosure(State state){
        Map<State,Set<State>> closures = new HashMap<State, Set<State>>();

        int i = 1;
        System.out.println("calcClosure round : " + i++);
        boolean stable = calcClosure(state, closures,new HashSet<State>());

        if (!stable){
            System.out.println("calcClosure round : " + i++);
            stable = calcClosure(state, closures,new HashSet<State>());
        }
        return closures;
    }

    private static boolean calcClosure(State state, Map<State,
            Set<State>> closures, Set<State> calculated) {

        calculated.add(state);
        Set<State> closure = null;
        if (closures.containsKey(state)) {
            closure = closures.get(state);
        } else {
            closure = new HashSet<State>();
            closures.put(state, closure);
        }

        boolean stable = true;

        if (!closure.contains(state)){
            closure.add(state);
            stable = false;
        }

        List<State> toAdd = new LinkedList<State>();
        for (Transition transition : state.transitions()){
            State nextState = state.getState(transition);
            if (transition.isEpsilon()){
                toAdd.add(nextState);
            }

            //把所有下级节点都计算一下
            boolean childStable = true;
            if (!calculated.contains(nextState)) {
                childStable = calcClosure(nextState, closures, calculated);
                if (!childStable)
                    stable = false;
            }
        }

        for(State state1: toAdd){
            Set<State> closure1 = closures.get(state1);
            if (!closure.containsAll(closure1)){
                closure.addAll(closure1);
                stable = false;
            }
        }

        return stable;
    }

    /**
     * 计算一个状态集合的闭包，包括这些状态以及可以通过epsilon到达的状态。
     *
     * @param states
     * @param calculatedClosures
     */
    private static void addClosure(Set<State> states, Map<State, Set<State>> calculatedClosures) {
        Set<State> newStates = new HashSet<State>();
        for (State state : states) {
            Set<State> closure = calculatedClosures.get(state);
            if (closure == null){
                System.out.println("error : closure is null");
            }
            newStates.addAll(closure);
        }

        states.addAll(newStates);
    }

    /**
     * 计算从某个状态集合，在接收某个字符以后，会迁移到哪些新的集合
     *
     * @param states
     * @param grammarName
     * @return
     */
    private static Set<State> move(Set<State> states, String grammarName) {
        Set<State> rtn = new HashSet<State>();
        for (State state : states) {
            for (Transition transition : state.transitions()) {
                if (transition.match(grammarName)) {
                    State nextState = state.getState(transition);
                    rtn.add(nextState);
                }
            }
        }
        return rtn;
    }


    /**
     * 产生式
     */
    private static class Production {
        //产生式左侧，非终结符名称
        String lhs = "";
        //产生式右侧
        List<String> rhs = new LinkedList<String>();
        //GrammarNode grammar;

        Production() {
        }

        @Override
        public int hashCode() {
            return toString().hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;

            Production production = (Production)obj;

            if (!production.lhs.equals(lhs)) return false;

            if (production.rhs.size() != rhs.size()) return false;

            if (!production.rhs.containsAll(rhs)) return false;

            return true;
        }

        @Override
        public String toString() {
            StringBuffer sb = new StringBuffer();

            sb.append(lhs).append("->");
            for (int i = 0; i < rhs.size(); i++) {
                sb.append(rhs.get(i)).append(' ');
            }

            return sb.toString();
        }

    }

    /**
     * 一个Item就是带有“.”的产生式。
     * 我们用GrammarNode加上一个Position属性，来表示Item。
     * Position的值，代表所期待的下一个子节点。如果它的值是grammar的子节点数量，就意味着这个Grammar已经处理完了。
     */
    private static class Item {
        //该Item对应的产生式
        Production production = null;

        //点符号的位置。取值从0到grammar.getChildCount();
        int position = 0;

        Item(Production production, int position) {
            this.production = production;
            this.position = position;
        }

        //返回点符号后面的语法名称
        String getNextGrammarName(){
            if (position < production.rhs.size()){
                return production.rhs.get(position);
            }
            return null;
        }

        //点符号是否是在Item的末尾。
        boolean atEnd(){
            return position == production.rhs.size();
        }

        @Override
        public String toString() {
            StringBuffer sb = new StringBuffer();

            sb.append(production.lhs).append("->");
            for (int i = 0; i < production.rhs.size(); i++) {
                if (i == position) {
                    sb.append(". ");
                }
                sb.append(production.rhs.get(i)).append(' ');
            }

            if (position == production.rhs.size()) {
                sb.append('.');
            }

            return sb.toString();
        }
    }

    /**
     * 代表一个Item的NFA状态
     */
    private static class GrammarNFAState extends State {
        Item item;

        GrammarNFAState(Item item) {
            super();
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuffer sb = new StringBuffer();
            sb.append(item).append('\n');
            sb.append(super.toString());
            return sb.toString();
        }
    }

}
