package Calculator.Factory;

import Calculator.Exceptions.Factory.CreatePrintOperationException;
import Calculator.Exceptions.Factory.CreatorNotInitializedException;
import Calculator.Operations.Operation;


public class PrintCreator extends Creator{
    @Override
    public Operation createOperation() throws CreatePrintOperationException, CreatorNotInitializedException {

        if (opclass == null) {
            throw new CreatorNotInitializedException("Creator didn't initialized\n");
        }
        try {
            Operation operation = (Operation) opclass.newInstance();
            return operation;
        } catch (java.lang.InstantiationException | java.lang.IllegalAccessException e) {
            throw new CreatePrintOperationException("Cannot create Print operation\n");
        }
    }
}
