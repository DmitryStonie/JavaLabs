import Operations.Operation;
import java.util.Stack;
public class OpStack {
    private Stack<Operation> stack;
    public void push(Operation operation){
        stack.push(operation);
    }
    public Operation pop(){
        return stack.pop();
    }
    public Operation look(){
        return stack.peek();
    }
}
