package play.parser;

import java.util.Map;
import java.util.Set;

/**
 * 文法规则的解析器。
 * 能读入EBNF语法，形成GrammarNode。在此基础上，可以进一步做词法分析和语法分析。
 */
public class GrammarParser {

    public static void main(String args[]) {
        String grammarString = "add : add AND mul; mul: mul MUL pri;";

        //ASTNode node = LRParser.parse(grammar, SampleGrammar.EBNFGrammar());

        String repeat = "a b c d";
        GrammarNode grammar = SampleGrammar.simpleRepeat();
        grammar.dump();
        ASTNode node = LRParser.parse(repeat, SampleGrammar.simpleRepeat());
        node.dump();

        //计算First集合
        Map<GrammarNode, Set<String>> firstSets = FirstFollowSet.caclFirstSets(grammar);
        System.out.println("\nFIRST:");
        FirstFollowSet.dumpFirstFollowSets(firstSets);

        //计算Follow集合
        Map<GrammarNode, Set<String>> followSets = FirstFollowSet.caclFollowSets(grammar, firstSets);
        System.out.println("\nFOLLOW:");
        FirstFollowSet.dumpFirstFollowSets(followSets);
    }

}
