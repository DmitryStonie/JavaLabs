package calculator.exceptions.execution;

public class InvalidCommandException extends ParserException{

    public InvalidCommandException(String message){
        super(message);
    }
}
