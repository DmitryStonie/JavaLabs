package Calculator.Operations;

import Calculator.Core.ExecutionContext;
import Calculator.Exceptions.Execution.OperationException;
import Calculator.Exceptions.Execution.StackException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubTest {

    @Test
    void doOperation() {
        try {
            Operation operation = new Sub();
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
            context.pushNumber(-432873241894.321414320);
            context.pushNumber(-31427674.24387327486);
            Double[] answers = {432841814220.0775, 0.0, -12320088811.004646, 100.0, 1.0};
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