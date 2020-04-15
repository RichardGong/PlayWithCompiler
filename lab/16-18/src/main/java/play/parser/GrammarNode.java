package play.parser;

import java.util.*;

/**
 * 能够表达EBNF的对象。
 * 1.每个GrammarNode可以有多个子节点；
 * 2.子节点之间可以是And关系，或Or关系，由type属性来确定。
 * 3.minTimes和maxTimes属性规定了该节点的重复次数。比如对于+号，minTimes=1，maxTimes=-1，-1代表很多个。
 * 4.该节点可以有名称，也就是词法规则和语法规则中左边的部分。如果没有起名称，系统会根据它的父节点的名称生成自己的缺省名称，
 * 并且以下划线开头。比如_add_Or_1。
 */
public class GrammarNode {
    //子节点
    private List<GrammarNode> children = new LinkedList<GrammarNode>();

    //节点类型
    private GrammarNodeType type = null;

    //用于词法规则，指该节点能匹配的字符的集合。其中Charset可以是一个树状结构，由多个子结合构成。比如：[a-z][A-Z][0-9]等。
    private CharSet charSet = null;

    //改节点可以重复的次数
    private int minTimes = 1;
    private int maxTimes = 1;

    //节点名称，可以作为Token名称或非终结符名称
    private String name = null;

    //语法规则中的Token，即终结符
    private Token token = null;

    //是否被词法处理器忽略，比如空白字符
    private boolean neglect = false;

    public static GrammarNode EPSILON = new GrammarNode(GrammarNodeType.Epsilon);

    protected GrammarNode(GrammarNodeType type){
        this.type = type;
    }

    protected GrammarNode(String name, GrammarNodeType type){
        this.name = name;
        this.type = type;
    }

    protected GrammarNode(String name, GrammarNodeType type, GrammarNode child, Token token){
        this.name = name;
        this.type = type;
        this.children.add(child);
        this.token = token;
    }

    protected GrammarNode(String name, GrammarNodeType type, List<GrammarNode> children, Token token){
        this.name = name;
        this.type = type;
        this.children.addAll(children);
        this.token = token;
    }

    protected GrammarNode(Token token){
        this.type = GrammarNodeType.Token;
        this.token = token;
    }

    protected GrammarNode(CharSet charSet){
        this.type = GrammarNodeType.Char;
        this.charSet = charSet;
    }

    protected GrammarNode(String name, CharSet charSet){
        this.name = name;
        this.type = GrammarNodeType.Char;
        this.charSet = charSet;
    }

    protected GrammarNode createChild(CharSet charSet){
        GrammarNode grammarNode = new GrammarNode(charSet);
        addChild(grammarNode);
        return grammarNode;
    }

    protected GrammarNode createChild(String name, CharSet charSet){
        GrammarNode grammarNode = new GrammarNode(name, charSet);
        addChild(grammarNode);
        return grammarNode;
    }

    protected GrammarNode createChild(GrammarNodeType type){
        GrammarNode grammarNode = new GrammarNode(type);
        addChild(grammarNode);
        return grammarNode;
    }

    protected GrammarNode createChild(String name, GrammarNodeType type){
        GrammarNode grammarNode = new GrammarNode(name, type);
        addChild(grammarNode);
        return grammarNode;
    }

    protected GrammarNode createChild(Token token){
        GrammarNode grammarNode = new GrammarNode(token);
        grammarNode.type = GrammarNodeType.Token;
        addChild(grammarNode);
        return grammarNode;
    }

    //添加子节点，并创建缺省名称
    protected void addChild(GrammarNode child){
        children.add(child);
        if (child.name == null){
            if (child.getGrammarName() != null) {
                child.name = "_" + child.getGrammarName() + children.size();
            }
            else{
                child.name = "_" + child.type + children.size();
            }

            if (this.name!=null){
                child.name = this.name + child.name;
            }
            if (child.name.charAt(0) != '_'){
                child.name = "_"+child.name;
            }
        }
    }

    /**
     * 是否是显式命名的子节点。词法规则中的Token、语法规则中的非终结符，都有名称。
     * @return
     */
    protected boolean isNamedNode(){
        if (name!= null && name.length()> 1 && name.charAt(0) != '_'){
            return true;
        }
        return false;
    }

    /**
     * 子节点列表。只读。
     * @return
     */
    public List<GrammarNode> children(){
        return Collections.unmodifiableList(children);
    }

    public int getChildCount(){
        return children.size();
    }

    public GrammarNode getChild(int index){
        return children.get(index);
    }

    //节点类型
    public GrammarNodeType getType(){ return type; }


    public String getName(){
        return name;
    }

    public String getGrammarName(){
        if (token!= null){
            return token.getType();
        }
        else if (isNamedNode()){
            return name;
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        GrammarNode node = (GrammarNode)obj;

        //类型相同
        if (node.type != type){
            return false;
        }

        //名称相同
        if (node.name == null){
            if (name != null){
                return false;
            }
        }
        else {
            if (!node.name.equals(name)){
                return false;
            }
        }

        //比较Token
        if(type == GrammarNodeType.Token){
            return token.equals(node.token);
        }
        //Epsilon
        else if (type == GrammarNodeType.Epsilon){
            return true;
        }
        //比较字符集合
        else if (type == GrammarNodeType.Char){
            return charSet.equals(node.charSet);
        }

        //子节点也相同
        if(children.size() != node.children.size()){
            return false;
        }

        for (int i = 0; i< children().size(); i++){
            if (!children.get(i).equals(node.children.get(i))){
                return false;
            }
        }

        return true;
    }

    /**
     * 以比较易读的方式显式。
     * @return
     */
    @Override
    public String toString(){
        if (type == GrammarNodeType.Epsilon) return "ε";

        String rtn = null;

        if (charSet!=null){
            rtn = charSet.toString();
        }
        else if (token != null){
            if (token.getText() != null){
                rtn = "'" + token.getText() + "'";
            }
            else {
                rtn = token.getType();
            }
        }
        else if (name != null){
            rtn = name;
        }
        else if (type != null){
            rtn = type.toString();
        }
        else{
            rtn = "GrammarNode";
        }

        if (minTimes != 1 || maxTimes !=1){
            if (minTimes == 0 && maxTimes == -1){
                rtn = rtn + "*";
            }
            else if (minTimes == 0 && maxTimes == 1){
                rtn = rtn + "?";
            }
            else if (minTimes == 1 && maxTimes == -1){
                rtn = rtn + "+";
            }
            else {
                rtn = rtn + "{" + minTimes + "," + maxTimes + "}";
            }
        }

        return rtn;
    }

    protected void setRepeatTimes(int minTimes, int maxTimes){
        this.minTimes = minTimes;
        this.maxTimes = maxTimes;
    }

    /**
     * 以文本方式显示Node。显式结果的格式与Antlr的文法格式相同。
     * 对于命名的节点，要把它的子节点都显示出来。
     * 比如：primary节点的：primary: ID | INT_LITERAL | add
     * @return
     */
    protected String getText(){
        String delim = null;

        if (type == GrammarNodeType.And){
            delim = " ";
        }
        else if (type == GrammarNodeType.Or){
            delim = " | ";
        }

        StringBuffer sb = new StringBuffer();
        if (children.size()>0){
            for (int i = 0; i< children.size(); i++){
                if (i > 0){
                    sb.append(delim);
                }
                GrammarNode child = children.get(i);
                if (child.isNamedNode()) {
                    sb.append(child.toString());
                }
                else {
                    sb.append(child.getText());
                }
            }
        }
        else{
            sb.append(this.toString());
        }

        String rtn = sb.toString();

        if (isNamedNode()) {
            rtn = wrapNamedNode(rtn);
        }
        else{
            if (type == GrammarNodeType.Or){
                rtn = "(" + rtn + ")";
            }
        }

        return rtn;
    }

    private String wrapNamedNode(String str){
        if (name != null){
            String header = name;
            if (name.length() <= 3) header += "\t";
            header+=("\t: ");
            return header + str + " ;";
        }
        return str;
    }

    /**
     * 把当前节点及下级节点以树状结构打印出来。
     */
    protected void dump(){
        if (isGraph(this, new HashSet<GrammarNode>())){
            dumpGraph(this, new HashSet<GrammarNode>());
        }
        else {
            dumpTree(this, "");
        }
    }

    /**
     * 打印正则表达式的树状结构
     * @param node
     * @param indent 缩进。每一级增加一个tab。
     */
    private static void dumpTree(GrammarNode node, String indent){
        if (node.isNamedNode()){
            System.out.println(indent + node.getText());
        }
        else {
            System.out.println(indent + node);
        }

        for (GrammarNode child : node.children){
            dumpTree(child, indent+"\t");
        }
    }

    /**
     * 打印图。因为存在循环引用，所以不能以树状的方式打印。
     * @param node
     * @param dumpedNodes
     */
    private static void dumpGraph(GrammarNode node, Set<GrammarNode> dumpedNodes){
        if (node.isNamedNode()){
            System.out.println(node.getText());
        }
        dumpedNodes.add(node);

        for (GrammarNode child : node.children){
            if (!dumpedNodes.contains(child)){
                dumpGraph(child, dumpedNodes);
            }
        }
    }

    /**
     * 以某节点作为起始节点，判断是树还是图。
     * @param node
     * @param scannedNodes
     * @return
     */
    private static boolean isGraph(GrammarNode node, Set<GrammarNode> scannedNodes){
        scannedNodes.add(node);
        for (GrammarNode child: node.children){
            if (scannedNodes.contains(child)){
                return true;
            }
        }

        for (GrammarNode child: node.children){
            boolean rtn = isGraph(child, scannedNodes);
            if (rtn) {
                return true;
            }
        }

        return false;
    }


    /**
     * 该节点是否是可空的，也就是能否返回Epsilon。算法：
     * 1.如果是Epsilon节点，或者是 *或 ?，可空。
     * 2.And节点：所有子节点都可空；
     * 3.Or节点：任意子节点可空。
     * 4.其他，不为空。
     * @return
     */
    public boolean isNullable(){
        boolean rtn = false;

        if (this.minTimes == 0 || this.type == GrammarNodeType.Epsilon){
            return true;
        }
        else if (this.type == GrammarNodeType.And) {
            boolean allNullable = true;
            for (GrammarNode child : children){
                if (!child.isNullable()){
                    allNullable = false;
                    break;
                }
            }
            rtn = allNullable;
        }
        else if (this.type ==  GrammarNodeType.Or){
            boolean anyNullable = false;
            for (GrammarNode child : children){
                if (child.isNullable()){
                    anyNullable = true;
                    break;
                }
            }
            rtn = anyNullable;
        }

        return rtn;
    }

    /**
     * 获得以本节点为起始节点，能到达的所有语法节点。
     * @return
     */
    protected List<GrammarNode> getAllNodes(){
        List <GrammarNode> allNodes = new LinkedList<GrammarNode>();

        getAllNodes(this,allNodes);

        return allNodes;
    }

    private static void getAllNodes(GrammarNode node, List <GrammarNode> allNodes){
        allNodes.add(node);
        for (GrammarNode child : node.children){
            if(!allNodes.contains(child)){
                getAllNodes(child, allNodes);
            }
        }
    }

    /**
     * 是否是叶子节点
     * @return
     */
    public boolean isLeaf(){
        return children.size() == 0;
    }

    /**
     * 是否代表一个Token
     * @return
     */
    public boolean isToken(){
        return token != null;
    }

    public CharSet getCharSet() {
        return charSet;
    }

    public int getMinTimes() {
        return minTimes;
    }

    public int getMaxTimes() {
        return maxTimes;
    }

    public Token getToken() {
        return token;
    }

    public boolean isNeglect() {
        return neglect;
    }

    public void setNeglect(boolean neglect){
        this.neglect = neglect;
    }
}