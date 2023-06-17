package ru.nsu.fit.yurin.calculator.exceptions.execution;

public class PrintOperationException extends OperationException{
    public PrintOperationException(){
        super();
    }
    public PrintOperationException(String message){
        super(message);
    }
}
