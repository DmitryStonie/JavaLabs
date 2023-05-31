package Calculator.Core;

import java.util.EmptyStackException;
import java.util.Map;
import java.util.Stack;
public class ExecutionContext {
    private final Stack<Double> numbers = new Stack<Double>();
    private Map<String, Double> variables;
    private static int stackTopIndex = -1;
    public Double popNumber(){
        if(stackTopIndex >= 0) {
            Double num = 0.0;
            num = numbers.pop();
            return num;
        } else{
            throw new StackException
        }
    }
    public void pushNumber(Double number){
        numbers.push(number);
    }
    public Double peekNumber(){
        Double num = 0.0;
        num = numbers.peek();
        return num;
    }
    public void addVar(String var, Double value){
        variables.put(var, value);
    }
    public Double getValue(String var){
        Double value = 0.0;
        value = variables.get(var);
        return value;
    }
}
