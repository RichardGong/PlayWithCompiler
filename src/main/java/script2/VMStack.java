package script2;

import java.util.Stack;

public class VMStack {
    private Stack<StackFrame> data = new Stack<StackFrame>();
    
    private StackFrame peek(){
        return data.peek();
    }

    private StackFrame pop(){
        //TODO:把reference中的计数器减少

        return data.pop();
    }

    private void push(StackFrame frame){
        data.push(frame);
    }

}