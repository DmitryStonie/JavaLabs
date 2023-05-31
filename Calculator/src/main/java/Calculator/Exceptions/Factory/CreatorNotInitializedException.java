package Calculator.Exceptions.Factory;

public class CreatorNotInitializedException extends CreatorException{
    public CreatorNotInitializedException(){
        super();
    }
    public CreatorNotInitializedException(String message){
        super(message);
    }
}
