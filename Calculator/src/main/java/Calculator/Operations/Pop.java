package Calculator.Operations;

import Calculator.Core.ExecutionContext;

public class Pop implements Operation{
    @Override
    public void doOperation(String[] input, ExecutionContext context){
        context.popNumber();
    }
}
