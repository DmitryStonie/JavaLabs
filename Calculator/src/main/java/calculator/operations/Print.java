package calculator.operations;

import calculator.core.ExecutionContext;
import calculator.exceptions.execution.PrintOperationException;
import calculator.exceptions.execution.StackException;

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
