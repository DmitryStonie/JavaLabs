package calculator.operations;

import calculator.core.ExecutionContext;
import calculator.exceptions.execution.PopOperationException;
import calculator.exceptions.execution.StackException;

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
