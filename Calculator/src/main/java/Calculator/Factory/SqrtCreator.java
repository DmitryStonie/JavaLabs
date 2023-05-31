package Calculator.Factory;

import Calculator.Exceptions.Factory.CreateSqrtOperationException;
import Calculator.Exceptions.Factory.CreatorNotInitializedException;
import Calculator.Operations.Operation;

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
