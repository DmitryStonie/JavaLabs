package Calculator.Factory;

import Calculator.Operations.Add;
import Calculator.Operations.Multiple;
import Calculator.Operations.Operation;

public class MultipleCreator extends Creator{
    @Override
    public Operation createOperation(){
        return new Multiple();
    }
}
