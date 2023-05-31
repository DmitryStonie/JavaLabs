package Calculator.Exceptions.Execution;

public class PrintOperationException extends OperationException{
    public PrintOperationException(){
        super();
    }
    public PrintOperationException(String message){
        super(message);
    }
}
