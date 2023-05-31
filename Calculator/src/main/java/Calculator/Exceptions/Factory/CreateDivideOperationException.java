package Calculator.Exceptions.Factory;

public class CreateDivideOperationException extends CreateOperationException{
    public CreateDivideOperationException(){
        super();
    }
    public CreateDivideOperationException(String message){
        super(message);
    }
}
