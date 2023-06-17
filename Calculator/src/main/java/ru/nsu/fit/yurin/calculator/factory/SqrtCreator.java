package ru.nsu.fit.yurin.calculator.factory;

import ru.nsu.fit.yurin.calculator.exceptions.factory.CreateSqrtOperationException;
import ru.nsu.fit.yurin.calculator.exceptions.factory.CreatorNotInitializedException;
import ru.nsu.fit.yurin.calculator.operations.Operation;

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
