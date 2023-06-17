package ru.nsu.fit.yurin.calculator.factory;

import ru.nsu.fit.yurin.calculator.exceptions.factory.CreateDefineOperationException;
import ru.nsu.fit.yurin.calculator.exceptions.factory.CreatorNotInitializedException;
import ru.nsu.fit.yurin.calculator.operations.Operation;

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
