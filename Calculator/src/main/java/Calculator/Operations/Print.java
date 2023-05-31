package Calculator.Operations;

import Calculator.Core.ExecutionContext;
import Calculator.Exceptions.Execution.PrintOperationException;
import Calculator.Exceptions.Execution.StackException;

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
