package play.parser;

import java.util.*;

/**
 * LL算法实现的语法解析器。
 * 包括：
 * 1.计算First集合；
 * 2.计算Follow集合
 * 3.通过递归下降算法，使用First和Follow集合实现带有预测能力的语法分析。
 *
 * 另外，里面计算First和Follow集合，都是基于GrammarNode来做的。有可能代码有点长，看起来费力。
 * 特别是计算Follow集合的时候，要考虑到如何计算产生式中最后一个元素的后面跟着的是谁。
 *
 * 如果不基于GrammarNode的结构，先转化成简单的产生式再计算，应该会更简单一些。抽空可能会再实现一个版本。
 *
 */
public class LLParser {

    public static void main(String args[]) {
        String script1 = "2+3*(4+5)";

        parse(script1, SampleGrammar.expressionGrammar());
    }

    /**
     * 解析代码，生成AST
     * @param script
     * @param grammar 所使用的语法的入口节点
     * @return
     */
    public static ASTNode parse(String script, GrammarNode grammar) {
        grammar.dump();

        //计算First集合
        Map<GrammarNode, Set<String>> firstSets = caclFirstSets(grammar);
        System.out.println("\nFIRST:");
        dumpFirstFollowSets(firstSets);

        //计算Follow集合
        Map<GrammarNode, Set<String>> followSets = caclFollowSets(grammar, firstSets);
        System.out.println("\nFOLLOW:");
        dumpFirstFollowSets(followSets);

        //词法分析
        List<Token> tokens = Lexer.tokenize(script);
        TokenReader tokenReader = new TokenReader(tokens);

        //语法分析
        ASTNode rootNode = match(grammar, tokenReader, firstSets, followSets);

        if (rootNode != null && rootNode != ASTNode.EpsilonNode) {
            rootNode.dump();
            return rootNode;
        }

        return null;
    }


    /**
     * 计算First集合。
     * 采用了不动点法。
     * @param grammar 入口的语法结点。
     * @return
     */
    public static Map<GrammarNode, Set<String>> caclFirstSets(GrammarNode grammar) {
        Map<GrammarNode, Set<String>> firstSets = new HashMap<GrammarNode, Set<String>>();

        boolean stable = calcFirstSets(grammar, firstSets, new HashSet<GrammarNode>());
        int i = 1;
        System.out.println("fcaclFirstSets round : " + i++);
        while (!stable) {
            System.out.println("caclFirstSets round : " + i++);
            stable = calcFirstSets(grammar, firstSets, new HashSet<GrammarNode>());
        }

        return firstSets;
    }

    /**
     * 对First集合做一次计算。
     * @param grammar
     * @param firstSets
     * @return 如果这次计算，First集合的成员都没有变动，则返回true。
     */
    private static boolean calcFirstSets(GrammarNode grammar,
                                         Map<GrammarNode, Set<String>> firstSets,
                                         Set<GrammarNode> calculated) {
        //标记正在计算该节点，避免重复调用
        calculated.add(grammar);

        //获取或创建First集合
        Set<String> firstSet = null;
        if (firstSets.containsKey(grammar)) {
            firstSet = firstSets.get(grammar);
        } else {
            firstSet = new HashSet<String>();
            firstSets.put(grammar, firstSet);
        }

        boolean stable = true;

        if (!grammar.isLeaf()) {
            //先把所有的子节点都计算一遍
            for (GrammarNode child : grammar.children()) {
                if (!child.isLeaf() && !calculated.contains(child)) {
                    calcFirstSets(child, firstSets, calculated);   //TODO 是否需要记录Stable
                }
            }

            List<GrammarNode> childToAdd = new LinkedList<GrammarNode>();

            if (grammar.getType() == GrammarNodeType.And) {
                childToAdd.add(grammar.getChild(0));

                //要一直找到一个不产生Epsilong的符号
                for (GrammarNode child : grammar.children()) {
                    childToAdd.add(child);
                    if (!child.isNullable()) {
                        break;
                    }
                }
            } else if (grammar.getType() == GrammarNodeType.Or) {
                for (GrammarNode child : grammar.children()) {
                    childToAdd.add(child);
                }
            }

            for (GrammarNode child : childToAdd) {
                if (!child.isLeaf()) {
                    Set<String> childSet = firstSets.get(child);

                    if (!firstSet.containsAll(childSet)) {
                        firstSet.addAll(childSet);
                        stable = false;
                    }
                } else if (child.isToken()) {
                    if (!firstSet.contains(child.getToken().getType())) {
                        stable = false;
                        firstSet.add(child.getToken().getType());
                    }
                }

                if (child.isNullable()) {
                    if (!firstSet.contains("EPSILON")) {
                        firstSet.add("EPSILON");
                    }
                }
            }
        }

        return stable;
    }


    /**
     * 计算Follow集合。
     * 对所有节点计算。
     * @param grammar 入口语法节点。
     * @return
     */
    public static Map<GrammarNode, Set<String>> caclFollowSets(GrammarNode grammar,
                                                               Map<GrammarNode, Set<String>> firstSets) {
        Map<GrammarNode, Set<String>> followSets = new HashMap<GrammarNode, Set<String>>();
        Map<GrammarNode, Set<GrammarNode>> rightChildrenSets = new HashMap<GrammarNode, Set<GrammarNode>>();

        //不动点法计算Follow集合
        int i = 1;
        System.out.println("follow set round : " + i++);
        boolean stable = caclFollowSets(grammar, followSets, rightChildrenSets,
                firstSets, new HashSet<GrammarNode>());

        while (!stable) {
            System.out.println("follow set round : " + i++);
            stable = caclFollowSets(grammar, followSets, rightChildrenSets,
                    firstSets, new HashSet<GrammarNode>());
        }

        //为根节点最右边的边，也就是所有可能出现在程序末尾的非终结符，加上$，也就是整个Token串结束符号
        Set<String> tempFollowSet = new HashSet<String>();
        tempFollowSet.add("$");
        addToRightChild(grammar, tempFollowSet, followSets, rightChildrenSets, new HashSet<GrammarNode>());

        //给根节点加上$。根节点如果没有被递归引用，不会出现在followSets中。
        Set<String> rootFollowSet = followSets.get(grammar);
        if (rootFollowSet == null) {
            rootFollowSet = new HashSet<String>();
            followSets.put(grammar, rootFollowSet);
        }
        rootFollowSet.add("$");

        return followSets;
    }

    /**
     * 计算一遍Follow节点
     * @param grammar
     * @param followSets
     * @return
     */
    private static boolean caclFollowSets(GrammarNode grammar,
                                          Map<GrammarNode, Set<String>> followSets,
                                          Map<GrammarNode, Set<GrammarNode>> rightChildrenSets,
                                          Map<GrammarNode, Set<String>> firstSets,
                                          Set<GrammarNode> calculated) {

        calculated.add(grammar);
        boolean stable = true;

        if (!grammar.isLeaf()) {
            Set<GrammarNode> rightChildren = rightChildrenSets.get(grammar);
            if (rightChildren == null) {
                rightChildren = new HashSet<GrammarNode>();
                rightChildrenSets.put(grammar, rightChildren);
            }

            if (grammar.getType() == GrammarNodeType.And) {
                for (int i = 0; i < grammar.getChildCount(); i++) {
                    GrammarNode left = grammar.getChild(i);

                    if (!left.isLeaf()) {
                        if (!calculated.contains(left)) {
                            if (!caclFollowSets(left, followSets, rightChildrenSets, firstSets, calculated)) {
                                stable = false;
                            }
                        }

                        Set<String> followSet = followSets.get(left);
                        if (followSet == null) {
                            followSet = new HashSet();
                            followSets.put(left, followSet);
                        }

                        if (i == grammar.getChildCount()) {
                            rightChildren.add(left);
                        } else {
                            boolean foundNotNull = false;
                            for (int j = i + 1; j < grammar.getChildCount(); j++) {
                                GrammarNode right = grammar.getChild(j);
                                Set<String> tempFollowSet = new HashSet<String>();
                                if (!right.isLeaf()) {
                                    if (firstSets.get(right) == null) {
                                        System.out.println("");
                                    }
                                    tempFollowSet.addAll(firstSets.get(right));
                                } else if (right.isToken()) {
                                    tempFollowSet.add(right.getToken().getType());
                                }

                                assert (tempFollowSet.size() > 0);
                                if (!followSet.containsAll(tempFollowSet)) {
                                    followSet.addAll(tempFollowSet);
                                    stable = false;
                                }

                                if (!addToRightChild(left, tempFollowSet, followSets, rightChildrenSets, new HashSet<GrammarNode>())) {
                                    stable = false;
                                }

                                if (!right.isNullable()) { //必须找到一个非空的
                                    foundNotNull = true;
                                    break;
                                }
                            }
                            //本节点也是最右节点
                            if (!foundNotNull) {
                                rightChildren.add(left);
                            }
                        }
                    }
                }
            } else if (grammar.getType() == GrammarNodeType.Or) {
                for (GrammarNode child : grammar.children()) {
                    if (!child.isLeaf()) {
                        rightChildren.add(child);
                        if (!calculated.contains(child)) {
                            if (!caclFollowSets(child, followSets, rightChildrenSets, firstSets, calculated)) {
                                stable = false;
                            }
                        }
                    }
                }
            }

        }

        return stable;
    }


    /**
     * 把某个节点的Follow集合，也给它所有右边分枝的后代节点。
     */
    private static boolean addToRightChild(GrammarNode grammar,
                                           Set<String> followSet,
                                           Map<GrammarNode, Set<String>> followSets,
                                           Map<GrammarNode, Set<GrammarNode>> rightChildrenSets,
                                           Set<GrammarNode> added) {

        added.add(grammar);

        boolean stable = true;
        Set<GrammarNode> rightChildren = rightChildrenSets.get(grammar);
        for (GrammarNode rightChild : rightChildren) {
            if (!rightChild.isLeaf() && !added.contains(rightChild)) {
                Set<String> childFollowSet = followSets.get(rightChild);
                if (childFollowSet == null) {
                    childFollowSet = new HashSet<String>();
                    followSets.put(rightChild, childFollowSet);
                }
                if (!childFollowSet.containsAll(followSet)) {
                    childFollowSet.addAll(followSet);
                    stable = false;
                }
                //递归向下
                if (!addToRightChild(rightChild, followSet, followSets, rightChildrenSets, added)) {
                    stable = false;
                }
            }
        }

        return stable;
    }


    /**
     * 语法分析
     * 匹配一个语法规则，生成一个AST节点
     *
     * @param grammar
     * @param tokenReader
     * @return
     */
    private static ASTNode match(GrammarNode grammar, TokenReader tokenReader,
                                 Map<GrammarNode, Set<String>> firstSets,
                                 Map<GrammarNode, Set<String>> followSets) {
        ASTNode node = new ASTNode(grammar.getName());


        if (grammar.getChildCount() > 0) {
            assert (grammar.getType() == GrammarNodeType.And || grammar.getType() == GrammarNodeType.Or);
            //对于And类型的，要每个子节点依次全部匹配
            if (grammar.getType() == GrammarNodeType.And) {
                for (GrammarNode child : grammar.children()) {
                    ASTNode childNode = match(child, tokenReader, firstSets, followSets);
                    //子节点匹配成功
                    if (childNode != null) {
                        if (childNode != ASTNode.EpsilonNode) {
                            node.addChild(childNode);
                        }
                    }
                    //子节点匹配失败，回溯，报错
                    else {
                        System.out.println("failed to match: " + child);
                        break;
                    }
                }
            }
            //对于Or类型的，通过预测，知道采用哪个产生式
            else if (grammar.getType() == GrammarNodeType.Or) {
                boolean matched = false;
                Token token = tokenReader.peek();
                for (GrammarNode child : grammar.children()) {
                    if (child.isToken()) {
                        if (token.getType().equals(child.getToken().getType())) {
                            matched = true;
                        }
                    } else if(child.getChildCount() > 0){
                        Set<String> firstSet = firstSets.get(child);
                        assert firstSet!=null;
                        if (firstSet.contains(token.getType())) {
                            matched = true;
                        }
                    }

                    if (matched) {
                        ASTNode childNode = match(child, tokenReader, firstSets, followSets);
                        if (childNode != null) {
                            if (childNode != ASTNode.EpsilonNode) {
                                node.addChild(childNode);
                            }
                        } else {
                            System.out.println("failed to match: " + child);
                        }
                        break;
                    }
                }
                if (!matched) {
                    //看看是否要产生Epsilon。这个时候要查看Follow集合
                    boolean epsilon = false;
                    if(grammar.isNullable()){
                        Set<String> followSet = followSets.get(grammar);
                        assert followSet!=null;
                        if (followSet.contains(token.getType())){
                            //System.out.println("epsilong generated");
                            node = ASTNode.EpsilonNode;
                            epsilon = true;
                        }
                    }
                    if (!epsilon) {
                        System.out.println("unable to find a selection for: " + grammar);
                    }
                }
            }
        } else if (grammar.getType() == GrammarNodeType.Epsilon) {
            node = ASTNode.EpsilonNode;
        }

        //叶子节点。看看自身的类型跟语法要求的是否一致
        else if (grammar.isToken()){
            Token token = tokenReader.peek();
            if (token != null) {
                assert grammar.getToken() != null;
                if (token.getType().equals(grammar.getToken().getType())) {
                    tokenReader.read();
                    node = new ASTNode(token.getType());
                    node.setText(token.getText());
                }
                //匹配失败
                else {
//                    success = false;
                }
            }
            //已经读完了所有的token
            else {
//                success = false;
            }
        }
        else{
            System.out.println("unsupported grammarNode : " + grammar);
        }

        //如果全部子节点返回的都是Epsilon，自身也置为Epsilon
        if (grammar.getChildCount() > 0 && node.getChildCount() == 0) {
            node = ASTNode.EpsilonNode;
        }

        return node;
    }


    //打印输出First或Follow集合。
    private static void dumpFirstFollowSets(Map<GrammarNode, Set<String>> sets) {
        for (GrammarNode node : sets.keySet()) {
            Set<String> set = sets.get(node);
            String str = node.toString() + " : ";
            for (String tokenName : set) {
                str += " " + tokenName;
            }
            System.out.println(str);
        }
    }


}
