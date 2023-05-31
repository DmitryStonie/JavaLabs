package Calculator.Exceptions.Factory;

public class CreateSubOperationException extends CreateOperationException{
    public CreateSubOperationException(){
        super();
    }
    public CreateSubOperationException(String message){
        super(message);
    }
}
