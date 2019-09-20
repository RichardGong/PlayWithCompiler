package play.parser;

import java.io.CharArrayReader;
import java.io.IOException;
import java.util.*;

/**
 * 一个词法分析器。可以根据正则表达式做词法分析。
 * 原理：
 * 1.把正则表达式转换成NFA，再转成DFA。
 * 2.要在NFA的State上标记关联的GrammarNode，以便区分被DFA识别出来的是哪种Token。这在Regex的regexToNFA中已经做了。
 */
public class Lexer extends Regex{
    public static void main(String args[]) {

        GrammarNode lexerGrammar = SampleGrammar.commonLexerGrammar();
        State[] nfaStates = regexToNFA(lexerGrammar);
        List<DFAState> dfaStates = NFA2DFA(nfaStates[0], CharSet.ascii);

        System.out.println("\ndump NFA:");
        nfaStates[0].dump();

        System.out.println("\ndump DFA:");
        dfaStates.get(0).dump();

        String code = "int i = 0; i + 100; if (a == 10) println(a); a <= b;";
        List<Token> tokens = tokenize(code, dfaStates.get(0), lexerGrammar);

        System.out.println("\nTokens:");
        for (Token token : tokens){
            System.out.println(token);
        }

    }


    /**
     * 把字符串解析成Token列表
     * @param str
     * @return
     */
    public static List<Token> tokenize(String str){
        GrammarNode lexerGrammar = SampleGrammar.commonLexerGrammar();
        State[] nfaStates = regexToNFA(lexerGrammar);
        List<DFAState> dfaStates = NFA2DFA(nfaStates[0],CharSet.ascii);
        List<Token> tokens = tokenize(str,dfaStates.get(0),lexerGrammar);
        //加上结束符号
        tokens.add(Token.EOF);
        return tokens;
    }

    /**
     * 逻辑：
     * 1.找到能消化接下来的字符的DFA；
     * 2.针对这个DFA一直给它发字符，直到不能接受；
     * 3.查看是否是处于结束状态。
     * @param str
     * @param startState
     * @return
     */
    private static List<Token> tokenize(String str, DFAState startState, GrammarNode root){
        List<Token> tokens = new LinkedList<Token>();

        tokens = new ArrayList<Token>();
        CharArrayReader reader = new CharArrayReader(str.toCharArray());

        DFAState currentState = startState;
        DFAState nextState = null;

        int ich = 0;
        char ch = 0;

        StringBuffer tokenText = new StringBuffer();
        try {
            while ((ich = reader.read()) != -1 || tokenText.length() > 0) { //第二个条件，是为了生成最后一个Token
                ch = (char) ich;

                boolean consumed = false;
                while (!consumed) {
                    nextState = currentState.getNextState(ch);
                    if (nextState == null) {
                        if (currentState == startState){
                            //不认识的字符， //TODO 忽略
                            consumed = true;
                        }
                        else if (currentState.isAcceptable()) {
                            //查找对应的词法规则
                            GrammarNode grammar = getGrammar(currentState, root);
                            assert grammar != null;

                            //创建Token
                            if (!grammar.isNeglect()) {  //空白字符会被忽略
                                Token token = new Token(grammar.getName(), tokenText.toString());
                                tokens.add(token);
                            }
                            tokenText = new StringBuffer();

                            //会到初始状态，重新匹配
                            currentState = startState;
                        } else {
                            //遇到了不认识的字符，没有到达结束态，但也无法迁移  //TODO 暂时忽略
                            consumed = true;
                        }
                    } else {
                        //做状态迁移
                        currentState = nextState;
                        //累积token的文本值
                        tokenText.append(ch);
                        consumed = true;
                    }
                }
            }
        } catch (IOException e) {
                e.printStackTrace();
        }

        return tokens;
    }

    /**
     * 检查DFAState中的各个NFAstate，看是否是某个词法规则的结束节点。
     * 注意：如果有符合两个词法规则，那么以宣布顺序的先后算。比如关键字和标识符就会重叠。
     * @param state
     * @param root
     * @return
     */
    private static GrammarNode getGrammar(DFAState state, GrammarNode root){
        //找出state符合的所有词法
        Set<GrammarNode> validGrammars = new HashSet<GrammarNode>();
        for (State child: state.states()){
            if (child.getGrammarNode() != null){
                validGrammars.add(child.getGrammarNode());
            }
        }

        //按顺序遍历词法规则，声明在前的优先级更高
        GrammarNode rtn = null;
        for (GrammarNode grammar: root.children()){
            if (grammar.getName()!= null){
                if(validGrammars.contains(grammar)){
                    rtn = grammar;
                    break;
                }
            }
        }
        return rtn;
    }


}
