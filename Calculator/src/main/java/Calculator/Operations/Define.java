package Calculator.Operations;

import Calculator.Core.ExecutionContext;

public class Define implements Operation{
    @Override
    public void doOperation(String[] input, ExecutionContext context){
        try {
            context.addVar(input[0], Double.parseDouble(input[1]));
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        } catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
