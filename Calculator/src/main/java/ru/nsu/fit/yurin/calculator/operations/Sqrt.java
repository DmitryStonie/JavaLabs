package ru.nsu.fit.yurin.calculator.operations;

import ru.nsu.fit.yurin.calculator.core.ExecutionContext;
import ru.nsu.fit.yurin.calculator.exceptions.execution.SqrtOperationException;
import ru.nsu.fit.yurin.calculator.exceptions.execution.StackException;

public class Sqrt implements Operation{
    @Override
    public void doOperation(String[] input, ExecutionContext context) throws SqrtOperationException{
        try {
            Double a = context.popNumber();
            if(a < 0){
                context.pushNumber(a);
                throw new SqrtOperationException("Sqrt operation from negative number\n");
            }
            a = Math.sqrt(a);
            context.pushNumber(a);
        } catch (StackException e){
            throw new SqrtOperationException("Sqrt operation unsuccessful\n");
        } catch (SqrtOperationException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
