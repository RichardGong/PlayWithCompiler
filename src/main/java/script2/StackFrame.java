package script2;

public abstract class StackFrame {
    //Map<Variable, Object> variables = null;

    //该frame所对应的scope
    Scope scope = null;

    /**
     * 放parent scope所对应的frame的指针，就叫parentFrame吧，便于提高查找效率。
     * 规则：如果是同一级函数调用，跟上一级的parentFrame相同；
     * 如果是下一级的函数调用或For、If等block，parentFrame是自己；
     * 如果是一个闭包（如何判断？），那么要带一个存放在堆里的环境。
     */
    StackFrame parentFrame = null;

    protected abstract Object getValue(Variable variable);

    protected abstract void setValue(Variable variable, Object value);
    
    // public StackFrame(Scope scope){
    //     this.scope = scope;
    //     variables = new HashMap<Variable, Object>();
    // }    

    // //用于通过PlayObject来初始化一个frame
    // public StackFrame(Scope scope, Map<Variable, Object> variables){
    //     this.scope = scope;
    //     this.variables = variables;
    // }    
}