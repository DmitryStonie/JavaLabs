package calculator.operations;

import calculator.core.ExecutionContext;
import calculator.exceptions.execution.MultipleOperationException;
import calculator.exceptions.execution.StackException;

public class Multiple implements Operation {
    @Override
    public void doOperation(String[] input, ExecutionContext context) throws MultipleOperationException {
        Double a = null, b = null;
        try {
            a = context.popNumber();
            b = context.popNumber();
            b = a * b;
            context.pushNumber(b);
        } catch (StackException e) {
            if (b != null) context.pushNumber(b);
            if (a != null) context.pushNumber(a);
            throw new MultipleOperationException("Multiple operation unsuccessful\n");
        }
    }
}
