package play;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;

import java.util.HashSet;
import java.util.Set;

public class ClosureAnalyzer {
    AnnotatedTree at = null;

    public  ClosureAnalyzer(AnnotatedTree at){
        this.at = at;
    }

    /**
     * 对所有的函数做闭包分析。
     * 只做标准函数的分析，不做类的方法的分析。
     */
    public void analyzeClosures(){
        for (Type type : at.types){
            if (type instanceof Function && !((Function)type).isMethod()){
                Set set = calcClosureVariables((Function)type);
                if (set.size() > 0){
                    ((Function)type).closureVariables = set;
                }
            }
        }
    }

    /**
     * 为某个函数计算闭包变量，也就是它所引用的外部环境变量。
     * 算法：计算所有的变量引用，去掉内部声明的变量，剩下的就是外部的。
     * @param function
     * @return
     */
    private Set<Variable> calcClosureVariables(Function function){
        Set<Variable> refered = variablesReferedByScope(function);
        Set<Variable> declared = variablesDeclaredUnderScope(function);
        refered.removeAll(declared);
        return refered;
    }

    /**
     * 被一个Scope（包括下级Scope）内部的代码所引用的所有变量的集合
     * @param scope
     * @return
     */
    private Set<Variable> variablesReferedByScope(Scope scope){
        Set<Variable> rtn = new HashSet<>();

        ParserRuleContext scopeNode = scope.ctx;

        //扫面所有的符号引用。这对于大的程序性能不够优化，因为符号表太大。
        for(ParserRuleContext node : at.symbolOfNode.keySet()){
            Symbol symbol = at.symbolOfNode.get(node);
            if (symbol instanceof Variable && isAncestor(scopeNode, node)){
                rtn.add((Variable)symbol);
            }
        }

        return rtn;
    }

    /**
     * 看看node1是不是node2的祖先
     * @param node1
     * @param node2
     */
    private boolean isAncestor(RuleContext node1, RuleContext node2){
        if(node2.parent == null){
            return false;
        }
        else if(node2.parent == node1){
            return true;
        }
        else{
            return isAncestor(node1,node2.parent);
        }
    }

    /**
     * 在一个Scope（及）下级Scope中声明的所有变量的集合
     * @param scope
     * @return
     */
    private Set<Variable> variablesDeclaredUnderScope(Scope scope){
        Set<Variable> rtn = new HashSet<>();
        for (Symbol symbol: scope.symbols){
            if (symbol instanceof Variable){
                rtn.add((Variable)symbol);
            }
            else if (symbol instanceof Scope){
                rtn.addAll(variablesDeclaredUnderScope((Scope)symbol));
            }
        }

        return rtn;
    }

}
