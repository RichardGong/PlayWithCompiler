package play;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import play.PlayScriptParser.*;

/**
 * AST解释器。利用语义信息(AnnotatedTree)，在AST上解释执行脚本。
 */
public class ASTEvaluator extends PlayScriptBaseVisitor<Object> {

    // 之前的编译结果
    private AnnotatedTree at = null;

    // 堆，用于保存对象
    public ASTEvaluator(AnnotatedTree at) {
        this.at = at;
    }

    protected boolean traceStackFrame = false;

    protected boolean traceFunctionCall = false;

    ///////////////////////////////////////////////////////////
    /// 栈桢的管理
    private Stack<StackFrame> stack = new Stack<StackFrame>();

    /**
     * 栈桢入栈。
     * 其中最重要的任务，是要保证栈桢的parentFrame设置正确。否则，
     * (1)随着栈的变深，查找变量的性能会降低；
     * (2)甚至有可能找错栈桢，比如在递归(直接或间接)的场景下。
     * @param frame
     */
    private void pushStack(StackFrame frame) {
        if (stack.size() > 0) {
            //从栈顶到栈底依次查找
            for (int i = stack.size()-1; i>0; i--){
                StackFrame f = stack.get(i);

                /*
                如果新加入的栈桢，跟某个已有的栈桢的enclosingScope是一样的，那么这俩的parentFrame也一样。
                因为它们原本就是同一级的嘛。
                比如：
                void foo(){};
                void bar(foo());

                或者：
                void foo();
                if (...){
                    foo();
                }
                */
                if (f.scope.enclosingScope == frame.scope.enclosingScope){
                    frame.parentFrame = f.parentFrame;
                    break;
                }

                /*
                如果新加入的栈桢，是某个已有的栈桢的下一级，那么就把把这个父子关系建立起来。比如：
                void foo(){
                    if (...){  //把这个块往栈桢里加的时候，就符合这个条件。
                    }
                }
                再比如,下面的例子:
                class MyClass{
                    void foo();
                }
                MyClass c = MyClass();  //先加Class的栈桢，里面有类的属性，包括父类的
                c.foo();                //再加foo()的栈桢
                 */
                else if (f.scope == frame.scope.enclosingScope){
                    frame.parentFrame = f;
                    break;
                }

                /*
                这是针对函数可能是一等公民的情况。这个时候，函数运行时的作用域，与声明时的作用域会不一致。
                我在这里设计了一个“receiver”的机制，意思是这个函数是被哪个变量接收了。要按照这个receiver的作用域来判断。
                 */
                else if (frame.object instanceof FunctionObject){
                    FunctionObject functionObject = (FunctionObject)frame.object;
                    if (functionObject.receiver != null && functionObject.receiver.enclosingScope == f.scope) {
                        frame.parentFrame = f;
                        break;
                    }
                }
            }

            if (frame.parentFrame == null){
                frame.parentFrame = stack.peek();
            }
        }

        stack.push(frame);

        if (traceStackFrame){
            dumpStackFrame();
        }
    }

    private void popStack(){
        stack.pop();
    }

    private void dumpStackFrame(){
        System.out.println("\nStack Frames ----------------");
        for (StackFrame frame : stack){
            System.out.println(frame);
        }
        System.out.println("-----------------------------\n");
    }

    public LValue getLValue(Variable variable) {
        StackFrame f = stack.peek();

        PlayObject valueContainer = null;
        while (f != null) {
            if (f.scope.containsSymbol(variable)) { //对于对象来说，会查找所有父类的属性
                valueContainer = f.object;
                break;
            }
            f = f.parentFrame;
        }

        //通过正常的作用域找不到，就从闭包里找
        //原理：PlayObject中可能有一些变量，其作用域跟StackFrame.scope是不同的。
        if (valueContainer == null){
            f = stack.peek();
            while (f != null) {
                if (f.contains(variable)) {
                    valueContainer = f.object;
                    break;
                }
                f = f.parentFrame;
            }
        }

        MyLValue lvalue = new MyLValue(valueContainer, variable);

        return lvalue;
    }


    /**
     * 从栈顶开始，找到第一个ClassObject
     * 在调用类的方法时，需要找到实际的类。
     * @return
     */
    private ClassObject firstClassObjectInStack(){

        for (int i= stack.size()-1; i>0; i--){
            StackFrame stackFrame = stack.get(i);
            if (stackFrame.object instanceof ClassObject){
                return (ClassObject) stackFrame.object;
            }
        }
        return null;
    }

    ///////////////////////////////////////////////
    //为闭包获取环境变量的值

    /**
     * 为闭包获取环境变量的值
     * @param function 闭包所关联的函数。这个函数会访问一些环境变量。
     * @param valueContainer 存放环境变量的值的容器
     */
    private void getClosureValues(Function function, PlayObject valueContainer){
        if (function.closureVariables != null) {
            for (Variable var : function.closureVariables) {
                LValue lValue = getLValue(var); // 现在还可以从栈里取，退出函数以后就不行了
                Object value = lValue.getValue();
                valueContainer.fields.put(var, value);
            }
        }
    }

    /**
     * 为从函数中返回的对象设置闭包值。因为多个函数型属性可能共享值，所以要打包到ClassObject中，而不是functionObject中
     * @param classObject
     */
    private void getClosureValues(ClassObject classObject){
        //先放在一个临时对象里，避免对classObject即读又写
        PlayObject tempObject = new PlayObject();
        for ( Variable v : classObject.fields.keySet()) {
            if (v.type instanceof FunctionType) {
                Object object = classObject.fields.get(v);
                if (object != null) {
                    FunctionObject functionObject = (FunctionObject) object;
                    getClosureValues(functionObject.function, tempObject);
                }
            }
        }

        classObject.fields.putAll(tempObject.fields);
    }


    ///////////////////////////////////////////////
    //自己实现的左值对象。

    private final class MyLValue implements LValue {
        private Variable variable;
        private PlayObject valueContainer;

        public MyLValue(PlayObject valueContainer, Variable variable) {
            this.valueContainer = valueContainer;
            this.variable = variable;
        }

        @Override
        public Object getValue() {
            //对于this或super关键字，直接返回这个对象，应该是ClassObject
            if (variable instanceof This || variable instanceof Super){
                return valueContainer;
            }

            return valueContainer.getValue(variable);
        }

        @Override
        public void setValue(Object value) {
            valueContainer.setValue(variable, value);

            //如果variable是函数型变量，那改变functionObject.receiver
            if (value instanceof FunctionObject){
                ((FunctionObject) value).receiver = (Variable)variable;
            }
        }

        @Override
        public Variable getVariable() {
            return variable;
        }

        @Override
        public String toString() {
            return "LValue of " + variable.name + " : " + getValue();
        }

        @Override
        public PlayObject getValueContainer() {
            return valueContainer;
        }
    }

    ///////////////////////////////////////////////////////////
    /// 对象初始化

    //从父类到子类层层执行缺省的初始化方法，即不带参数的初始化方法。
    protected ClassObject createAndInitClassObject(Class theClass) {
        ClassObject obj = new ClassObject();
        obj.type = theClass;

        Stack<Class> ancestorChain = new Stack<Class>();

        // 从上到下执行缺省的初始化方法
        ancestorChain.push(theClass);
        while (theClass.getParentClass() != null) {
            ancestorChain.push(theClass.getParentClass());
            theClass = theClass.getParentClass();
        }

        // 执行缺省的初始化方法
        StackFrame frame = new StackFrame(obj);
        pushStack(frame);
        while (ancestorChain.size() > 0) {
            Class c = ancestorChain.pop();
            defaultObjectInit(c, obj);
        }
        popStack();

        return obj;
    }

    // 类的缺省初始化方法
    protected void defaultObjectInit(Class theClass, ClassObject obj) {
        for (Symbol symbol : theClass.symbols) {
            // 把变量加到obj里，缺省先都初始化成null，不允许有未初始化的
            if (symbol instanceof Variable) {
                obj.fields.put((Variable) symbol, null);
            }
        }

        // 执行缺省初始化
        ClassBodyContext ctx = ((ClassDeclarationContext) theClass.ctx).classBody();
        visitClassBody(ctx);
    }


    ///////////////////////////////////////////////////////////
    //内置函数

    //自己硬编码的println方法
    private void println(FunctionCallContext ctx){
        if (ctx.expressionList() != null) {
            Object value = visitExpressionList(ctx.expressionList());
            if (value instanceof LValue) {
                value = ((LValue) value).getValue();
            }
            System.out.println(value);
        }
        else{
            System.out.println();
        }
    }


    ///////////////////////////////////////////////////////////
    /// 各种运算
    private Object add(Object obj1, Object obj2, Type targetType) {
        Object rtn = null;
        if (targetType == PrimitiveType.String) {
            rtn = String.valueOf(obj1) + String.valueOf(obj2);
        } else if (targetType == PrimitiveType.Integer) {
            rtn = ((Number) obj1).intValue() + ((Number) obj2).intValue();
        } else if (targetType == PrimitiveType.Float) {
            rtn = ((Number) obj1).floatValue() + ((Number) obj2).floatValue();
        } else if (targetType == PrimitiveType.Long) {
            rtn = ((Number) obj1).longValue() + ((Number) obj2).longValue();
        } else if (targetType == PrimitiveType.Double) {
            rtn = ((Number) obj1).doubleValue() + ((Number) obj2).doubleValue();
        } else if (targetType == PrimitiveType.Short) {
            rtn = ((Number) obj1).shortValue() + ((Number) obj2).shortValue();
        }
        else {
            System.out.println("unsupported add operation");
        }

        return rtn;
    }

    private Object minus(Object obj1, Object obj2, Type targetType) {
        Object rtn = null;
        if (targetType == PrimitiveType.Integer) {
            rtn = ((Number) obj1).intValue() - ((Number) obj2).intValue();
        } else if (targetType == PrimitiveType.Float) {
            rtn = ((Number) obj1).floatValue() - ((Number) obj2).floatValue();
        } else if (targetType == PrimitiveType.Long) {
            rtn = ((Number) obj1).longValue() - ((Number) obj2).longValue();
        } else if (targetType == PrimitiveType.Double) {
            rtn = ((Number) obj1).doubleValue() - ((Number) obj2).doubleValue();
        } else if (targetType == PrimitiveType.Short) {
            rtn = ((Number) obj1).shortValue() - ((Number) obj2).shortValue();
        }

        return rtn;
    }

    private Object mul(Object obj1, Object obj2, Type targetType) {
        Object rtn = null;
        if (targetType == PrimitiveType.Integer) {
            rtn = ((Number) obj1).intValue() * ((Number) obj2).intValue();
        } else if (targetType == PrimitiveType.Float) {
            rtn = ((Number) obj1).floatValue() * ((Number) obj2).floatValue();
        } else if (targetType == PrimitiveType.Long) {
            rtn = ((Number) obj1).longValue() * ((Number) obj2).longValue();
        } else if (targetType == PrimitiveType.Double) {
            rtn = ((Number) obj1).doubleValue() * ((Number) obj2).doubleValue();
        } else if (targetType == PrimitiveType.Short) {
            rtn = ((Number) obj1).shortValue() * ((Number) obj2).shortValue();
        }

        return rtn;
    }

    private Object div(Object obj1, Object obj2, Type targetType) {
        Object rtn = null;
        if (targetType == PrimitiveType.Integer) {
            rtn = ((Number) obj1).intValue() / ((Number) obj2).intValue();
        } else if (targetType == PrimitiveType.Float) {
            rtn = ((Number) obj1).floatValue() / ((Number) obj2).floatValue();
        } else if (targetType == PrimitiveType.Long) {
            rtn = ((Number) obj1).longValue() / ((Number) obj2).longValue();
        } else if (targetType == PrimitiveType.Double) {
            rtn = ((Number) obj1).doubleValue() / ((Number) obj2).doubleValue();
        } else if (targetType == PrimitiveType.Short) {
            rtn = ((Number) obj1).shortValue() / ((Number) obj2).shortValue();
        }

        return rtn;
    }

    private Boolean EQ(Object obj1, Object obj2, Type targetType) {
        Boolean rtn = null;
        if (targetType == PrimitiveType.Integer) {
            rtn = ((Number) obj1).intValue() == ((Number) obj2).intValue();
        } else if (targetType == PrimitiveType.Float) {
            rtn = ((Number) obj1).floatValue() == ((Number) obj2).floatValue();
        } else if (targetType == PrimitiveType.Long) {
            rtn = ((Number) obj1).longValue() == ((Number) obj2).longValue();
        } else if (targetType == PrimitiveType.Double) {
            rtn = ((Number) obj1).doubleValue() == ((Number) obj2).doubleValue();
        } else if (targetType == PrimitiveType.Short) {
            rtn = ((Number) obj1).shortValue() == ((Number) obj2).shortValue();
        }
        //对于对象实例、函数，直接比较对象引用
        else {
            rtn = obj1 == obj2;
        }

        return rtn;
    }

    private Object GE(Object obj1, Object obj2, Type targetType) {
        Object rtn = null;
        if (targetType == PrimitiveType.Integer) {
            rtn = ((Number) obj1).intValue() >= ((Number) obj2).intValue();
        } else if (targetType == PrimitiveType.Float) {
            rtn = ((Number) obj1).floatValue() >= ((Number) obj2).floatValue();
        } else if (targetType == PrimitiveType.Long) {
            rtn = ((Number) obj1).longValue() >= ((Number) obj2).longValue();
        } else if (targetType == PrimitiveType.Double) {
            rtn = ((Number) obj1).doubleValue() >= ((Number) obj2).doubleValue();
        } else if (targetType == PrimitiveType.Short) {
            rtn = ((Number) obj1).shortValue() >= ((Number) obj2).shortValue();
        }

        return rtn;
    }

    private Object GT(Object obj1, Object obj2, Type targetType) {
        Object rtn = null;
        if (targetType == PrimitiveType.Integer) {
            rtn = ((Number) obj1).intValue() > ((Number) obj2).intValue();
        } else if (targetType == PrimitiveType.Float) {
            rtn = ((Number) obj1).floatValue() > ((Number) obj2).floatValue();
        } else if (targetType == PrimitiveType.Long) {
            rtn = ((Number) obj1).longValue() > ((Number) obj2).longValue();
        } else if (targetType == PrimitiveType.Double) {
            rtn = ((Number) obj1).doubleValue() > ((Number) obj2).doubleValue();
        } else if (targetType == PrimitiveType.Short) {
            rtn = ((Number) obj1).shortValue() > ((Number) obj2).shortValue();
        }

        return rtn;
    }

    private Object LE(Object obj1, Object obj2, Type targetType) {
        Object rtn = null;
        if (targetType == PrimitiveType.Integer) {
            rtn = ((Number) obj1).intValue() <= ((Number) obj2).intValue();
        } else if (targetType == PrimitiveType.Float) {
            rtn = ((Number) obj1).floatValue() <= ((Number) obj2).floatValue();
        } else if (targetType == PrimitiveType.Long) {
            rtn = ((Number) obj1).longValue() <= ((Number) obj2).longValue();
        } else if (targetType == PrimitiveType.Double) {
            rtn = ((Number) obj1).doubleValue() <= ((Number) obj2).doubleValue();
        } else if (targetType == PrimitiveType.Short) {
            rtn = ((Number) obj1).shortValue() <= ((Number) obj2).shortValue();
        }

        return rtn;
    }

    private Object LT(Object obj1, Object obj2, Type targetType) {
        Object rtn = null;
        if (targetType == PrimitiveType.Integer) {
            rtn = ((Number) obj1).intValue() < ((Number) obj2).intValue();
        } else if (targetType == PrimitiveType.Float) {
            rtn = ((Number) obj1).floatValue() < ((Number) obj2).floatValue();
        } else if (targetType == PrimitiveType.Long) {
            rtn = ((Number) obj1).longValue() < ((Number) obj2).longValue();
        } else if (targetType == PrimitiveType.Double) {
            rtn = ((Number) obj1).doubleValue() < ((Number) obj2).doubleValue();
        } else if (targetType == PrimitiveType.Short) {
            rtn = ((Number) obj1).shortValue() < ((Number) obj2).shortValue();
        }

        return rtn;
    }

    ////////////////////////////////////////////////////////////
    /// visit每个节点

    @Override
    public Object visitBlock(BlockContext ctx) {

        BlockScope scope = (BlockScope) at.node2Scope.get(ctx);
        if (scope != null){  //有些block是不对应scope的，比如函数底下的block.
            StackFrame frame = new StackFrame(scope);
            // frame.parentFrame = stack.peek();
            pushStack(frame);
        }


        Object rtn = visitBlockStatements(ctx.blockStatements());

        if (scope !=null) {
            popStack();
        }

        return rtn;
    }

    @Override
    public Object visitBlockStatement(BlockStatementContext ctx) {
        Object rtn = null;
        if (ctx.variableDeclarators() != null) {
            rtn = visitVariableDeclarators(ctx.variableDeclarators());
        } else if (ctx.statement() != null) {
            rtn = visitStatement(ctx.statement());
        }
        return rtn;
    }

    @Override
    public Object visitEnhancedForControl(EnhancedForControlContext ctx) {
        return super.visitEnhancedForControl(ctx);
    }

    @Override
    public Object visitExpression(ExpressionContext ctx) {
        Object rtn = null;
        if (ctx.bop != null && ctx.expression().size() >= 2) {
            Object left = visitExpression(ctx.expression(0));
            Object right = visitExpression(ctx.expression(1));
            Object leftObject = left;
            Object rightObject = right;

            if (left instanceof LValue) {
                leftObject = ((LValue) left).getValue();
            }

            if (right instanceof LValue) {
                rightObject = ((LValue) right).getValue();
            }

            //本节点期待的数据类型
            Type type = at.typeOfNode.get(ctx);

            //左右两个子节点的类型
            Type type1 = at.typeOfNode.get(ctx.expression(0));
            Type type2 = at.typeOfNode.get(ctx.expression(1));

            switch (ctx.bop.getType()) {
                case PlayScriptParser.ADD:
                    rtn = add(leftObject, rightObject, type);
                    break;
                case PlayScriptParser.SUB:
                    rtn = minus(leftObject, rightObject, type);
                    break;
                case PlayScriptParser.MUL:
                    rtn = mul(leftObject, rightObject, type);
                    break;
                case PlayScriptParser.DIV:
                    rtn = div(leftObject, rightObject, type);
                    break;
                case PlayScriptParser.EQUAL:
                    rtn = EQ(leftObject, rightObject, PrimitiveType.getUpperType(type1, type2));
                    break;
                case PlayScriptParser.NOTEQUAL:
                    rtn = !EQ(leftObject, rightObject, PrimitiveType.getUpperType(type1, type2));
                    break;
                case PlayScriptParser.LE:
                    rtn = LE(leftObject, rightObject, PrimitiveType.getUpperType(type1, type2));
                    break;
                case PlayScriptParser.LT:
                    rtn = LT(leftObject, rightObject, PrimitiveType.getUpperType(type1, type2));
                    break;
                case PlayScriptParser.GE:
                    rtn = GE(leftObject, rightObject, PrimitiveType.getUpperType(type1, type2));
                    break;
                case PlayScriptParser.GT:
                    rtn = GT(leftObject, rightObject, PrimitiveType.getUpperType(type1, type2));
                    break;

                case PlayScriptParser.AND:
                    rtn = (Boolean) leftObject && (Boolean) rightObject;
                    break;
                case PlayScriptParser.OR:
                    rtn = (Boolean) leftObject || (Boolean) rightObject;
                    break;
                case PlayScriptParser.ASSIGN:
                    if (left instanceof LValue) {
                        //((LValue) left).setValue(right);
                        ((LValue) left).setValue(rightObject);
                        rtn = right;
                    } else {
                        System.out.println("Unsupported feature during assignment");
                    }
                    break;

                default:
                    break;
            }
        } else if (ctx.bop != null && ctx.bop.getType() == PlayScriptParser.DOT) {
            // 此语法是左递归的，算法体现这一点
            Object leftObject = visitExpression(ctx.expression(0));
            if (leftObject instanceof LValue) {
                Object value = ((LValue) leftObject).getValue();
                if (value instanceof ClassObject) {
                    ClassObject valueContainer = (ClassObject) value;
                    Variable leftVar = (Variable)at.symbolOfNode.get(ctx.expression(0));
                    // 获得field或调用方法
                    if (ctx.IDENTIFIER() != null) {
                        Variable variable = (Variable) at.symbolOfNode.get(ctx);

                        //对于this和super引用的属性，不用考虑重载，因为它们的解析是准确的
                        if (!(leftVar instanceof This || leftVar instanceof Super)) {
                            //类的成员可能需要重载
                            variable = at.lookupVariable(valueContainer.type, variable.getName());
                        }
                        LValue lValue = new MyLValue(valueContainer, variable);
                        rtn = lValue;
                    } else if (ctx.functionCall() != null) {
                        //要先计算方法的参数，才能加对象的StackFrame.
                        if (traceFunctionCall){
                            System.out.println("\n>>MethodCall : " + ctx.getText());
                        }

                        rtn = methodCall(valueContainer, ctx.functionCall(), (leftVar instanceof Super));
                    }
                }
            } else {
                System.out.println("Expecting an Object Reference");
            }

        } else if (ctx.primary() != null) {
            rtn = visitPrimary(ctx.primary());
        }

        // 后缀运算，例如：i++ 或 i--
        else if (ctx.postfix != null) {
            Object value = visitExpression(ctx.expression(0));
            LValue lValue = null;
            Type type = at.typeOfNode.get(ctx.expression(0));
            if (value instanceof LValue) {
                lValue = (LValue) value;
                value = lValue.getValue();
            }
            switch (ctx.postfix.getType()) {
                case PlayScriptParser.INC:
                    if (type == PrimitiveType.Integer) {
                        lValue.setValue((Integer) value + 1);
                    } else {
                        lValue.setValue((Long) value + 1);
                    }
                    rtn = value;
                    break;
                case PlayScriptParser.DEC:
                    if (type == PrimitiveType.Integer) {
                        lValue.setValue((Integer) value - 1);
                    } else {
                        lValue.setValue((long) value - 1);
                    }
                    rtn = value;
                    break;
                default:
                    break;
            }
        }

        //前缀操作，例如：++i 或 --i
        else if (ctx.prefix != null) {
            Object value = visitExpression(ctx.expression(0));
            LValue lValue = null;
            Type type = at.typeOfNode.get(ctx.expression(0));
            if (value instanceof LValue) {
                lValue = (LValue) value;
                value = lValue.getValue();
            }
            switch (ctx.prefix.getType()) {
                case PlayScriptParser.INC:
                    if (type == PrimitiveType.Integer) {
                        rtn = (Integer) value + 1;
                    } else {
                        rtn = (Long) value + 1;
                    }
                    lValue.setValue(rtn);
                    break;
                case PlayScriptParser.DEC:
                    if (type == PrimitiveType.Integer) {
                        rtn = (Integer) value - 1;
                    } else {
                        rtn = (Long) value - 1;
                    }
                    lValue.setValue(rtn);
                    break;
                //!符号，逻辑非运算
                case PlayScriptParser.BANG:
                    rtn = !((Boolean) value);
                    break;
                default:
                    break;
            }
        } else if (ctx.functionCall() != null) {// functionCall
            rtn = visitFunctionCall(ctx.functionCall());
        }
        return rtn;
    }

    @Override
    public Object visitExpressionList(ExpressionListContext ctx) {
        Object rtn = null;
        for (ExpressionContext child : ctx.expression()) {
            rtn = visitExpression(child);
        }
        return rtn;
    }

    @Override
    public Object visitForInit(ForInitContext ctx) {
        Object rtn = null;
        if (ctx.variableDeclarators() != null) {
            rtn = visitVariableDeclarators(ctx.variableDeclarators());
        } else if (ctx.expressionList() != null) {
            rtn = visitExpressionList(ctx.expressionList());
        }
        return rtn;
    }

    @Override
    public Object visitLiteral(LiteralContext ctx) {
        Object rtn = null;

        //整数
        if (ctx.integerLiteral() != null) {
            rtn = visitIntegerLiteral(ctx.integerLiteral());
        }

        //浮点数
        else if (ctx.floatLiteral() != null) {
            rtn = visitFloatLiteral(ctx.floatLiteral());
        }

        //布尔值
        else if (ctx.BOOL_LITERAL() != null) {
            if (ctx.BOOL_LITERAL().getText().equals("true")) {
                rtn = Boolean.TRUE;
            } else {
                rtn = Boolean.FALSE;
            }
        }

        //字符串
        else if (ctx.STRING_LITERAL() != null) {
            String withQuotationMark = ctx.STRING_LITERAL().getText();
            rtn = withQuotationMark.substring(1, withQuotationMark.length() - 1);
        }

        //单个的字符
        else if (ctx.CHAR_LITERAL() != null) {
            rtn = ctx.CHAR_LITERAL().getText().charAt(0);
        }

        //null字面量
        else if (ctx.NULL_LITERAL() != null) {
            rtn = NullObject.instance();
        }

        return rtn;
    }

    @Override
    public Object visitIntegerLiteral(IntegerLiteralContext ctx) {
        Object rtn = null;
        if (ctx.DECIMAL_LITERAL() != null) {
            rtn = Integer.valueOf(ctx.DECIMAL_LITERAL().getText());
        }
        return rtn;
    }

    @Override
    public Object visitFloatLiteral(FloatLiteralContext ctx) {
        return Float.valueOf(ctx.getText());
    }

    @Override
    public Object visitParExpression(ParExpressionContext ctx) {
        return visitExpression(ctx.expression());
    }

    @Override
    public Object visitPrimary(PrimaryContext ctx) {
        Object rtn = null;
        //字面量
        if (ctx.literal() != null) {
            rtn = visitLiteral(ctx.literal());
        }
        //变量
        else if (ctx.IDENTIFIER() != null) {
            Symbol symbol = at.symbolOfNode.get(ctx);
            if (symbol instanceof Variable) {
                rtn = getLValue((Variable) symbol);
            } else if (symbol instanceof Function) {
                FunctionObject obj = new FunctionObject((Function) symbol);
                rtn = obj;
            }
        }
        //括号括起来的表达式
        else if (ctx.expression() != null){
            rtn = visitExpression(ctx.expression());
        }
        //this
        else if (ctx.THIS() != null){
            This thisRef = (This)at.symbolOfNode.get(ctx);
            rtn = getLValue(thisRef);
        }
        //super
        else if (ctx.SUPER() != null){
            Super superRef = (Super) at.symbolOfNode.get(ctx);
            rtn = getLValue(superRef);
        }

        return rtn;
    }

    @Override
    public Object visitPrimitiveType(PrimitiveTypeContext ctx) {
        Object rtn = null;
        if (ctx.INT() != null) {
            rtn = PlayScriptParser.INT;
        } else if (ctx.LONG() != null) {
            rtn = PlayScriptParser.LONG;
        } else if (ctx.FLOAT() != null) {
            rtn = PlayScriptParser.FLOAT;
        } else if (ctx.DOUBLE() != null) {
            rtn = PlayScriptParser.DOUBLE;
        } else if (ctx.BOOLEAN() != null) {
            rtn = PlayScriptParser.BOOLEAN;
        } else if (ctx.CHAR() != null) {
            rtn = PlayScriptParser.CHAR;
        } else if (ctx.SHORT() != null) {
            rtn = PlayScriptParser.SHORT;
        } else if (ctx.BYTE() != null) {
            rtn = PlayScriptParser.BYTE;
        }
        return rtn;
    }

    @Override
    public Object visitStatement(StatementContext ctx){
        Object rtn = null;
        if (ctx.statementExpression != null) {
            rtn = visitExpression(ctx.statementExpression);
        } else if (ctx.IF() != null) {
            Boolean condition = (Boolean) visitParExpression(ctx.parExpression());
            if (Boolean.TRUE == condition) {
                rtn = visitStatement(ctx.statement(0));
            } else if (ctx.ELSE() != null) {
                rtn = visitStatement(ctx.statement(1));
            }
        }

        //while循环
        else if (ctx.WHILE() != null) {
            if (ctx.parExpression().expression() != null && ctx.statement(0) != null) {

                while (true) {
                    //每次循环都要计算一下循环条件
                    Boolean condition = true;
                    Object value = visitExpression(ctx.parExpression().expression());
                    if (value instanceof LValue) {
                        condition = (Boolean) ((LValue) value).getValue();
                    } else {
                        condition = (Boolean) value;
                    }

                    if (condition) {
                        //执行while后面的语句
                        if (condition) {
                            rtn = visitStatement(ctx.statement(0));

                            //break
                            if (rtn instanceof BreakObject){
                                rtn = null;  //清除BreakObject，也就是只跳出一层循环
                                break;
                            }
                            //return
                            else if (rtn instanceof ReturnObject){
                                break;
                            }
                        }
                    }
                    else{
                        break;
                    }
                }
            }

        }

        //for循环
        else if (ctx.FOR() != null) {
            // 添加StackFrame
            BlockScope scope = (BlockScope) at.node2Scope.get(ctx);
            StackFrame frame = new StackFrame(scope);
            // frame.parentFrame = stack.peek();
            pushStack(frame);

            ForControlContext forControl = ctx.forControl();
            if (forControl.enhancedForControl() != null) {

            } else {
                // 初始化部分执行一次
                if (forControl.forInit() != null) {
                    rtn = visitForInit(forControl.forInit());
                }

                while (true) {
                    Boolean condition = true; // 如果没有条件判断部分，意味着一直循环
                    if (forControl.expression() != null) {
                        Object value = visitExpression(forControl.expression());
                        if (value instanceof LValue) {
                            condition = (Boolean) ((LValue) value).getValue();
                        } else {
                            condition = (Boolean) value;
                        }
                    }

                    if (condition) {
                        // 执行for的语句体
                        rtn = visitStatement(ctx.statement(0));

                        //处理break
                        if (rtn instanceof BreakObject){
                            rtn = null;
                            break;
                        }
                        //return
                        else if (rtn instanceof ReturnObject){
                            break;
                        }

                        // 执行forUpdate，通常是“i++”这样的语句。这个执行顺序不能出错。
                        if (forControl.forUpdate != null) {
                            visitExpressionList(forControl.forUpdate);
                        }
                    } else {
                        break;
                    }
                }
            }

            // 去掉StackFrame
            popStack();
        }

        //block
        else if (ctx.blockLabel != null) {
            rtn = visitBlock(ctx.blockLabel);

        }

        //break语句
        else if (ctx.BREAK() != null) {
            rtn = BreakObject.instance();
        }

        //return语句
        else if (ctx.RETURN() != null) {
            if (ctx.expression() != null) {
                rtn = visitExpression(ctx.expression());

                //return语句应该不需要左值   //TODO 取左值的场景需要优化，目前都是取左值。
                if (rtn instanceof LValue){
                    rtn = ((LValue)rtn).getValue();
                }

                // 把闭包涉及的环境变量都打包带走
                if (rtn instanceof FunctionObject) {
                    FunctionObject functionObject = (FunctionObject) rtn;
                    getClosureValues(functionObject.function, functionObject);
                }
                //如果返回的是一个对象，那么检查它的所有属性里有没有是闭包的。//TODO 如果属性仍然是一个对象，可能就要向下递归查找了。
                else if (rtn instanceof ClassObject){
                    ClassObject classObject = (ClassObject)rtn;
                    getClosureValues(classObject);
                }

            }

            //把真实的返回值封装在一个ReturnObject对象里，告诉visitBlockStatements停止执行下面的语句
            rtn = new ReturnObject(rtn);
        }
        return rtn;
    }

    @Override
    public Object visitSuperSuffix(SuperSuffixContext ctx) {
        return super.visitSuperSuffix(ctx);
    }

    @Override
    public Object visitSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) {
        return super.visitSwitchBlockStatementGroup(ctx);
    }

    @Override
    public Object visitSwitchLabel(SwitchLabelContext ctx) {
        return super.visitSwitchLabel(ctx);
    }

    @Override
    public Object visitTypeType(TypeTypeContext ctx) {
        return visitPrimitiveType(ctx.primitiveType());
    }

    @Override
    public Object visitVariableDeclarator(VariableDeclaratorContext ctx) {
        Object rtn = null;
        LValue lValue = (LValue) visitVariableDeclaratorId(ctx.variableDeclaratorId());
        if (ctx.variableInitializer() != null) {
            rtn = visitVariableInitializer(ctx.variableInitializer());
            if (rtn instanceof LValue) {
                rtn = ((LValue) rtn).getValue();
            }
            lValue.setValue(rtn);
        }
        return rtn;
    }

    @Override
    public Object visitVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
        Object rtn = null;
        Symbol symbol = at.symbolOfNode.get(ctx);
        rtn = getLValue((Variable) symbol);
        return rtn;
    }

    @Override
    public Object visitVariableDeclarators(VariableDeclaratorsContext ctx) {
        Object rtn = null;
        // Integer typeType = (Integer)visitTypeType(ctx.typeType()); //后面要利用这个类型信息
        for (VariableDeclaratorContext child : ctx.variableDeclarator()) {
            rtn = visitVariableDeclarator(child);
        }
        return rtn;
    }

    @Override
    public Object visitVariableInitializer(VariableInitializerContext ctx) {
        Object rtn = null;
        if (ctx.expression() != null) {
            rtn = visitExpression(ctx.expression());
        }
        return rtn;
    }

    @Override
    public Object visitBlockStatements(BlockStatementsContext ctx) {
        Object rtn = null;
        for (BlockStatementContext child : ctx.blockStatement()) {
            rtn = visitBlockStatement(child);

            //如果返回的是break，那么不执行下面的语句
            if (rtn instanceof BreakObject){
                break;
            }

            //碰到Return, 退出函数
            // TODO 要能层层退出一个个block，弹出一个栈桢
            else if (rtn instanceof ReturnObject){
                break;
            }
        }
        return rtn;
    }

    @Override
    public Object visitProg(ProgContext ctx) {
        Object rtn = null;
        pushStack(new StackFrame((BlockScope) at.node2Scope.get(ctx)));

        rtn = visitBlockStatements(ctx.blockStatements());

        popStack();

        return rtn;
    }

    @Override
    public Object visitFormalParameter(FormalParameterContext ctx) {
        return super.visitFormalParameter(ctx);
    }

    @Override
    public Object visitFormalParameterList(FormalParameterListContext ctx) {
        return super.visitFormalParameterList(ctx);
    }

    @Override
    public Object visitFormalParameters(FormalParametersContext ctx) {
        return super.visitFormalParameters(ctx);
    }

    @Override
    public Object visitFunctionCall(FunctionCallContext ctx) {
        //this
        if (ctx.THIS() != null){
            thisConstructor(ctx);
            return null;  //不需要有返回值，因为本身就是在构造方法里调用的。
        }
        //super
        else if (ctx.SUPER() != null){
            thisConstructor(ctx); //似乎跟this完全一样。因为方法的绑定是解析准确了的。
            return null;
        }

        //if (ctx.IDENTIFIER() == null) return null;  //暂时不支持this和super

        Object rtn = null;

        String functionName = ctx.IDENTIFIER().getText();  //这是调用时的名称，不一定是真正的函数名，还可能是函数尅性的变量名

        //如果调用的是类的缺省构造函数，则直接创建对象并返回
        Symbol symbol = at.symbolOfNode.get(ctx);
        if (symbol instanceof Class) {
            //类的缺省构造函数。没有一个具体函数跟它关联，只是指向了一个类。
            return createAndInitClassObject((Class) symbol);  //返回新创建的对象
        }
        //硬编码的一些函数
        else if(functionName.equals("println")){
            // TODO 临时代码，用于打印输出
            println(ctx);
            return rtn;
        }

        //在上下文中查找出函数，并根据需要创建FunctionObject
        FunctionObject functionObject = getFuntionObject(ctx);
        Function function = functionObject.function;

        //如果是对象的构造方法，则按照对象方法调用去执行，并返回所创建出的对象。
        if (function.isConstructor()) {
            Class theClass = (Class) function.enclosingScope;

            ClassObject newObject = createAndInitClassObject(theClass);  //先做缺省的初始化

            methodCall(newObject, ctx, false);

            return  newObject;  //返回新创建的对象。
        }

        //计算参数值
        List<Object> paramValues = calcParamValues(ctx);

        if (traceFunctionCall){
            System.out.println("\n>>FunctionCall : " + ctx.getText());
        }

        rtn = functionCall(functionObject, paramValues);

        return rtn;
    }

    /**
     * 计算某个函数调用时的参数值
     * @param ctx
     * @return
     */
    private List<Object> calcParamValues(FunctionCallContext ctx){
        List<Object> paramValues = new LinkedList<Object>();
        if (ctx.expressionList() != null) {
            for (ExpressionContext exp : ctx.expressionList().expression()) {
                Object value = visitExpression(exp);
                if (value instanceof LValue) {
                    value = ((LValue) value).getValue();
                }
                paramValues.add(value);
            }
        }
        return paramValues;
    }

    /**
     * 根据函数调用的上下文，返回一个FunctionObject。
     * 对于函数类型的变量，这个functionObject是存在变量里的；
     * 对于普通的函数调用，此时创建一个。
     * @param ctx
     * @return
     */
    private FunctionObject getFuntionObject(FunctionCallContext ctx){
        if (ctx.IDENTIFIER() == null) return null;  //暂时不支持this和super

        Function function = null;
        FunctionObject functionObject = null;

        Symbol symbol = at.symbolOfNode.get(ctx);
        //函数类型的变量
        if (symbol instanceof Variable) {
            Variable variable = (Variable) symbol;
            LValue lValue = getLValue(variable);
            Object value = lValue.getValue();
            if (value instanceof FunctionObject) {
                functionObject = (FunctionObject) value;
                function = functionObject.function;
            }
        }
        //普通函数
        else if (symbol instanceof Function) {
            function = (Function) symbol;
        }
        //报错
        else {
            String functionName = ctx.IDENTIFIER().getText();  //这是调用时的名称，不一定是真正的函数名，还可能是函数类型的变量名
            at.log("unable to find function or function variable " + functionName, ctx);
            return null;
        }

        if (functionObject == null) {
            functionObject = new FunctionObject(function);
        }

        return functionObject;
    }


    /**
     * 执行一个函数的方法体。需要先设置参数值，然后再执行代码。
     * @param functionObject
     * @param paramValues
     * @return
     */
    private Object functionCall(FunctionObject functionObject, List<Object> paramValues){
        Object rtn = null;

        //添加函数的栈桢
        StackFrame functionFrame = new StackFrame(functionObject);
        pushStack(functionFrame);

        // 给参数赋值，这些值进入functionFrame
        FunctionDeclarationContext functionCode = (FunctionDeclarationContext) functionObject.function.ctx;
        if (functionCode.formalParameters().formalParameterList() != null) {
            for (int i = 0; i < functionCode.formalParameters().formalParameterList().formalParameter().size(); i++) {
                FormalParameterContext param = functionCode.formalParameters().formalParameterList().formalParameter(i);
                LValue lValue = (LValue) visitVariableDeclaratorId(param.variableDeclaratorId());
                lValue.setValue(paramValues.get(i));
            }
        }

        // 调用函数（方法）体
        rtn = visitFunctionDeclaration(functionCode);

        // 弹出StackFrame
        popStack(); //函数的栈桢

        //如果由一个return语句返回，真实返回值会被封装在一个ReturnObject里。
        if (rtn instanceof ReturnObject){
            rtn = ((ReturnObject)rtn).returnValue;
        }

        return rtn;
    }



    /**
     * 对象方法调用。
     * 要先计算完参数的值，然后再添加对象的StackFrame，然后再调用方法。
     * @param classObject  实际调用时的对象。通过这个对象可以获得真实的类，支持多态。
     * @param ctx
     * @return
     */
    private Object methodCall(ClassObject classObject, FunctionCallContext ctx, boolean isSuper){
        Object rtn = null;

        //查找函数，并根据需要创建FunctionObject
        //如果查找到的是类的属性，FunctionType型的，需要把在对象的栈桢里查。
        StackFrame classFrame = new StackFrame(classObject);
        pushStack(classFrame);

        FunctionObject funtionObject = getFuntionObject(ctx);

        popStack();

        Function function = funtionObject.function;

        //对普通的类方法，需要在运行时动态绑定
        Class theClass = classObject.type;   //这是从对象获得的类型，是真实类型。可能是变量声明时的类型的子类
        if (!function.isConstructor() && !isSuper) {
            //从当前类逐级向上查找，找到正确的方法定义
            Function overrided = theClass.getFunction(function.name, function.getParamTypes());
            //原来这个function，可能指向一个父类的实现。现在从子类中可能找到重载后的方法，这个时候要绑定到子类的方法上
            if (overrided != null && overrided != function) {
                function = overrided;
                funtionObject.setFunction(function);
            }
        }

        //计算参数值
        List<Object> paramValues = calcParamValues(ctx);

        //对象的frame要等到函数参数都计算完了才能添加。
        //StackFrame classFrame = new StackFrame(classObject);
        pushStack(classFrame);

        //执行函数
        rtn = functionCall(funtionObject, paramValues);

        //弹出栈桢
        popStack();

        return rtn;
    }

    private void thisConstructor(FunctionCallContext ctx){
        Symbol symbol = at.symbolOfNode.get(ctx);
        if (symbol instanceof Class){  //缺省构造函数
            return; //这里不用管，因为缺省构造函数一定会被调用。
        }
        else if (symbol instanceof Function) {
            Function function = (Function) symbol;
            FunctionObject functionObject = new FunctionObject(function);

            List<Object> paramValues = calcParamValues(ctx);

            functionCall(functionObject, paramValues);
        }
    }


    @Override
    public Object visitFunctionDeclaration(FunctionDeclarationContext ctx) {
        return visitFunctionBody(ctx.functionBody());
    }

    @Override
    public Object visitFunctionBody(FunctionBodyContext ctx) {
        Object rtn = null;
        if (ctx.block() != null) {
            rtn = visitBlock(ctx.block());
        }
        return rtn;
    }

    @Override
    public Object visitQualifiedName(QualifiedNameContext ctx) {
        return super.visitQualifiedName(ctx);
    }

    @Override
    public Object visitQualifiedNameList(QualifiedNameListContext ctx) {
        return super.visitQualifiedNameList(ctx);
    }

    @Override
    public Object visitTypeTypeOrVoid(TypeTypeOrVoidContext ctx) {
        return super.visitTypeTypeOrVoid(ctx);
    }

    @Override
    public Object visitClassBody(ClassBodyContext ctx) {
        Object rtn = null;
        for (ClassBodyDeclarationContext child : ctx.classBodyDeclaration()) {
            rtn = visitClassBodyDeclaration(child);
        }
        return rtn;
    }

    @Override
    public Object visitClassBodyDeclaration(ClassBodyDeclarationContext ctx) {
        Object rtn = null;
        if (ctx.memberDeclaration() != null) {
            rtn = visitMemberDeclaration(ctx.memberDeclaration());
        }
        return rtn;
    }

    @Override
    public Object visitMemberDeclaration(MemberDeclarationContext ctx) {
        Object rtn = null;
        if (ctx.fieldDeclaration() != null) {
            rtn = visitFieldDeclaration(ctx.fieldDeclaration());
        }
        return rtn;
    }

    @Override
    public Object visitFieldDeclaration(FieldDeclarationContext ctx) {
        Object rtn = null;
        if (ctx.variableDeclarators() != null) {
            rtn = visitVariableDeclarators(ctx.variableDeclarators());
        }
        return rtn;
    }

    @Override
    public Object visitClassDeclaration(ClassDeclarationContext ctx) {
        return super.visitClassDeclaration(ctx);
    }

    @Override
    public Object visitConstructorDeclaration(ConstructorDeclarationContext ctx) {
        return super.visitConstructorDeclaration(ctx);
    }

    @Override
    public Object visitCreator(CreatorContext ctx) {
        return super.visitCreator(ctx);
    }

    @Override
    public Object visitTypeArgument(TypeArgumentContext ctx) {
        return super.visitTypeArgument(ctx);
    }

    @Override
    public Object visitTypeList(TypeListContext ctx) {
        return super.visitTypeList(ctx);
    }

    @Override
    public Object visitVariableModifier(VariableModifierContext ctx) {
        return super.visitVariableModifier(ctx);
    }

}