package ru.nsu.fit.yurin.calculator.factory;

import ru.nsu.fit.yurin.calculator.exceptions.factory.CreateOperationException;
import ru.nsu.fit.yurin.calculator.exceptions.factory.CreatorInitializationException;
import ru.nsu.fit.yurin.calculator.exceptions.factory.CreatorNotInitializedException;
import ru.nsu.fit.yurin.calculator.operations.Operation;

public abstract class Creator {
    protected Class opclass = null;

    public final void initCreator(String operationName) throws CreatorInitializationException {
        try {
            opclass = Class.forName(operationName);
        } catch (java.lang.ClassNotFoundException e) {
            throw new CreatorInitializationException("Cannot initialize creator\n");
        }
    }

    public Operation createOperation() throws CreateOperationException, CreatorNotInitializedException {
        if (opclass == null) {
            System.out.println("Creator didn't initialized\n");
            return null;
        } else {
            try {
                Operation operation = (Operation) opclass.newInstance();
                return operation;
            } catch (java.lang.InstantiationException | java.lang.IllegalAccessException e) {
                throw new CreateOperationException("Cannot create operation\n");
            }
        }
    }
}
