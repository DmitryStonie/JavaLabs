package ru.nsu.fit.yurin.calculator.operations;

import ru.nsu.fit.yurin.calculator.core.ExecutionContext;
import ru.nsu.fit.yurin.calculator.exceptions.execution.DivideOperationException;
import ru.nsu.fit.yurin.calculator.exceptions.execution.StackException;

public class Divide implements Operation {
    @Override
    public void doOperation(String[] input, ExecutionContext context) throws DivideOperationException {
        Double a = 0.0, b = 0.0;
        boolean got1 = false;
        try {
            a = context.popNumber();
            got1 = true;
            b = context.popNumber();
            if (b.equals(0.0)) throw new DivideOperationException("Division by zero exception\n");
            b = a / b;
            context.pushNumber(b);
        } catch(StackException e){
            if(got1) context.pushNumber(a);
            throw new DivideOperationException("Divide operation unsuccessful\n");
        } catch(DivideOperationException e){
            context.pushNumber(a);
            context.pushNumber(b);
            throw e;
        }
    }
}
