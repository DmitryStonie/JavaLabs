package Calculator.Operations;

import Calculator.Core.ExecutionContext;

public class Sqrt implements Operation{
    @Override
    public void doOperation(String[] input, ExecutionContext context){
        Double a = context.popNumber();
        a = Math.sqrt(a);
        context.pushNumber(a);
    }
}
