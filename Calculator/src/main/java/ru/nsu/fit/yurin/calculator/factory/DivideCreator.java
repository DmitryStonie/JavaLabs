package ru.nsu.fit.yurin.calculator.factory;


import ru.nsu.fit.yurin.calculator.exceptions.factory.CreateDivideOperationException;
import ru.nsu.fit.yurin.calculator.exceptions.factory.CreatorNotInitializedException;
import ru.nsu.fit.yurin.calculator.operations.Operation;

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
