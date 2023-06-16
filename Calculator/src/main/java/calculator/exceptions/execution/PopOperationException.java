package calculator.exceptions.execution;

public class PopOperationException extends OperationException{
    public PopOperationException(){
        super();
    }
    public PopOperationException(String message){
        super(message);
    }
}
