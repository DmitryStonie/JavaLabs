package Calculator.Exceptions.Factory;

public class CreatePrintOperationException extends CreateOperationException{
    public CreatePrintOperationException(){
        super();
    }
    public CreatePrintOperationException(String message){
        super(message);
    }
}
