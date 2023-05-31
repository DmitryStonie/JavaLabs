package Calculator.Operations;

import Calculator.Core.ExecutionContext;
import Calculator.Exceptions.Execution.DefineOperationException;
import Calculator.Exceptions.Execution.MapException;
import Calculator.Exceptions.Execution.PushOperationException;

public class Push implements Operation{
    private static final String EMPTY_STRING = "";
    @Override
    public void doOperation(String[] input, ExecutionContext context) throws PushOperationException {
        try {
            if(input[1].equals(EMPTY_STRING) == true) throw new PushOperationException("Push operation unsuccessful. No value entered\n");
            Double number = Double.parseDouble(input[1]);
            context.pushNumber(number);
        }  catch (NullPointerException | NumberFormatException e){
            try {
                Double value = context.getValue(input[1]);
                context.pushNumber(value);
            } catch (MapException f){
                throw new PushOperationException("Push operation unsuccessful. No such variable\n");
            }
        } catch(PushOperationException e){
            throw e;
        }
    }
}
