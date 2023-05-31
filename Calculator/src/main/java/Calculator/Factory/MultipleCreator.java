package Calculator.Factory;

import Calculator.Exceptions.Factory.CreateMultipleOperationException;
import Calculator.Exceptions.Factory.CreatorNotInitializedException;
import Calculator.Operations.Operation;

public class MultipleCreator extends Creator{
    @Override
    public Operation createOperation() throws CreateMultipleOperationException, CreatorNotInitializedException {

        if (opclass == null) {
            throw new CreatorNotInitializedException("Creator didn't initialized\n");
        }
        try {
            Operation operation = (Operation) opclass.newInstance();
            return operation;
        } catch (java.lang.InstantiationException | java.lang.IllegalAccessException e) {
            throw new CreateMultipleOperationException("Cannot create Multiple operation\n");
        }
    }
}
