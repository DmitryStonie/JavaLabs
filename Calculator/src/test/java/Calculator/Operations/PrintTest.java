package Calculator.Operations;

import Calculator.Core.ExecutionContext;
import Calculator.Exceptions.Execution.OperationException;
import Calculator.Exceptions.Execution.PrintOperationException;
import Calculator.Exceptions.Execution.StackException;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

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