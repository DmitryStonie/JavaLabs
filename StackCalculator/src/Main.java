import Operations.Operation;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //if args is empty?
        Parser Input = new Parser(args[0]);
        Input.init();
        Stack<Operation> operations;
        Stack<Double> numbers;
        Input.read(10);
        System.out.println("Hello world!");
    }
}