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

        String script2 = "int a = 0; a>3;";
        parse(script2, SampleGrammar.statementGrammar());

        String script3 = "int a = 0; if(a<3) a=3;";
        parse(script3, SampleGrammar.statementGrammar());

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
        Map<GrammarNode, Set<String>> firstSets = FirstFollowSet.caclFirstSets(grammar);
        System.out.println("\nFIRST:");
        FirstFollowSet.dumpFirstFollowSets(firstSets);

        //计算Follow集合
        Map<GrammarNode, Set<String>> followSets = FirstFollowSet.caclFollowSets(grammar, firstSets);
        System.out.println("\nFOLLOW:");
        FirstFollowSet.dumpFirstFollowSets(followSets);

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


}
