package calculator.operations;

import ru.nsu.fit.yurin.calculator.core.ExecutionContext;
import ru.nsu.fit.yurin.calculator.exceptions.execution.OperationException;
import ru.nsu.fit.yurin.calculator.exceptions.execution.PrintOperationException;
import ru.nsu.fit.yurin.calculator.exceptions.execution.StackException;
import org.junit.jupiter.api.Test;
import ru.nsu.fit.yurin.calculator.operations.Operation;
import ru.nsu.fit.yurin.calculator.operations.Print;

import static org.junit.jupiter.api.Assertions.*;

class PrintTest {

    @Test
    void doOperation() {
        try {
            ExecutionContext context = new ExecutionContext();
            Operation operation = new Print();
            String[] words = new String[3];
            context.pushNumber(1.0);
            java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
            System.setOut(new java.io.PrintStream(out));
            operation.doOperation(words, context);
            assertEquals("1.0\r\n", out.toString());
            context.popNumber();
            operation.doOperation(words, context);  //exception
        } catch(PrintOperationException e) {
            assertEquals("Print operation unsuccessful\n", e.getMessage());
        } catch (StackException | OperationException e){
            System.out.println(e.getMessage());
        }
    }
}