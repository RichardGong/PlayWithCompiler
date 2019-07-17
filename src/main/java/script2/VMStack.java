package script2;

import java.util.Stack;

/**
 * 保存程序执行时的临时变量
 */
public class VMStack {
    private Stack<StackFrame> data = new Stack<StackFrame>();

    public StackFrame peek() {
        return data.peek();
    }

    public StackFrame pop() {
        // TODO:把reference中的计数器减少

        return data.pop();
    }

    public void push(StackFrame frame) {
        data.push(frame);
    }

    /**
     * 这是获得LValue的唯一出口，所以在这里可以确保。（但如果再赋值给别的变量，就先不管了。除非从根上管理赋值操作。，比如通过CopyLValue()的方法）
     */
    public LValue getLValue(Variable variable) {
        // todo 增加reference中的计数器

        MyLValue lvalue = new MyLValue();
        lvalue.variable = variable;
        StackFrame f = data.peek();
        while (f != null) {
            if (f.scope == variable.scope) {
                lvalue.frame = f;
                break;
            }
            f = f.parentFrame;
        }
        return lvalue;
    }

    public LValue copyLValue(LValue lValue) {
        MyLValue newValue = new MyLValue();
        newValue.variable = lValue.getVariable();
        newValue.frame = lValue.getFrame();

        // TODO 增加reference计数器的值
        return newValue;
    }

    private final class MyLValue implements LValue {
        private Variable variable;
        private StackFrame frame; // 所在的栈桢

        @Override
        public Object getValue() {
            return frame.variables.get(variable);
        }

        @Override
        public void setValue(Object value) {
            frame.variables.put(variable, value);
        }

        @Override
        public Variable getVariable() {
            return variable;
        }

        @Override
        public StackFrame getFrame() {
            return frame;
        }

        @Override
        public String toString() {
            return "LValue of " + variable.name +" : " + getValue();
        }
    }

}