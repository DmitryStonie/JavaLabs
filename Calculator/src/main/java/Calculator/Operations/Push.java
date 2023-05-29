package Calculator.Operations;

import Calculator.Core.ExecutionContext;

public class Push implements Operation{
    @Override
    public void doOperation(String[] input, ExecutionContext context){
        try {
            Double number = Double.parseDouble(input[0]);
            context.pushNumber(number);
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        } catch(NumberFormatException e){
            Double var = context.getValue(input[0]);
            context.pushNumber(var);
        }
    }
}
