package Calculator.Operations;

import Calculator.Core.ExecutionContext;

public class Define implements Operation{
    @Override
    public void doOperation(String[] input, ExecutionContext context){
        context.addVar(input[0], Double.parseDouble(input[1]));
    }
}
