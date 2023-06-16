package calculator.factory;

import calculator.exceptions.factory.CreatePopOperationException;
import calculator.exceptions.factory.CreatorNotInitializedException;
import calculator.operations.Operation;


public class PopCreator extends Creator{
    @Override
    public Operation createOperation() throws CreatePopOperationException, CreatorNotInitializedException {

        if (opclass == null) {
            throw new CreatorNotInitializedException("Creator didn't initialized\n");
        }
        try {
            Operation operation = (Operation) opclass.newInstance();
            return operation;
        } catch (java.lang.InstantiationException | java.lang.IllegalAccessException e) {
            throw new CreatePopOperationException("Cannot create Pop operation\n");
        }
    }
}
