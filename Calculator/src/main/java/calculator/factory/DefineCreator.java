package calculator.factory;

import calculator.exceptions.factory.CreateDefineOperationException;
import calculator.exceptions.factory.CreatorNotInitializedException;
import calculator.operations.Operation;

public class DefineCreator extends Creator{
    @Override
    public Operation createOperation() throws CreateDefineOperationException, CreatorNotInitializedException {

        if (opclass == null) {
            throw new CreatorNotInitializedException("Creator didn't initialized\n");
        }
        try {
            Operation operation = (Operation) opclass.newInstance();
            return operation;
        } catch (java.lang.InstantiationException | java.lang.IllegalAccessException e) {
            throw new CreateDefineOperationException("Cannot create Define operation\n");
        }
    }
}
