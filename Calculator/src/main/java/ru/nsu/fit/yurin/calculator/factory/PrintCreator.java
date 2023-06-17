package ru.nsu.fit.yurin.calculator.factory;

import ru.nsu.fit.yurin.calculator.exceptions.factory.CreatePrintOperationException;
import ru.nsu.fit.yurin.calculator.exceptions.factory.CreatorNotInitializedException;
import ru.nsu.fit.yurin.calculator.operations.Operation;


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
