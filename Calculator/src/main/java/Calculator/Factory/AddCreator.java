package Calculator.Factory;

import Calculator.Exceptions.Factory.CreateAddOperationException;
import Calculator.Exceptions.Factory.CreatorNotInitializedException;
import Calculator.Operations.Operation;

public final class AddCreator extends Creator{
    @Override
    public Operation createOperation() throws CreateAddOperationException, CreatorNotInitializedException {

        if (opclass == null) {
            throw new CreatorNotInitializedException("Creator didn't initialized\n");
        }
        try {
            Operation operation = (Operation) opclass.newInstance();
            return operation;
        } catch (java.lang.InstantiationException | java.lang.IllegalAccessException e) {
            throw new CreateAddOperationException("Cannot create Add operation\n");
        }
    }
}

