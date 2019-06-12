package pwc;

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
            ASTNode tree = parser.parse("2+3+4+5");
            parser.dumpAST(tree, "");

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

    private int evaluate(ASTNode node, String indent) {
        int result = 0;
        System.out.println(indent + "Calculating: " + node.getType());
        switch (node.getType()) {
        case Programm:
            for (ASTNode child : node.getChildren()) {
                result = evaluate(child, indent + "\t");
            }
            break;
        case AdditiveExp:
            ASTNode child1 = node.getChildren().get(0);
            int value1 = evaluate(child1, indent + "\t");
            ASTNode child2 = node.getChildren().get(1);
            int value2 = evaluate(child2, indent + "\t");
            if (node.getText().equals("+")) {
                result = value1 + value2;
            } else {
                result = value1 - value2;
            }
            break;
        case MulticativeExp:
            child1 = node.getChildren().get(0);
            value1 = evaluate(child1, indent + "\t");
            child2 = node.getChildren().get(1);
            value2 = evaluate(child2, indent + "\t");
            if (node.getText().equals("*")) {
                result = value1 * value2;
            } else {
                result = value1 / value2;
            }
            break;
        case PrimaryExp:
            result = Integer.valueOf(node.getText()).intValue();
            break;
        default:
        }
        System.out.println(indent + "Result: " + result);
        return result;
    }

    // 根节点
    private SimpleASTNode prog() throws Exception {
        SimpleASTNode node = new SimpleASTNode();
        node.nodeType = ASTNodeType.Programm;

        SimpleASTNode child = additive();
        node.addChild(child);
        return node;
    }

    private SimpleASTNode statement() throws Exception {
        SimpleASTNode node = new SimpleASTNode();
        return node;
    }

    private SimpleASTNode expressionStatement() throws Exception {
        SimpleASTNode node = new SimpleASTNode();
        return node;
    }
    
    private SimpleASTNode assignmentStatement() throws Exception {
        SimpleASTNode node = null;
        Token token = tokens.peek();
        if (token != null && token.getType() == TokenType.Identifier) {
            
        }
        return node;
    }

    private SimpleASTNode intDeclare() throws Exception {
        SimpleASTNode node = null;
        Token token = tokens.peek();
        if (token != null && token.getType() == TokenType.Int) {
            token = tokens.read();
            if (tokens.peek().getType() == TokenType.Identifier) {
                token = tokens.read();
                node = new SimpleASTNode(ASTNodeType.IntDeclaration, token.getText());
                if (tokens.peek().getType() == TokenType.Assignment) {
                    SimpleASTNode child = assignment();
                    if (child != null) {
                        node.addChild(child);
                    } else {
                        throw new Exception("expecting an assignment expression");
                    }
                }
            } else {
                throw new Exception("variable name expected");
            }
        }
        return node;
    }

    /**
     * 赋值表达式
     * 
     * @return
     * @throws Exception
     */
    private SimpleASTNode assignment() throws Exception {
        SimpleASTNode node = null;
        Token token = tokens.peek();
        if (token != null && token.getType() == TokenType.Assignment) {
            token = tokens.read();
            node = new SimpleASTNode(ASTNodeType.AssignmentExp, token.getText());
            token = tokens.peek();
            if (token != null) {
                SimpleASTNode child = additive();
                if (child != null){
                    node.addChild(child);
                }else{
                    throw new Exception("invalide assignment expression, expecting an additive expression");
                }
            } else {
                throw new Exception("unexpected end of token");
            }
        }
        return node;
    }

    private SimpleASTNode additive() throws Exception {
        SimpleASTNode child1 = multiplicative();
        SimpleASTNode node = child1;
        if (child1 != null) {
            while (true) {
                Token token = tokens.peek();
                if (token != null && (token.getType() == TokenType.Plus || token.getType() == TokenType.Minus)) {
                    token = tokens.read();
                    SimpleASTNode child2 = multiplicative();
                    node = new SimpleASTNode(ASTNodeType.AdditiveExp, token.getText());
                    node.addChild(child1);
                    node.addChild(child2);
                    child1 = node;
                } else {
                    break;
                }
            }
        }
        return node;
    }

    private SimpleASTNode multiplicative() throws Exception {
        SimpleASTNode child1 = primary();
        SimpleASTNode node = child1;

        while (true) {
            Token token = tokens.peek();
            if (token != null && (token.getType() == TokenType.Star || token.getType() == TokenType.Slash)) {
                token = tokens.read();
                SimpleASTNode child2 = primary();
                node = new SimpleASTNode(ASTNodeType.MulticativeExp, token.getText());
                node.addChild(child1);
                node.addChild(child2);
                child1 = node;
            } else {
                break;
            }
        }

        return node;
    }

    private SimpleASTNode primary() throws Exception {
        SimpleASTNode node = null;
        Token token = tokens.read();
        if (token != null) {
            if (token.getType() == TokenType.IntConstant) {
                node = new SimpleASTNode(ASTNodeType.PrimaryExp, token.getText());
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

        public SimpleASTNode() {

        }

        public SimpleASTNode(ASTNodeType nodeType, String text) {
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

    private void dumpAST(ASTNode node, String indent) {
        System.out.println(indent + node.getType() + " " + node.getText());
        for (ASTNode child : node.getChildren()) {
            dumpAST(child, indent + "\t");
        }
    }
}
