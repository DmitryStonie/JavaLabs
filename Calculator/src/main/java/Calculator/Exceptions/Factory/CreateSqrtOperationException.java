package Calculator.Exceptions.Factory;

public class CreateSqrtOperationException extends CreateOperationException{
    public CreateSqrtOperationException(){
        super();
    }
    public CreateSqrtOperationException(String message){
        super(message);
    }
}
