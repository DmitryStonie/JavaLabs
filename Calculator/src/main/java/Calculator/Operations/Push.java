package Calculator.Operations;

import Calculator.Core.ExecutionContext;
import Calculator.Exceptions.Execution.MapException;
import Calculator.Exceptions.Execution.PushOperationException;

public class Push implements Operation{
    private static final String EMPTY_STRING = "";
    private static final int VAR_OR_VALUE_INDEX = 1;
    @Override
    public void doOperation(String[] input, ExecutionContext context) throws PushOperationException {
        try {
            if(input[VAR_OR_VALUE_INDEX].equals(EMPTY_STRING)) throw new PushOperationException("Push operation unsuccessful. No value entered\n");
            Double number = Double.parseDouble(input[VAR_OR_VALUE_INDEX]);
            context.pushNumber(number);
        }  catch (NullPointerException | NumberFormatException e){
            try {
                Double value = context.getValue(input[VAR_OR_VALUE_INDEX]);
                context.pushNumber(value);
            } catch (MapException f){
                throw new PushOperationException("Push operation unsuccessful. No such variable\n");
            }
        } catch(PushOperationException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
