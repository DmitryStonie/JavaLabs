package calculator.factory;

import calculator.exceptions.factory.CreateSqrtOperationException;
import calculator.exceptions.factory.CreatorNotInitializedException;
import calculator.operations.Operation;

public class SqrtCreator extends Creator {
    @Override
    public Operation createOperation() throws CreateSqrtOperationException, CreatorNotInitializedException {

        if (opclass == null) {
            throw new CreatorNotInitializedException("Creator didn't initialized\n");
        }
        try {
            Operation operation = (Operation) opclass.newInstance();
            return operation;
        } catch (InstantiationException | IllegalAccessException e) {
            throw new CreateSqrtOperationException("Cannot create Sqrt operation\n");
        }
    }

}
