package Calculator.Factory;

public class Factory {
    public static void makeCreators(){
        Creator[] creators = {
                new AddCreator(),
                new DefineCreator(),
                new DivideCreator(),
                new MultipleCreator(),
                new PopCreator(),
                new PrintCreator(),
                new PushCreator(),
                new SqrtCreator(),
                new SubCreator()
        };
    }
}
