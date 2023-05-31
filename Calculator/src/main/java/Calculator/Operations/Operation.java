package Calculator.Operations;

import Calculator.Core.ExecutionContext;
import Calculator.Exceptions.Execution.OperationException;
import Calculator.Exceptions.Execution.StackException;

public interface Operation {
    public void doOperation(String[] input, ExecutionContext context) throws OperationException;
}
