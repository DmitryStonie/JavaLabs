package Calculator.Exceptions.Factory;

public class CreateAddOperationException extends CreateOperationException{
    public CreateAddOperationException(){
        super();
    }
    public CreateAddOperationException(String message){
        super(message);
    }
}
