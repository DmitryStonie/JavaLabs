package Calculator.Operations;

import Calculator.Core.ExecutionContext;
import Calculator.Exceptions.Execution.MultipleOperationException;
import Calculator.Exceptions.Execution.StackException;
import Calculator.Exceptions.Execution.SubOperationException;

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
