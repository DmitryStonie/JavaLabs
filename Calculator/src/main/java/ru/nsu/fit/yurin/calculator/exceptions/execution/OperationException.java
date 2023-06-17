package ru.nsu.fit.yurin.calculator.exceptions.execution;


public class OperationException extends Exception{
    public OperationException(){
        super();
    }
    public OperationException(String message){
        super(message);
    }
}
