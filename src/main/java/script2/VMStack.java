package script2;

import java.util.Stack;

/**
 * 保存程序执行时的临时变量
 */
public class VMStack {
    // 所有的栈桢
    private Stack<StackFrame> frames = new Stack<StackFrame>();

    public StackFrame peek() {
        return frames.peek();
    }

    public StackFrame pop() {
        // TODO:把reference中的计数器减少

        return frames.pop();
    }

    public void push(StackFrame frame) {
        // 如果新加入的frame是当前frame的下一级，则入栈
        if (frames.size() > 0) {
            if (frame.scope.enclosingScope == frames.peek().scope) {
                frame.parentFrame = frames.peek();
            }
            // 否则，跟栈顶元素的parentFrame相同
            else {
                frame.parentFrame = frames.peek().parentFrame;
            }
        }

        frames.push(frame);
    }

    /**
     * 这是获得LValue的唯一出口，所以在这里可以确保。（但如果再赋值给别的变量，就先不管了。除非从根上管理赋值操作。，比如通过CopyLValue()的方法）
     */
    public LValue getLValue(Variable variable) {
        // todo 增加reference中的计数器

        MyLValue lvalue = new MyLValue();
        lvalue.variable = variable;
        StackFrame f = frames.peek();
        while (f != null) {
            if (f.scope == variable.enclosingScope) {
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
            return frame.getValue(variable);
        }

        @Override
        public void setValue(Object value) {
            frame.setValue(variable, value);
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
            return "LValue of " + variable.name + " : " + getValue();
        }
    }

}