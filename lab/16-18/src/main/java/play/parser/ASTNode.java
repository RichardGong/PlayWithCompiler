package play.parser;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * AST节点
 */
public class ASTNode {
    //AST类型，也就是非终结符名称或Token的类型
    private String type = null;

    //文本值
    private String text = null;

    //子节点
    private List<ASTNode> children = new LinkedList<ASTNode>();

    //父节点
    private ASTNode parent = null;

    //常量，Epsilon节点。某些语法会返回空节点。
    protected static ASTNode EpsilonNode = new ASTNode("Epsilon");

    protected ASTNode (String type){
        this.type = type;
    }

    protected ASTNode (String type, String text){
        this.type = type;
        this.text = text;
    }


    public String getType() {
        return type;
    }

    public String getText() {
        return text;
    }

    public List<ASTNode> children() {
        return Collections.unmodifiableList(children);
    }

    public int getChildCount(){
        return children.size();
    }

    public ASTNode getChild(int index){
        return children.get(index);
    }

    public ASTNode parent() {
        return parent;
    }

    public boolean isTerminal(){
        return children.size() == 0;
    }

    /**
     * 添加子节点的时候，如果子节点不是命名节点，直接把它的下级节点加进来。这样简化了AST。
     * @param child
     */
    protected void addChild(ASTNode child){
        if (child.isNamedNode()) {
            children.add(child);
            child.parent = this;
        }
        else{
            children.addAll(child.children);
            for (ASTNode node : child.children){
                node.parent = this;
            }
        }
    }

    protected void setText(String text){
        this.text = text;
    }

    /**
     * 是否是命名节点。
     * @return
     */
    protected boolean isNamedNode(){
        if (type!= null && type.length()> 1 && type.charAt(0) != '_'){
            return true;
        }
        return false;
    }

    /**
     * 树状结构打印自身以及下级节点。
     */
    protected void dump(){
        dump(this,"");
    }

    /**
     * 树状结构打印AST
     * @param node
     * @param indent
     */
    private static void dump(ASTNode node, String indent){
        String str = indent + node.type;
        if (node.text != null)
            str +=  "(" + node.text+")";
        System.out.println(str);

        for (ASTNode child : node.children){
            dump(child, indent + "\t");
        }
    }

}
