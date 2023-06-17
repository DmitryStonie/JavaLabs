package ru.nsu.fit.yurin.calculator.exceptions.execution;

public class SubOperationException extends OperationException{
    public SubOperationException(){
        super();
    }
    public SubOperationException(String message){
        super(message);
    }
}
