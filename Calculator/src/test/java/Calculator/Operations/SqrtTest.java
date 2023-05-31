package Calculator.Operations;

import Calculator.Core.ExecutionContext;
import Calculator.Exceptions.Execution.OperationException;
import Calculator.Exceptions.Execution.SqrtOperationException;
import Calculator.Exceptions.Execution.StackException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {

    @Test
    void doOperation() {
        try {
            ExecutionContext context = new ExecutionContext();
            Operation operation = new Sqrt();
            String[] words = new String[3];
            int NUM_OF_TESTS = 4;
            context.pushNumber(-4324322.0234234);
            context.pushNumber(1.0);
            context.pushNumber(4324322.0234234);
            context.pushNumber(0.0);
            Double[] answers = {0.0, 2079.5004264061595, 1.0, 0.0};
            double actual;
            for(int i = 0; i < NUM_OF_TESTS; i++){
                operation.doOperation(words, context);
                actual = context.popNumber();
                assertEquals(answers[i], actual);
            }
        } catch (SqrtOperationException e) {
            assertEquals("Sqrt operation from negative number\n", e.getMessage());
        }
        catch (StackException | OperationException e){
            System.out.println(e.getMessage());
        }
    }
}