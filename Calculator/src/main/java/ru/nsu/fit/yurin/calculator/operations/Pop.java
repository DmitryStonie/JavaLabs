package ru.nsu.fit.yurin.calculator.operations;

import ru.nsu.fit.yurin.calculator.core.ExecutionContext;
import ru.nsu.fit.yurin.calculator.exceptions.execution.PopOperationException;
import ru.nsu.fit.yurin.calculator.exceptions.execution.StackException;

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
