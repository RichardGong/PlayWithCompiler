package craft;

import java.util.List;

public interface ASTNode{
    public ASTNode getParent();   // do we really need this?
    public List<ASTNode> getChildren();
    public ASTNodeType getType();
    public String getText();
}