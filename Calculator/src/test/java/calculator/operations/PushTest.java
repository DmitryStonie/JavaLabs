package calculator.operations;

import calculator.core.ExecutionContext;
import calculator.exceptions.execution.OperationException;
import calculator.exceptions.execution.StackException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PushTest {

    @Test
    void doOperation() {
        try {
            Operation operation = new Push();
            Operation operation1 = new Define();
            String[] words = {"", "1.0", ""};
            ExecutionContext context = new ExecutionContext();
            operation.doOperation(words, context);
            assertEquals(1.0, context.peekNumber());
            words = new String[]{"", "0.0", ""};
            operation.doOperation(words, context);
            assertEquals(0.0, context.peekNumber());
            context.addVar("a", 100.0);
            words = new String[]{"", "a", ""};
            operation.doOperation(words, context);
            assertEquals(100.0, context.peekNumber());
        } catch (StackException | OperationException e){
            System.out.println(e.getMessage());
        }
    }
}