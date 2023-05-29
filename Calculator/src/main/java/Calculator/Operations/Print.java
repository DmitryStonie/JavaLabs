package Calculator.Operations;

import Calculator.Core.ExecutionContext;

public class Print implements Operation {
    @Override
    public void doOperation(String[] input, ExecutionContext context){
        Double a = context.peekNumber();
        System.out.println(a);
    }
}
