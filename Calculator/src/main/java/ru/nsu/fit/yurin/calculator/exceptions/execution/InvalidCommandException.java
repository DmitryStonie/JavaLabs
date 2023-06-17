package ru.nsu.fit.yurin.calculator.exceptions.execution;

public class InvalidCommandException extends ParserException{

    public InvalidCommandException(String message){
        super(message);
    }
}
