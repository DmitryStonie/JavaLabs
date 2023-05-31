package Calculator.Operations;

import Calculator.Core.ExecutionContext;
import Calculator.Exceptions.Execution.DivideOperationException;
import Calculator.Exceptions.Execution.StackException;
import Calculator.Exceptions.Execution.SubOperationException;

public class Divide implements Operation {
    @Override
    public void doOperation(String[] input, ExecutionContext context) throws DivideOperationException {
        Double a = null, b = null;
        try {
            a = context.popNumber();
            b = context.popNumber();
            if (b.equals(0.0)) throw new DivideOperationException("Division by zero exception\n");
            b = a / b;
            context.pushNumber(b);
        } catch(StackException e){
            if(b != null) context.pushNumber(b);
            if(a != null) context.pushNumber(a);
            throw new DivideOperationException("Divide operation unsuccessful\n");
        } catch(DivideOperationException e){
            context.pushNumber(a);
            context.pushNumber(b);
            throw e;
        }
    }
}
