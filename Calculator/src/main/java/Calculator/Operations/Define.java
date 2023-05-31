package Calculator.Operations;

import Calculator.Core.ExecutionContext;
import Calculator.Exceptions.Execution.DefineOperationException;

public class Define implements Operation {
    private static final String EMPTY_STRING = "";
    @Override
    public void doOperation(String[] input, ExecutionContext context) throws DefineOperationException {
        try {
            if(input[1].equals(EMPTY_STRING)) throw new DefineOperationException("Define operation unsuccessful. Variable doesn't have name\n");
            context.addVar(input[1], Double.parseDouble(input[2]));
        } catch (NullPointerException | NumberFormatException e){
            throw new DefineOperationException("Define operation unsuccessful\n");
        } catch(DefineOperationException e){
            throw e;
        }
    }
}
