package craft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello Parser
 *
 */
public class SimpleParser {
    private TokenReader tokens = null;

    public static void main(String[] args) {

        SimpleParser parser = new SimpleParser();

        try {
            ASTNode tree = parser.parse("int age = 45; age+10*2;");
            parser.dumpAST(tree, "");

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public ASTNode parse(String code) throws Exception {
        SimpleLexer lexer = new SimpleLexer();
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
        SimpleASTNode node = new SimpleASTNode(ASTNodeType.Programm, "pwc");

        while (tokens.peek() != null) {
            SimpleASTNode child = expressionStatement();
            if (child == null) {
                child = intDeclare();
            }
            if (child == null) {
                child = assignmentStatement();
            }

            if (child != null) {
                node.addChild(child);
            } else {
                throw new Exception("unknown statement");
            }
        }

        return node;
    }

    private SimpleASTNode expressionStatement() throws Exception {
        int pos = tokens.getPosition();
        SimpleASTNode node = additive();
        if (node != null) {
            Token token = tokens.peek();
            if (token != null && token.getType() == TokenType.SemiColon) {
                tokens.read();
            } else {
                node = null;
                tokens.setPosition(pos); // 回溯
            }
        }
        return node;
    }

    private SimpleASTNode assignmentStatement() throws Exception {
        SimpleASTNode node = null;
        Token token = tokens.peek();
        if (token != null && token.getType() == TokenType.Identifier) {
            token = tokens.read();
            SimpleASTNode child = assignment();
            if (child != null) {
                node = new SimpleASTNode(ASTNodeType.AssignmentStmt, token.getText());
                node.addChild(child);
                token = tokens.peek();
                if (token != null && token.getType() == TokenType.SemiColon) {
                    tokens.read();
                } else {
                    throw new Exception("invalid statement, expecting semicolon");
                }
            } else {
                tokens.unread();
            }
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
                token = tokens.peek();
                if (token != null && token.getType() == TokenType.Assignment) {
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

            if (node != null) {
                token = tokens.peek();
                if (token != null && token.getType() == TokenType.SemiColon) {
                    tokens.read();
                } else {
                    throw new Exception("invalid statement, expecting semicolon");
                }
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
            node = additive();
            if (node == null) {
                throw new Exception("invalide assignment expression, expecting an additive expression");
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
        Token token = tokens.peek();
        if (token != null) {
            if (token.getType() == TokenType.IntConstant) {
                token = tokens.read();
                node = new SimpleASTNode(ASTNodeType.IntConstant, token.getText());
            } else if (token.getType() == TokenType.Identifier) {
                token = tokens.read();
                node = new SimpleASTNode(ASTNodeType.Identifier, token.getText());
            } else if (token.getType() == TokenType.LeftParen) {
                tokens.read();
                node = additive();
                if (node != null) {
                    token = tokens.peek();
                    if (token != null && token.getType() == TokenType.RightParen) {
                        tokens.read();
                    } else {
                        throw new Exception("expecting right parenthesis");
                    }
                } else {
                    throw new Exception("expecting an additive expression inside parenthesis");
                }
            }
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

    void dumpAST(ASTNode node, String indent) {
        System.out.println(indent + node.getType() + " " + node.getText());
        for (ASTNode child : node.getChildren()) {
            dumpAST(child, indent + "\t");
        }
    }
}
