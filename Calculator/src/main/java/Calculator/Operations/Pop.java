package Calculator.Operations;

import Calculator.Core.ExecutionContext;
import Calculator.Exceptions.Execution.PopOperationException;
import Calculator.Exceptions.Execution.StackException;

public class Pop implements Operation {
    @Override
    public void doOperation(String[] input, ExecutionContext context) throws PopOperationException {
        try {
            context.popNumber();
        } catch (StackException e) {
            throw new PopOperationException("Pop operation unsuccessful. Stack is empty\n");
        }
    }
}
