package Calculator.Factory;

import Calculator.Operations.Add;
import Calculator.Operations.Operation;
import Calculator.Operations.Sub;

public class SubCreator extends Creator{
    @Override
    public Operation createOperation(){
        return new Sub();
    }
}
