package play.parser;

import java.util.List;

public class RecursiveDecentParser {

    public static void main(String args[]){
        String script1 = "2+3*(4+5)";

        //用避免左递归的语法解析
        parse(script1, SampleGrammar.expressionGrammar());

        //用左递归语法解析
        //parse(script1, SampleGrammar.leftRecursiveExpressionGrammar());

        //解析语句
        String script2 = "if(a > 5){ a = 5;}";
        String script3 = "int a = 10; if(a > 5){ a = 5;}";
        //parse(script2, SampleGrammar.statementGrammar());

    }

    public static ASTNode parse(String script, GrammarNode grammar) {
        grammar.dump();

        List<Token> tokens = Lexer.tokenize(script);
        TokenReader tokenReader = new TokenReader(tokens);

        ASTNode rootNode = match(grammar, tokenReader);

        if (rootNode != null && rootNode != ASTNode.EpsilonNode){
            rootNode.dump();
            return rootNode;
        }

        return null;
    }


    /**
     * 判断能否匹配一个语法规则
     * @param grammar
     * @param tokenReader
     * @return
     */
    private static ASTNode match(GrammarNode grammar, TokenReader tokenReader){
        ASTNode node = new ASTNode(grammar.getName());

        int pos = tokenReader.getPosition();
        boolean success = true;

        if (grammar.getChildCount() > 0){
            assert (grammar.getType() == GrammarNodeType.And || grammar.getType() == GrammarNodeType.Or);
            //对于And类型的，要每个子节点依次全部匹配
            if (grammar.getType() == GrammarNodeType.And) {
                for (GrammarNode child : grammar.children()) {
                    ASTNode childNode = match(child, tokenReader);
                    //子节点匹配成功
                    if (childNode != null) {
                        if (childNode != ASTNode.EpsilonNode) {
                            node.addChild(childNode);
                        }
                    }
                    //子节点匹配失败，回溯
                    else {
                        success = false;
                        break;
                    }
                }
            }
            //对于Or类型的，要先匹配一个。不成功，就匹配第二个。
            else if (grammar.getType() == GrammarNodeType.Or){
                boolean matched = false;
                for (GrammarNode child : grammar.children()) {
                    ASTNode childNode = match(child, tokenReader);
                    if (childNode != null){
                        matched = true;
                        if (childNode != ASTNode.EpsilonNode) {
                            if(grammar.isNamedNode()) {
                                node.addChild(childNode);
                            }
                            else{
                                node = childNode;
                            }
                        }
                        break;
                    }
                }
                if (!matched) success = false;
            }
        }

        else if (grammar.getType() == GrammarNodeType.Epsilon){
            node = ASTNode.EpsilonNode;
        }

        //叶子节点。看看自身的类型跟语法要求的是否一致
        else{
            Token token = tokenReader.peek();
            if (token != null) {
                assert grammar.isToken();
                if (token.getType().equals(grammar.getToken().getType())) {
                    tokenReader.read();
                    node = new ASTNode(token.getType());
                    node.setText(token.getText());
                }
                //匹配失败
                else {
                    success = false;
                }
            }
            //已经读完了所有的token
            else{
                success = false;
            }
        }

        //通过后续节点，判断是否成功
        Token token = tokenReader.peek();
        if (token != null && grammar.isNamedNode()) {
            if(grammar.getName().equals("add")){
                System.out.println("add");
            }
            if (grammar.getName().equals("add") && (token.getType().equals("ADD") || token.getType().equals("SUB"))){
                success = false;
            }

            if (grammar.getName().equals("mul") && (token.getType().equals("MUL") || token.getType().equals("DIV"))){
                success = false;
            }
        }

        return node;
    }



}
