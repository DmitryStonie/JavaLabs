import Operations.Operation;

import java.util.Stack;
public class NumStack {
    private Stack<Double> stack;
    public void push(Double number){
        stack.push(number);
    }
    public Double pop(){
        return stack.pop();
    }
    public Double look(){
        return stack.peek();
    }
}
