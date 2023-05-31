package Calculator.Exceptions.Factory;

public class CreatePushOperationException extends CreateOperationException{
    public CreatePushOperationException(){
        super();
    }
    public CreatePushOperationException(String message){
        super(message);
    }
}
