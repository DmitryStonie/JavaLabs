package Calculator.Exceptions.Factory;

public class CreateMultipleOperationException extends CreateOperationException{
    public CreateMultipleOperationException(){
        super();
    }
    public CreateMultipleOperationException(String message){
        super(message);
    }
}
