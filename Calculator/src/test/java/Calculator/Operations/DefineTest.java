package Calculator.Operations;

import Calculator.Core.ExecutionContext;
import Calculator.Exceptions.Execution.MapException;
import Calculator.Exceptions.Execution.OperationException;
import Calculator.Exceptions.Execution.StackException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefineTest {

    @Test
    void doOperation() {
        try {
            Operation operation = new Define();
            ExecutionContext context = new ExecutionContext();
            String[] words = {"", "a", "100"};
            operation.doOperation(words, context);
            assertEquals(100.0,context.getValue("a"));
            words = new String[]{"", "a", "50"};
            operation.doOperation(words, context);
            assertEquals(50.0,context.getValue("a"));
            words = new String[]{"", "b", "0.0"};
            operation.doOperation(words, context);
            assertEquals(0.0,context.getValue("b"));
            words = new String[]{"", "", "0.0"};
            operation.doOperation(words, context);//exception
        } catch(MapException e) {
            assertEquals("Define operation unsuccessful. Variable doesn't have name\n", e.getMessage());
        } catch (OperationException e){
            System.out.println(e.getMessage());
        }
    }
}