package ru.nsu.fit.yurin.calculator.operations;

import ru.nsu.fit.yurin.calculator.core.ExecutionContext;
import ru.nsu.fit.yurin.calculator.exceptions.execution.PrintOperationException;
import ru.nsu.fit.yurin.calculator.exceptions.execution.StackException;

public class Print implements Operation {
    @Override
    public void doOperation(String[] input, ExecutionContext context)throws PrintOperationException {
        try {
            Double a = context.peekNumber();
            System.out.println(a);
        } catch(StackException e){
            throw new PrintOperationException("Print operation unsuccessful\n");
        }
    }
}
