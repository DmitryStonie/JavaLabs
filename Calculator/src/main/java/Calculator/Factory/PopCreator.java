package Calculator.Factory;

import Calculator.Operations.Add;
import Calculator.Operations.Operation;
import Calculator.Operations.Pop;

public class PopCreator extends Creator{
    @Override
    public Operation createOperation(){
        return new Pop();
    }
}
