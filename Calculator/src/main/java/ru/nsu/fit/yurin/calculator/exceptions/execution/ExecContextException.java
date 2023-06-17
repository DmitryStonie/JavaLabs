package ru.nsu.fit.yurin.calculator.exceptions.execution;

public class ExecContextException extends Exception{
    public ExecContextException(){
        super();
    }
    public ExecContextException(String message){
        super(message);
    }
}
