package Calculator.Exceptions.Execution;

public class InvalidCommandException extends ParserException{

    public InvalidCommandException(String message){
        super(message);
    }
}
