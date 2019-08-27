package play;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class AnnotatedTree {
    // AST
    protected ParseTree ast = null;

    // 解析出来的所有类型，包括类和函数，以后还可以包括数组和枚举。类的方法也作为单独的要素放进去。
    protected List<Type> types = new LinkedList<Type>();

    // AST节点对应的Symbol
    protected Map<ParserRuleContext, Symbol> node2Symbol = new HashMap<ParserRuleContext, Symbol>();

    // AST节点对应的Scope，如for、函数调用会启动新的Scope
    protected Map<ParserRuleContext, Scope> node2Scope = new HashMap<ParserRuleContext, Scope>();

    // 用于做类型推断，每个节点推断出来的类型
    protected Map<ParserRuleContext, Type> node2Type = new HashMap<ParserRuleContext, Type>();

    // 编译后形成的scope树
    //protected Scope scopeTree = null;

    // class、function等对应的代码的位置，可以是AST节点，后面可以是IR
    //protected Map<Type, ParserRuleContext> type2Node = new HashMap<Type, ParserRuleContext>();

    //函数、类等引用的外部变量
    protected Map<Scope, List<Variable>> outerReference = new HashMap<Scope, List<Variable>>();

    protected AnnotatedTree() {
       
    }

    protected List<CompilationLog> logs = new LinkedList<CompilationLog>();

    protected void log(String message, ParserRuleContext ctx){
        CompilationLog log = new CompilationLog();
        log.ctx = ctx;
        log.message = message;
        log.line = ctx.getStart().getLine();
        log.positionInLine = ctx.getStart().getStartIndex();
        log.type = CompilationLog.ERROR;

        System.out.println(log);
    }

    /**
     * 通过名称查找Variable
     * 
     * @param scope
     * @param idName
     * @return
     */
    protected Variable lookupVariable(Scope scope, String idName) {
        Variable rtn = null;
        for (Symbol s : scope.symbols) {
            // typeType是可选的参数
            if (s instanceof Variable && s.name.equals(idName)) {
                rtn = (Variable) s;
                break;
            }
        }

        if (rtn == null && scope.enclosingScope != null) {
            rtn = lookupVariable(scope.enclosingScope, idName);
        }
        return rtn;
    }

    protected Boolean checkDuplicateVariable(Scope scope, String idName) {
        Boolean rtn = Boolean.FALSE;
        for (Symbol s : scope.symbols) {
            // typeType是可选的参数
            if (s instanceof Variable && s.name.equals(idName)) {
                rtn = true;
                break;
            }
        }

        //对于BlockScope，要继续往上查找
//        if (!rtn && scope instanceof BlockScope && scope.enclosingScope != null) {
//            rtn = checkDuplicateVariable(scope.enclosingScope, idName);
//        }
        return rtn;
    }

    /**
     * 通过名称查找Class
     * 
     * @param scope
     * @param idName
     * @return
     */
    protected Class lookupClass(Scope scope, String idName) {
        Class rtn = null;
        for (Symbol s : scope.symbols) {
            // typeType是可选的参数
            if (s instanceof Class && s.name.equals(idName)) {
                rtn = (Class) s;
                break;
            }
        }

        if (rtn == null && scope.enclosingScope != null) {
            rtn = lookupClass(scope.enclosingScope, idName);
        }
        return rtn;
    }

    protected Type lookupType(String idName) {   //TODO 单纯根据名称并不严密
        Type rtn = null;
        for (Type type : types) {
            // typeType是可选的参数
            if (type.getName().equals(idName)) {
                rtn = type;
                break;
            }
        }
        return rtn;
    }

    /**
     * 通过方法的名称和方法签名查找Function
     * 
     * @param scope
     * @param idName
     * @param params
     * @return
     */
    protected Function lookupFunction(Scope scope, String idName, List<Type> paramTypes) {
        Function rtn = null;
        for (Symbol s : scope.symbols) {
            // typeType是可选的参数
            if (s instanceof Function && s.name.equals(idName)) {
                Function function = (Function) s;

                if (paramTypes != null) {
                    // 比较每个参数
                    if (function.parameters.size() != paramTypes.size()) {
                        break;
                    }

                    boolean match = true;
                    for (int i = 0; i < paramTypes.size(); i++) {
                        Variable var = function.parameters.get(i);
                        Type type = paramTypes.get(i);
                        if (var.type != type) {  //TODO 这里应该做类型兼容性测试，只要类型能够转换，或者是其子类都可以。
                            match = false;
                            break;
                        }
                    }
                    if (match){
                        rtn = function;
                    }

                } else {
                    // TODO 临时的，弱比较，不比较参数
                    rtn = function;
                }

                if (rtn != null) {
                    break;
                }
            }
        }

        if (rtn == null && scope.enclosingScope != null) {
            rtn = lookupFunction(scope.enclosingScope, idName, paramTypes);
        }
        return rtn;
    }

}