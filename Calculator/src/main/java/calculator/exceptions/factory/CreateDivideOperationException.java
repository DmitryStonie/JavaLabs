package calculator.exceptions.factory;

public class CreateDivideOperationException extends CreateOperationException{
    public CreateDivideOperationException(){
        super();
    }
    public CreateDivideOperationException(String message){
        super(message);
    }
}
