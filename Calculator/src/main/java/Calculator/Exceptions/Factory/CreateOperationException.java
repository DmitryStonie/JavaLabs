package Calculator.Exceptions.Factory;

public class CreateOperationException extends Exception{
    public CreateOperationException(){
        super();
    }
    public CreateOperationException(String message){
        super(message);
    }
}
