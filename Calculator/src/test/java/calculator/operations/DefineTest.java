package calculator.operations;

import ru.nsu.fit.yurin.calculator.core.ExecutionContext;
import ru.nsu.fit.yurin.calculator.exceptions.execution.MapException;
import ru.nsu.fit.yurin.calculator.exceptions.execution.OperationException;
import org.junit.jupiter.api.Test;
import ru.nsu.fit.yurin.calculator.operations.Define;
import ru.nsu.fit.yurin.calculator.operations.Operation;

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