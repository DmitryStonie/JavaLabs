package Calculator.Operations;

import Calculator.Begin.ExecutionContext;

public interface Operation {
    public void doOperation(String[] input, ExecutionContext context);
}
