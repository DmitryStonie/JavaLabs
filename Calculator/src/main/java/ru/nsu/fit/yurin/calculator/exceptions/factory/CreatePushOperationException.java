package ru.nsu.fit.yurin.calculator.exceptions.factory;

public class CreatePushOperationException extends CreateOperationException{
    public CreatePushOperationException(){
        super();
    }
    public CreatePushOperationException(String message){
        super(message);
    }
}
