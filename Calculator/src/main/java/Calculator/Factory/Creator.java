package Calculator.Factory;

import Calculator.Operations.Operation;

public abstract class Creator {
    protected Class opclass = null;

    public final void initCreator(String operationName) {
        try {
            Class opclass = Class.forName(operationName);
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public final Operation createOperation() {
        if (opclass == null) {
            System.out.println("Creator didn't initialized\n");
            return null;
        } else {
            try {
                Operation operation = (Operation) opclass.newInstance();
                return operation;
            } catch (java.lang.InstantiationException e) {
                System.out.println(e.getMessage());
                return null;
            } catch (java.lang.IllegalAccessException e) {
                System.out.println(e.getMessage());
                return null;
            }
        }
    }
}
