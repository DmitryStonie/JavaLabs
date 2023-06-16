package calculator.operations;

import calculator.core.ExecutionContext;
import calculator.exceptions.execution.DefineOperationException;

public class Define implements Operation {
    private static final String EMPTY_STRING = "";
    private static final int VAR_INDEX = 1;
    private static final int VALUE_INDEX = 2;
    @Override
    public void doOperation(String[] input, ExecutionContext context) throws DefineOperationException {
        try {
            if(input[VAR_INDEX].equals(EMPTY_STRING)) throw new DefineOperationException("Define operation unsuccessful. Variable doesn't have name\n");
            context.addVar(input[VAR_INDEX], Double.parseDouble(input[VALUE_INDEX]));
        } catch (NullPointerException | NumberFormatException e){
            throw new DefineOperationException("Define operation unsuccessful\n");
        } catch(DefineOperationException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
