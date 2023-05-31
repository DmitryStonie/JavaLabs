package Calculator.Factory;

import Calculator.Exceptions.Factory.CreateSubOperationException;
import Calculator.Exceptions.Factory.CreatorNotInitializedException;
import Calculator.Operations.Operation;

public class SubCreator extends Creator {
    @Override
    public Operation createOperation() throws CreateSubOperationException, CreatorNotInitializedException {

        if (opclass == null) {
            throw new CreatorNotInitializedException("Creator didn't initialized\n");
        }
        try {
            Operation operation = (Operation) opclass.newInstance();
            return operation;
        } catch (java.lang.InstantiationException | java.lang.IllegalAccessException e) {
            throw new CreateSubOperationException("Cannot create Sub operation\n");
        }
    }

}
