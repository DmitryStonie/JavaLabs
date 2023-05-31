package Calculator.Operations;

import Calculator.Core.ExecutionContext;

public interface Operation {
    public void doOperation(String[] input, ExecutionContext context) throws StackException;
}
