package ru.nsu.fit.yurin.calculator.exceptions.factory;

public class CreatorInitializationException extends CreatorException{
    public CreatorInitializationException(){
        super();
    }
    public CreatorInitializationException(String message){
        super(message);
    }
}
