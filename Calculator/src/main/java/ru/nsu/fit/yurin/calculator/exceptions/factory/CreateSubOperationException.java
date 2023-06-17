package ru.nsu.fit.yurin.calculator.exceptions.factory;

public class CreateSubOperationException extends CreateOperationException{
    public CreateSubOperationException(){
        super();
    }
    public CreateSubOperationException(String message){
        super(message);
    }
}
