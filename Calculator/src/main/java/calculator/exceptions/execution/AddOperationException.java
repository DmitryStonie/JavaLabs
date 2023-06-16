package calculator.exceptions.execution;

public class AddOperationException extends OperationException{
    public AddOperationException(){
        super();
    }
    public AddOperationException(String message){
        super(message);
    }
}
