package Calculator.Operations;

import Calculator.Core.ExecutionContext;
import Calculator.Exceptions.Execution.AddOperationException;
import Calculator.Exceptions.Execution.StackException;


public class Add implements Operation {
    @Override
    public void doOperation(String[] input, ExecutionContext context) throws AddOperationException {
        Double a = 0.0, b;
        boolean got1 = false;
        try {
            a = context.popNumber();
            got1 = true;
            b = context.popNumber();
            b = a + b;
            context.pushNumber(b);
        } catch(StackException e){
            if(got1) context.pushNumber(a);
            throw new AddOperationException("Add operation unsuccessful\n");
        }
    }
}
