package script2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class CompilationRecord {
    //AST
    protected ParseTree ast = null;

    //解析出来的所有类型，包括类和函数，以后还可以包括数组和枚举。类的方法也作为单独的要素放进去。
    protected List<Type> types = new LinkedList<Type>();

    // AST节点对应的Symbol
    protected Map<ParserRuleContext, Symbol> node2Symbol = new HashMap<ParserRuleContext, Symbol>();

    // AST节点对应的Scope，如for、函数调用会启动新的Scope
    protected Map<ParserRuleContext, Scope> node2Scope = new HashMap<ParserRuleContext, Scope>();

    // 编译后形成的scope树
    protected Scope scopeTree = null;

    // class、method等对应的代码的位置，可以是AST节点，后面可以是IR
    protected Map<Type, ParserRuleContext> type2Node = new HashMap<Type, ParserRuleContext>();

    /**
     * 通过id查找Symbol
     * 
     * @param scope
     * @param idName
     * @return
     */
    // TODO 如果支持方法重载，还需要比较方法签名
    protected Symbol findSymbol(Scope scope, String idName) {
        Symbol symbol = null;
        for (Symbol s : scope.symbols) {
            // typeType是可选的参数
            if (s.name.equals(idName)) {
                symbol = s;
                break;
            }
        }

        if (symbol == null) {
            symbol = findSymbol(scope.parent, idName);
        }
        return symbol;
    }

}