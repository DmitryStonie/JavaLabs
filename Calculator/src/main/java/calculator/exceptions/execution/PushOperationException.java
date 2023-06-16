package calculator.exceptions.execution;

public class PushOperationException extends OperationException{
    public PushOperationException(){
        super();
    }
    public PushOperationException(String message){
        super(message);
    }
}
