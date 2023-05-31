package Calculator.Factory;

import Calculator.Exceptions.Factory.CreatePushOperationException;
import Calculator.Exceptions.Factory.CreatorNotInitializedException;
import Calculator.Operations.Operation;

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
