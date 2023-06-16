package calculator.exceptions.execution;

public class MultipleOperationException extends OperationException{
    public MultipleOperationException(){
        super();
    }
    public MultipleOperationException(String message){
        super(message);
    }
}
