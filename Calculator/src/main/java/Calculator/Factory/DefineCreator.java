package Calculator.Factory;

import Calculator.Exceptions.Factory.CreateDefineOperationException;
import Calculator.Exceptions.Factory.CreatorNotInitializedException;
import Calculator.Operations.Operation;

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
