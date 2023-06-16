package calculator.factory;

import calculator.exceptions.factory.CreatePushOperationException;
import calculator.exceptions.factory.CreatorNotInitializedException;
import calculator.operations.Operation;

public class PushCreator extends Creator{
    @Override
    public Operation createOperation() throws CreatePushOperationException, CreatorNotInitializedException {

        if (opclass == null) {
            throw new CreatorNotInitializedException("Creator didn't initialized\n");
        }
        try {
            Operation operation = (Operation) opclass.newInstance();
            return operation;
        } catch (java.lang.InstantiationException | java.lang.IllegalAccessException e) {
            throw new CreatePushOperationException("Cannot create Push operation\n");
        }
    }
}
