package compiler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello Parser
 *
 */
public class SimpleParser2 {
    private TokenReader tokens = null;

    public static void main(String[] args) {
        SimpleParser2 parser = new SimpleParser2();
        try {
            ASTNode tree = parser.parse("3+5+2");
            parser.dumpAST(tree,"");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ASTNode parse(String code) throws Exception {
        SimpleLexer1 lexer = new SimpleLexer1();
        tokens = lexer.tokenize(code);
        // Token token = null;
        // while ((token= tokens.read())!=null){
        // System.out.println(token.getText());
        // }
        ASTNode rootNode = prog();
        return rootNode;
    }

    // 根节点
    private SimpleASTNode prog() throws Exception {
        SimpleASTNode node = new SimpleASTNode();
        node.nodeType = ASTNodeType.Programm;

        SimpleASTNode child = additive();
        node.addChild(child);
        return node;
    }

    private SimpleASTNode additive() throws Exception {
        SimpleASTNode node = null;
        SimpleASTNode child1 = multiplicative();
        Token token = tokens.peek();
        if (token.getType() == TokenType.Plus || token.getType() == TokenType.Minus) {
            SimpleASTNode child2 = additive2();
            if (child2 != null){
                node = new SimpleASTNode(ASTNodeType.AdditiveExp, token.getText());
                node.addChild(child1);
                node.addChild(child2);
            }
            else{
                node = child1;  //允许additive2的范围值为空
            }
        }
        return node;  
    }

    private SimpleASTNode additive2() throws Exception {
        SimpleASTNode node = null;
        SimpleASTNode child1 = multiplicative();
        if (child1 != null) {
            Token token = tokens.peek();
            if (token != null) {
                if (token.getType() == TokenType.Plus || token.getType() == TokenType.Minus) {
                    token = tokens.read();
                    SimpleASTNode child2 = additive();
                    if (child2 != null) {
                        node = new SimpleASTNode(ASTNodeType.AdditiveExp, token.getText());
                        node.addChild(child1);
                        node.addChild(child2);
                    } else {
                        throw new Exception("invalid additive expression, expecting the right part.");
                    }
                } else {
                    //throw new Exception("invalid additive expression, expecting + or -.");
                    node = child1;
                }
            }
            else{
                node = child1;
            }
        }
        return node;

    }

    private SimpleASTNode multiplicative() throws Exception {
        SimpleASTNode node = null;
        SimpleASTNode child1 = primary();
        if (child1 != null) {
            Token token = tokens.peek();
            if (token != null) {
                if (token.getType() == TokenType.Star || token.getType() == TokenType.Slash) {
                    token = tokens.read();
                    SimpleASTNode child2 = primary();
                    if (child2 != null) {
                        node = new SimpleASTNode(ASTNodeType.MulticativeExp,token.getText());
                        node.addChild(child1);
                        node.addChild(child2);
                    } else {
                        throw new Exception("invalid multiplicative expression, expecting the right part.");
                    }
                } else {
                    node = child1;
                    //throw new Exception("invalid multiplicative expression, expecting * or /.");
                }
            } else {
                node = child1;
            }
        }
        return node;
    }

    private SimpleASTNode primary() throws Exception {
        SimpleASTNode node = null;
        Token token = tokens.read();
        if (token != null) {
            if (token.getType() == TokenType.IntConstant) {
                node = new SimpleASTNode(ASTNodeType.PrimaryExp,token.getText());
            } else {
                throw new Exception("invalid multiplicative expression, expecting and int constant.");
            }
        } else {
            throw new Exception("invalid primary expression, out of token");
        }
        return node;
    }

    private class SimpleASTNode implements ASTNode {
        SimpleASTNode parent = null;
        List<ASTNode> children = new ArrayList<ASTNode>();
        List<ASTNode> readonlyChildren = Collections.unmodifiableList(children);
        ASTNodeType nodeType = null;
        String text = null;

        public SimpleASTNode(){

        }

        public SimpleASTNode(ASTNodeType nodeType, String text){
            this.nodeType = nodeType;
            this.text = text;
        }

        @Override
        public ASTNode getParent() {
            return parent;
        }

        @Override
        public List<ASTNode> getChildren() {
            return readonlyChildren;
        }

        @Override
        public ASTNodeType getType() {
            return nodeType;
        }

        @Override
        public String getText() {
            return text;
        }

        public void addChild(SimpleASTNode child) {
            children.add(child);
            child.parent = this;
        }

    }

    private void dumpAST(ASTNode node, String indent){
        System.out.println(indent + node.getType()+" "+node.getText());
        for(ASTNode child: node.getChildren()){
            dumpAST(child, indent+"\t");
        }
    }
}
