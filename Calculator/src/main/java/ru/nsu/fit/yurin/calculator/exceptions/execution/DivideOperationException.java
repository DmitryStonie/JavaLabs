package ru.nsu.fit.yurin.calculator.exceptions.execution;

public class DivideOperationException extends OperationException{
    public DivideOperationException(){
        super();
    }
    public DivideOperationException(String message){
        super(message);
    }
}
