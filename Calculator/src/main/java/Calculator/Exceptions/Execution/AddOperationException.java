package Calculator.Exceptions.Execution;

public class AddOperationException extends OperationException{
    public AddOperationException(){
        super();
    }
    public AddOperationException(String message){
        super(message);
    }
}
