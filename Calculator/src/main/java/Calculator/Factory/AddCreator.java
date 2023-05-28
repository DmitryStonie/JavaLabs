package Calculator.Factory;

import Calculator.Operations.Add;
import Calculator.Operations.Operation;

public final class AddCreator extends Creator{
    @Override
    public Operation createOperation(){
        return new Add();
    }
}
