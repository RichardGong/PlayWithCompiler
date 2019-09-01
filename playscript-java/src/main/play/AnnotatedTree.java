package play;

import java.util.*;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;


/**
 * 注释树。
 * 语义分析的结果都放在这里。跟AST的节点建立关联。包括：
 * 1.类型信息，包括基本类型和用户自定义类型；
 * 2.变量和函数调用的消解；
 * 3.作用域Scope。在Scope中包含了该作用域的所有符号。Variable、Function、Class等都是符号。
 */
public class AnnotatedTree {
    // AST
    protected ParseTree ast = null;

    // 解析出来的所有类型，包括类和函数，以后还可以包括数组和枚举。类的方法也作为单独的要素放进去。
    protected List<Type> types = new LinkedList<Type>();

    // AST节点对应的Symbol
    protected Map<ParserRuleContext, Symbol> symbolOfNode = new HashMap<ParserRuleContext, Symbol>();

    // AST节点对应的Scope，如for、函数调用会启动新的Scope
    protected Map<ParserRuleContext, Scope> node2Scope = new HashMap<ParserRuleContext, Scope>();

    // 用于做类型推断，每个节点推断出来的类型
    protected Map<ParserRuleContext, Type> typeOfNode = new HashMap<ParserRuleContext, Type>();

    // 命名空间
    NameSpace nameSpace = null;  //全局命名空间

    //语义分析过程中生成的信息，包括普通信息、警告和错误
    protected List<CompilationLog> logs = new LinkedList<CompilationLog>();


    protected AnnotatedTree() {

    }

    /**
     * 记录编译错误和警告
     * @param message
     * @param type  信息类型，ComplilationLog中的INFO、WARNING和ERROR
     * @param ctx
     */
    protected void log(String message,int type, ParserRuleContext ctx) {
        CompilationLog log = new CompilationLog();
        log.ctx = ctx;
        log.message = message;
        log.line = ctx.getStart().getLine();
        log.positionInLine = ctx.getStart().getStartIndex();
        log.type = type;

        logs.add(log);

        System.out.println(log);
    }

    public void log(String message, ParserRuleContext ctx) {
        this.log(message, CompilationLog.ERROR, ctx);
    }

    /**
     * 是否有编译错误
     * @return
     */
    protected boolean hasCompilationError(){
        for (CompilationLog log : logs){
            if (log.type == CompilationLog.ERROR){
                return true;
            }
        }
        return false;
    }

    /**
     * 通过名称查找Variable。逐级Scope查找。
     *
     * @param scope
     * @param idName
     * @return
     */
    protected Variable lookupVariable(Scope scope, String idName) {
        Variable rtn = scope.getVariable(idName);

        if (rtn == null && scope.enclosingScope != null) {
            rtn = lookupVariable(scope.enclosingScope, idName);
        }
        return rtn;
    }

    /**
     * 通过名称查找Class。逐级Scope查找。
     *
     * @param scope
     * @param idName
     * @return
     */
    protected Class lookupClass(Scope scope, String idName) {
        Class rtn = scope.getClass(idName);

        if (rtn == null && scope.enclosingScope != null) {
            rtn = lookupClass(scope.enclosingScope, idName);
        }
        return rtn;
    }

    protected Type lookupType(String idName) {   //TODO 单纯根据名称并不严密
        Type rtn = null;
        for (Type type : types) {
            if (type.getName().equals(idName)) {
                rtn = type;
                break;
            }
        }
        return rtn;
    }

    /**
     * 通过方法的名称和方法签名查找Function。逐级Scope查找。
     *
     * @param scope
     * @param idName
     * @param paramTypes
     * @return
     */
    protected Function lookupFunction(Scope scope, String idName, List<Type> paramTypes) {
        Function rtn = scope.getFunction(idName, paramTypes);


        if (rtn == null && scope.enclosingScope != null) {
            rtn = lookupFunction(scope.enclosingScope, idName, paramTypes);
        }
        return rtn;
    }

    /**
     * 查找函数型变量，逐级查找。
     * @param scope
     * @param idName
     * @param paramTypes
     * @return
     */
    protected Variable lookupFunctionVariable(Scope scope, String idName, List<Type> paramTypes) {
        Variable rtn = scope.getFunctionVariable(idName, paramTypes);

        if (rtn == null && scope.enclosingScope != null) {
            rtn = lookupFunctionVariable(scope.enclosingScope, idName, paramTypes);
        }
        return rtn;
    }


        /**
         * 逐级查找函数（或方法）。仅通过名字查找。如果有重名的，返回第一个就算了。//TODO 未来应该报警。
         * @param scope
         * @param name
         * @return
         */
    protected Function lookupFunction(Scope scope, String name){
        Function rtn = null;
        if (scope instanceof Class){
            rtn = getMethodOnlyByName((Class)scope, name);
        }
        else {
            rtn = getFunctionOnlyByName(scope, name);
        }

        if (rtn == null && scope.enclosingScope != null){
            rtn = lookupFunction(scope.enclosingScope,name);
        }

        return rtn;
    }

    //对于类，需要连父类也查找
    private Function getMethodOnlyByName(Class theClass, String name){
        Function rtn = getFunctionOnlyByName(theClass, name);

        if (rtn == null && theClass.getParentClass() != null){
            rtn = getMethodOnlyByName(theClass.getParentClass(), name);
        }

        return rtn;
    }

    private Function getFunctionOnlyByName(Scope scope, String name){
        for (Symbol s : scope.symbols){
            if (s instanceof Function && s.name.equals(name)){
                return  (Function)s;
            }
        }
        return  null;
    }


    /**
     * 查找某节点所在的Scope
     * 算法：逐级查找父节点，找到一个对应着Scope的上级节点
     *
     * @param node
     * @return
     */
    public Scope enclosingScopeOfNode(ParserRuleContext node) {
        Scope rtn = null;
        ParserRuleContext parent = node.getParent();
        if (parent != null) {
            rtn = node2Scope.get(parent);
            if (rtn == null) {
                rtn = enclosingScopeOfNode(parent);
            }

        }

        return rtn;
    }

    /**
     * 包含某节点的函数
     * @param ctx
     * @return
     */
    public Function enclosingFunctionOfNode(RuleContext ctx){
        if (ctx.parent instanceof PlayScriptParser.FunctionDeclarationContext){
            return (Function) node2Scope.get(ctx.parent);
        }
        else if (ctx.parent == null){
            return null;
        }
        else return enclosingFunctionOfNode(ctx.parent);
    }

    /**
     * 包含某节点的类
     * @param ctx
     * @return
     */
    public Class enclosingClassOfNode(RuleContext ctx){
        if (ctx.parent instanceof PlayScriptParser.ClassDeclarationContext){
            return (Class) node2Scope.get(ctx.parent);
        }
        else if (ctx.parent == null){
            return null;
        }
        else return enclosingClassOfNode(ctx.parent);
    }

    /**
     * 输出本Scope中的内容，包括每个变量的名称、类型。
     * @return 树状显示的字符串
     */
    public String getScopeTreeString(){
        StringBuffer sb = new StringBuffer();
        scopeToString(sb, nameSpace, "");
        return sb.toString();
    }

    private void scopeToString(StringBuffer sb, Scope scope, String indent){
        sb.append(indent).append(scope).append('\n');
        for (Symbol symbol : scope.symbols){
            if (symbol instanceof Scope){
                scopeToString(sb, (Scope)symbol, indent+"\t");
            }
            else{
                sb.append(indent).append("\t").append(symbol).append('\n');
            }
        }
    }


}