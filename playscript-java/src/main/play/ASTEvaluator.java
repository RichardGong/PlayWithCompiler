package play;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import play.PlayScriptParser.BlockContext;
import play.PlayScriptParser.BlockStatementContext;
import play.PlayScriptParser.BlockStatementsContext;
import play.PlayScriptParser.ClassBodyContext;
import play.PlayScriptParser.ClassBodyDeclarationContext;
import play.PlayScriptParser.ClassDeclarationContext;
import play.PlayScriptParser.ConstructorDeclarationContext;
import play.PlayScriptParser.CreatorContext;
import play.PlayScriptParser.EnhancedForControlContext;
import play.PlayScriptParser.ExpressionContext;
import play.PlayScriptParser.ExpressionListContext;
import play.PlayScriptParser.FieldDeclarationContext;
import play.PlayScriptParser.FloatLiteralContext;
import play.PlayScriptParser.ForControlContext;
import play.PlayScriptParser.ForInitContext;
import play.PlayScriptParser.FormalParameterContext;
import play.PlayScriptParser.FormalParameterListContext;
import play.PlayScriptParser.FormalParametersContext;
import play.PlayScriptParser.IntegerLiteralContext;
import play.PlayScriptParser.LiteralContext;
import play.PlayScriptParser.MemberDeclarationContext;
import play.PlayScriptParser.FunctionBodyContext;
import play.PlayScriptParser.FunctionCallContext;
import play.PlayScriptParser.FunctionDeclarationContext;
import play.PlayScriptParser.ParExpressionContext;
import play.PlayScriptParser.PrimaryContext;
import play.PlayScriptParser.PrimitiveTypeContext;
import play.PlayScriptParser.ProgContext;
import play.PlayScriptParser.QualifiedNameContext;
import play.PlayScriptParser.QualifiedNameListContext;
import play.PlayScriptParser.StatementContext;
import play.PlayScriptParser.SuperSuffixContext;
import play.PlayScriptParser.SwitchBlockStatementGroupContext;
import play.PlayScriptParser.SwitchLabelContext;
import play.PlayScriptParser.TypeArgumentContext;
import play.PlayScriptParser.TypeListContext;
import play.PlayScriptParser.TypeTypeContext;
import play.PlayScriptParser.TypeTypeOrVoidContext;
import play.PlayScriptParser.VariableDeclaratorContext;
import play.PlayScriptParser.VariableDeclaratorIdContext;
import play.PlayScriptParser.VariableDeclaratorsContext;
import play.PlayScriptParser.VariableInitializerContext;
import play.PlayScriptParser.VariableModifierContext;

public class ASTEvaluator extends PlayScriptBaseVisitor<Object> {

    // 之前的编译结果
    private AnnotatedTree cr = null;

    // 局部变量的栈
    // private VMStack stack = new VMStack();

    // 堆，用于保存对象
    public ASTEvaluator(AnnotatedTree cr) {
        this.cr = cr;
    }

    ///////////////////////////////////////////////////////////
    /// 栈桢的管理
    private Stack<StackFrame> stack = new Stack<StackFrame>();

    public void pushStack(StackFrame frame) {
        // 如果新加入的frame是当前frame的下一级，则入栈
        if (stack.size() > 0) {
            if (frame.scope.enclosingScope == stack.peek().scope) {
                frame.parentFrame = stack.peek();
            }
            // 否则，跟栈顶元素的parentFrame相同
            else {
                frame.parentFrame = stack.peek().parentFrame;
            }
        }

        stack.push(frame);
    }

    public LValue getLValue(Variable variable) {
        StackFrame f = stack.peek();

        PlayObject valueContainer = null;
        while (f != null) {
            //if (f.contains(variable) || f.scope.symbols.contains(variable)) {
            if (f.scope.symbols.contains(variable)) {
                valueContainer = f.object;
                break;
            }
            f = f.parentFrame;
        }

        MyLValue lvalue = new MyLValue(valueContainer, variable);

        return lvalue;
    }

    private final class MyLValue implements LValue {
        private Variable variable;
        private PlayObject valueContainer;

        public MyLValue(PlayObject valueContainer, Variable variable) {
            this.valueContainer = valueContainer;
            this.variable = variable;
        }

        @Override
        public Object getValue() {
            return valueContainer.getValue(variable);
        }

        @Override
        public void setValue(Object value) {
            valueContainer.setValue(variable, value);
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

    // 模拟在堆中申请空间，来保存对象
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
        stack.pop();

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
    /// 工具性的方法
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

        BlockScope scope = (BlockScope) cr.node2Scope.get(ctx);
        StackFrame frame = new StackFrame(scope);
        // frame.parentFrame = stack.peek();
        pushStack(frame);

        // // 添加ActivationRecord
        // Scope scope = scopeTree.findDescendantByContext(ctx);
        // if (scope != null) {
        // ActivationRecord record = new ActivationRecord(scope);
        // activationRecordStack.push(record);
        // }

        Object rtn = visitBlockStatements(ctx.blockStatements());

        stack.pop();

        // // 去掉ActivationRecord
        // if (scope != null){
        // activationRecordStack.pop();
        // }
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
            Type type = cr.typeOfNode.get(ctx);

            //左右两个子节点的类型
            Type type1 = cr.typeOfNode.get(ctx.expression(0));
            Type type2 = cr.typeOfNode.get(ctx.expression(1));

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
                    // 获得field或调用方法
                    if (ctx.IDENTIFIER() != null) {
                        Variable variable = (Variable) cr.symbolOfNode.get(ctx);
                        //类的成员可能需要重载
                        Variable overloaded = cr.lookupVariable(valueContainer.type, variable.getName());
                        LValue lValue = new MyLValue(valueContainer, overloaded);
                        rtn = lValue;
                    } else if (ctx.functionCall() != null) {
                        pushStack(new StackFrame(valueContainer));
                        rtn = visitFunctionCall(ctx.functionCall());
                        stack.pop();
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
            Type type = cr.typeOfNode.get(ctx.expression(0));
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
            Type type = cr.typeOfNode.get(ctx.expression(0));
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
        if (ctx.literal() != null) {
            rtn = visitLiteral(ctx.literal());
        } else if (ctx.IDENTIFIER() != null) {
            Symbol symbol = cr.symbolOfNode.get(ctx);
            if (symbol instanceof Variable) {
                rtn = getLValue((Variable) symbol);
            } else if (symbol instanceof Function) {
                FunctionObject obj = new FunctionObject((Function) symbol);
                rtn = obj;
            }
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
            BlockScope scope = (BlockScope) cr.node2Scope.get(ctx);
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

            // 去掉ActivationRecord
            stack.pop();
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

                // 把闭包涉及的环境变量都打包带走
                if (rtn instanceof FunctionObject) {
                    FunctionObject functionObject = (FunctionObject) rtn;
                    List<Variable> variables = cr.outerReference.get(functionObject.function);
                    if (variables != null) {
                        for (Variable var : variables) {
                            LValue lValue = getLValue(var); // 现在还可以从栈里取，退出函数以后就不行了
                            Object value = lValue.getValue();
                            if (value != null) {
                                functionObject.fields.put(var, value);
                            }
                        }
                    }
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
        Symbol symbol = cr.symbolOfNode.get(ctx);
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
        pushStack(new StackFrame((BlockScope) cr.node2Scope.get(ctx)));

        rtn = visitBlockStatements(ctx.blockStatements());

        stack.pop();

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
        Object rtn = null;

        Function function = null;
        FunctionObject functionObject = null;

        Symbol symbol = cr.symbolOfNode.get(ctx);
        if (symbol instanceof Variable) {
            Variable variable = (Variable) symbol;
            LValue lValue = getLValue(variable);
            Object value = lValue.getValue();
            if (value instanceof FunctionObject) {
                functionObject = (FunctionObject) value;
                function = functionObject.function;
            }
        } else if (symbol instanceof Function) {
            function = (Function) symbol;
        } else if (symbol instanceof Class) {
            //类的缺省构造函数。不
            //cr.log("default construction method: " + ctx.IDENTIFIER().getText(), ctx);
            rtn = createAndInitClassObject((Class) symbol);
            return rtn;
        } else {
            // TODO 临时代码，用于打印输出
            if (ctx.IDENTIFIER().getText().equals("println")) {
                println(ctx);
                return rtn;
            } else {
                cr.log("unnable to find an function " + ctx.IDENTIFIER().getText(), ctx);
            }
        }

        FunctionDeclarationContext functionCode = (FunctionDeclarationContext) function.ctx;
        //aa Scope functionScope = cr.node2Scope.get(functionCode);

        StackFrame classFrame = null;

        //看看是不是类的方法
        ClassObject newObject = null;
        if (function.enclosingScope instanceof Class) {
            //Class theClass = (Class) cr.symbolOfNode.get(functionScope.enclosingScope.ctx);
            Class theClass = (Class) function.enclosingScope;
            // 看看是不是类的构建函数。
            if (theClass.name.equals(function.name)) {
                newObject = createAndInitClassObject(theClass);
                classFrame = new StackFrame(newObject);
                // classFrame.parentFrame = stack.peek();
                pushStack(classFrame);
            }
            //对普通的类函数，需要在运行时动态绑定
            else {
                //theClass = (Class)function.enclosingScope;

                //从当前类逐级向上查找，找到正确的方法定义
                Function overrided = cr.lookupFunction(theClass, function.name, function.getParamTypes());
                //原来这个function，可能指向一个父类的实现。现在从子类中可能找到重载后的方法，这个时候要绑定到子类的方法上
                if (overrided != function) {
                    function = overrided;
                    functionCode = (FunctionDeclarationContext) function.ctx;
                    //functionScope = cr.node2Scope.get(functionCode);
                }
            }
        }

        // 添加StackFrame
        if (functionObject == null) {
            functionObject = new FunctionObject(function);
        }
        StackFrame functionFrame = new StackFrame(functionObject);

        pushStack(functionFrame);

        // 往栈桢绑定形参和实参，它们要能够一一对应
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

        if (functionCode.formalParameters().formalParameterList() != null) {
            for (int i = 0; i < functionCode.formalParameters().formalParameterList().formalParameter().size(); i++) {
                FormalParameterContext param = functionCode.formalParameters().formalParameterList().formalParameter(i);
                LValue lValue = (LValue) visitVariableDeclaratorId(param.variableDeclaratorId());
                lValue.setValue(paramValues.get(i));
            }
        }

        // 调用方法体
        rtn = visitFunctionDeclaration(functionCode);

        if (newObject != null) {
            rtn = newObject;
        }

        //如果由一个return语句返回，真实返回值会被封装在一个ReturnObject里。
        if (rtn instanceof ReturnObject){
            rtn = ((ReturnObject)rtn).returnValue;
        }

        // 弹出StackFrame
        if (classFrame != null) {
            stack.pop();
        }
        stack.pop();
        return rtn;
    }

    @Override
    public Object visitFunctionDeclaration(FunctionDeclarationContext ctx) {
        Object rtn = null;
        rtn = visitFunctionBody(ctx.functionBody());
        return rtn;
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