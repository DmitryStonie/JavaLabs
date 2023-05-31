package Calculator.Factory;


import Calculator.Exceptions.Factory.CreateDivideOperationException;
import Calculator.Exceptions.Factory.CreatorNotInitializedException;
import Calculator.Operations.Operation;

public class DivideCreator extends Creator{
    @Override
    public Operation createOperation() throws CreateDivideOperationException, CreatorNotInitializedException {

        if (opclass == null) {
            throw new CreatorNotInitializedException("Creator didn't initialized\n");
        }
        try {
            Operation operation = (Operation) opclass.newInstance();
            return operation;
        } catch (java.lang.InstantiationException | java.lang.IllegalAccessException e) {
            throw new CreateDivideOperationException("Cannot create Divide operation\n");
        }
    }
}
