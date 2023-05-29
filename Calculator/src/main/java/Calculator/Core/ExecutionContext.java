package Calculator.Core;

import java.util.Map;
import java.util.Stack;
public class ExecutionContext {
    private final Stack<Double> numbers = new Stack<Double>();
    private Map<String, Double> variables;
    public Double popNumber(){
        Double num = numbers.pop();
        return num;
    }
    public void pushNumber(Double number){
        numbers.push(number);
    }
    public Double peekNumber(){
        Double num = numbers.peek();
        return num;
    }
    public void addVar(String var, Double value){
        variables.put(var, value);
    }
    public Double getValue(String var){
        Double value = variables.get(var);
        return value;
    }
}
