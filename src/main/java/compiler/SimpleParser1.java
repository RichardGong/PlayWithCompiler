package compiler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.runtime.Token;

/**
 * Hello Parser
 *
 */
public class SimpleParser1 {
    private List<Token> tokens = null;

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    //根节点
    private void parseProg(){

    }

    private void matchAdditive(){

    }

    private void matchMultiplicative(){

    }

    private void matchPrimary(){
        
    }

        
    private class SimpleASTNode implements ASTNode {
        SimpleASTNode parent = null;
        List<ASTNode> children = new ArrayList<ASTNode>();
        List<ASTNode> readonlyChildren=Collections.unmodifiableList(children);
        String nodeType=null;
        String text=null;

        @Override
        public ASTNode getParent() {
            return parent;
        }

        @Override
        public List<ASTNode> getChildren() {
            return readonlyChildren;
        } 

        @Override
        public String getNodeTpye() {
            return nodeType;
        }

        @Override
        public String getText() {
            return text;
        }

    }
}


