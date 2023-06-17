package ru.nsu.fit.yurin.calculator.operations;

import ru.nsu.fit.yurin.calculator.core.ExecutionContext;
import ru.nsu.fit.yurin.calculator.exceptions.execution.OperationException;

public interface Operation {
    public void doOperation(String[] input, ExecutionContext context) throws OperationException;
}
