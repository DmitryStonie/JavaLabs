package ru.nsu.fit.yurin.calculator.exceptions.factory;

public class CreatePrintOperationException extends CreateOperationException{
    public CreatePrintOperationException(){
        super();
    }
    public CreatePrintOperationException(String message){
        super(message);
    }
}
