package ru.nsu.fit.yurin.calculator.exceptions.execution;

public class SqrtOperationException extends OperationException{
    public SqrtOperationException(){
        super();
    }
    public SqrtOperationException(String message){
        super(message);
    }
}
