package Calculator.Core;

import Calculator.Exceptions.Execution.MapException;
import Calculator.Exceptions.Execution.StackException;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
public class ExecutionContext {
    private final Stack<Double> numbers = new Stack<>();
    private final Map<String, Double> variables = new HashMap<>();
    private int stackTopIndex = -1;
    public Double popNumber() throws StackException{
        if(stackTopIndex >= 0) {
            stackTopIndex--;
            return numbers.pop();
        } else{
            throw new StackException("Not enough numbers on stack\n");
        }
    }
    public void pushNumber(Double number){
        numbers.push(number);
        stackTopIndex++;
    }
    public Double peekNumber() throws StackException{
        if(stackTopIndex >= 0) {
            return numbers.peek();
        } else{
            throw new StackException("Not enough numbers on stack\n");
        }
    }
    public void addVar(String var, Double value){
        variables.put(var, value);
    }
    public Double getValue(String var) throws MapException{
            Double value = variables.get(var);
            if(value == null) throw new MapException("Not such variable defined\n");
            else return value;
        }
    }

