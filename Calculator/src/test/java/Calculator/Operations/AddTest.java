package Calculator.Operations;

import Calculator.Core.ExecutionContext;
import Calculator.Exceptions.Execution.OperationException;
import Calculator.Exceptions.Execution.StackException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    void doOperation() {
        try {
            Operation operation = new Add();
            String[] words = new String[3];
            ExecutionContext context = new ExecutionContext();
            int NUM_OF_TESTS = 5;
            context.pushNumber(1.0);
            context.pushNumber(2.0);
            context.pushNumber(0.0);
            context.pushNumber(100.0);
            context.pushNumber(12321332132.134413431);
            context.pushNumber(1243321.1297673274);
            context.pushNumber(0.0);
            context.pushNumber(0.0);
            context.pushNumber(-43287324189432324.321414320);
            context.pushNumber(-3142767478.24387327486);
            Double[] answers = {-4.328732733219981e+16, 0.0, 12322575453.26418, 100.0, 3.0};
            double actual;
            for(int i = 0; i < NUM_OF_TESTS; i++){
                operation.doOperation(words, context);
                actual = context.popNumber();
                assertEquals(answers[i], actual);
            }
        } catch (StackException | OperationException e){
            System.out.println(e.getMessage());
        }
    }
}