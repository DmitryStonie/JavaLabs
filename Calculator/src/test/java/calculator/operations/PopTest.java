package calculator.operations;

import calculator.core.ExecutionContext;
import calculator.exceptions.execution.OperationException;
import calculator.exceptions.execution.StackException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PopTest {

    @Test
    void doOperation() {
        try {
            Operation operation = new Pop();
            String[] words = new String[3];
            ExecutionContext context = new ExecutionContext();
            int NUM_OF_TESTS = 10;
            context.pushNumber(1.0);
            context.pushNumber(2.0);
            context.pushNumber(0.0);
            context.pushNumber(100.0);
            context.pushNumber(12321332132.134413431);
            context.pushNumber(1243321.1297673274);
            context.pushNumber(0.0);
            context.pushNumber(0.0);
            context.pushNumber(-43287324189.321414320);
            context.pushNumber(-31427674.24387327486);
            Double[] answers = {-43287324189.321414320, 0.0, 0.0, 1243321.1297673274, 12321332132.134413431, 100.0, 0.0, 2.0, 1.0, 0.0};
            double actual;
            for(int i = 0; i < NUM_OF_TESTS; i++){
                operation.doOperation(words, context);
                actual = context.peekNumber();
                assertEquals(answers[i], actual);
            }
        } catch (StackException | OperationException e){
            System.out.println(e.getMessage());
        }
    }
}