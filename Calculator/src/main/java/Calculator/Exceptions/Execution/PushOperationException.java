package Calculator.Exceptions.Execution;

public class PushOperationException extends OperationException{
    public PushOperationException(){
        super();
    }
    public PushOperationException(String message){
        super(message);
    }
}
