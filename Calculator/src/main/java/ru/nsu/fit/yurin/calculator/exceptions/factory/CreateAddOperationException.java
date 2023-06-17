package ru.nsu.fit.yurin.calculator.exceptions.factory;

public class CreateAddOperationException extends CreateOperationException{
    public CreateAddOperationException(){
        super();
    }
    public CreateAddOperationException(String message){
        super(message);
    }
}
