package ru.nsu.fit.yurin.calculator.exceptions.factory;

public class CreatorNotInitializedException extends CreatorException{
    public CreatorNotInitializedException(){
        super();
    }
    public CreatorNotInitializedException(String message){
        super(message);
    }
}
