package calculator.factory;

import calculator.exceptions.factory.CreatePrintOperationException;
import calculator.exceptions.factory.CreatorNotInitializedException;
import calculator.operations.Operation;


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
