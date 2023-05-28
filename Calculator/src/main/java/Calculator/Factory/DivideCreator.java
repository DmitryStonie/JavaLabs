package Calculator.Factory;

import Calculator.Operations.Add;
import Calculator.Operations.Divide;
import Calculator.Operations.Operation;

public class DivideCreator extends Creator{
    @Override
    public Operation createOperation(){
        return new Divide();
    }
}
