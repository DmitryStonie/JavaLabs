package Calculator.Operations;

import Calculator.Core.ExecutionContext;

public class Sub implements Operation{
    @Override
    public void doOperation(String[] input, ExecutionContext context){
        Double a = context.popNumber();
        Double b = context.popNumber();
        b = a - b;
        context.pushNumber(b);
    }
}
