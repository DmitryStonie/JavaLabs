package Calculator.Factory;

import Calculator.Operations.Add;
import Calculator.Operations.Operation;
import Calculator.Operations.Print;

public class PrintCreator extends Creator{
    @Override
    public Operation createOperation(){
        return new Print();
    }
}
