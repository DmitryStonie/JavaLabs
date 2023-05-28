package Calculator.Factory;

import Calculator.Operations.Add;
import Calculator.Operations.Operation;
import Calculator.Operations.Push;

public class PushCreator extends Creator{
    @Override
    public Operation createOperation(){
        return new Push();
    }
}
