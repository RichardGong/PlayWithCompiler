package compiler;

import java.util.List;

public interface ASTNode{
    public ASTNode getParent();
    public List<ASTNode> getChildren();
    public String getNodeTpye();
    public String getText();
}