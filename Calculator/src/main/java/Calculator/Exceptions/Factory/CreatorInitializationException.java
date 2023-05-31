package Calculator.Exceptions.Factory;

public class CreatorInitializationException extends CreatorException{
    public CreatorInitializationException(){
        super();
    }
    public CreatorInitializationException(String message){
        super(message);
    }
}
