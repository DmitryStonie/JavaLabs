package Calculator.Operations;

import Calculator.Core.ExecutionContext;
import Calculator.Exceptions.Execution.SqrtOperationException;
import Calculator.Exceptions.Execution.StackException;
import Calculator.Exceptions.Execution.SubOperationException;

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
            throw e;
        }
    }
}
