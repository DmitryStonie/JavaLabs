package Calculator.Operations;

import Calculator.Core.ExecutionContext;

public class Divide implements Operation {
    @Override
    public void doOperation(String[] input, ExecutionContext context){
        Double a, b;
        try {
            a = context.popNumber();
            b = context.popNumber();
            if (b.equals(0)) throw new ArithmeticException("Division by zero exception\n");
            b = a / b;
            context.pushNumber(b);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
