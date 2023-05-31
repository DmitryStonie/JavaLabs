package Calculator.Exceptions.Execution;

public class DivideOperationException extends OperationException{
    public DivideOperationException(){
        super();
    }
    public DivideOperationException(String message){
        super(message);
    }
}
