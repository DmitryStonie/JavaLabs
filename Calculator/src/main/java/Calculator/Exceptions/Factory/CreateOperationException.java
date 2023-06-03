package Calculator.Exceptions.Factory;

public class CreateOperationException extends CreatorException{
    public CreateOperationException(){
        super();
    }
    public CreateOperationException(String message){
        super(message);
    }
}
