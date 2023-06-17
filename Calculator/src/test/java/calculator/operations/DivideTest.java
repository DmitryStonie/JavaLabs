package calculator.operations;

import ru.nsu.fit.yurin.calculator.core.ExecutionContext;
import ru.nsu.fit.yurin.calculator.exceptions.execution.DivideOperationException;
import ru.nsu.fit.yurin.calculator.exceptions.execution.OperationException;
import ru.nsu.fit.yurin.calculator.exceptions.execution.StackException;
import org.junit.jupiter.api.Test;
import ru.nsu.fit.yurin.calculator.operations.Divide;
import ru.nsu.fit.yurin.calculator.operations.Operation;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {

    @Test
    void doOperation() {
        try {
            Operation operation = new Divide();
            String[] words = new String[3];
            ExecutionContext context = new ExecutionContext();
            int NUM_OF_TESTS = 5;
            context.pushNumber(0.0);
            context.pushNumber(0.0);
            context.pushNumber(1.0);
            context.pushNumber(100.0);
            context.pushNumber(100.0);
            context.pushNumber(0.0);
            context.pushNumber(12321332132.134413431);
            context.pushNumber(1243321.1297673274);
            context.pushNumber(-3142767478.24387327486);
            context.pushNumber(-43287324189432324.321414320);
            Double[] answers = {13773632.47172857, 0.00010090801192873517, 0.0, 100.0, 0.0};
            double actual;
            for(int i = 0; i < NUM_OF_TESTS; i++){
                operation.doOperation(words, context);
                actual = context.popNumber();
                assertEquals(answers[i], actual);
            }
        } catch(DivideOperationException e){
            assertEquals("Division by zero exception\n", e.getMessage());
        }
        catch (StackException | OperationException e){
            System.out.println(e.getMessage());
        }
    }
}