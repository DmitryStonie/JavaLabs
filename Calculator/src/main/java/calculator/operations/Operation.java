package calculator.operations;

import calculator.core.ExecutionContext;
import calculator.exceptions.execution.OperationException;

public interface Operation {
    public void doOperation(String[] input, ExecutionContext context) throws OperationException;
}
