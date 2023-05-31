package Calculator.Exceptions.Execution;

public class MultipleOperationException extends OperationException{
    public MultipleOperationException(){
        super();
    }
    public MultipleOperationException(String message){
        super(message);
    }
}
