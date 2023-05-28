package Operations;

import java.util.Stack;

public class Add extends Operation{
    public Add(){
        super();
        opCode = 1;
    }
    void doAction(Stack<Double> stack){
        stack.push(stack.pop() + stack.pop());
    }
}
