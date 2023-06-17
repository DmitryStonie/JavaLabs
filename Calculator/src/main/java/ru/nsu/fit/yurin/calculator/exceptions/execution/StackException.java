package ru.nsu.fit.yurin.calculator.exceptions.execution;

public class StackException extends ExecContextException{
    public StackException(){
        super();
    }
    public StackException(String message){
        super(message);
    }
}
