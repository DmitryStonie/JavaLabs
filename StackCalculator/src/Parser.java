import Operations.Operation;

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Stack;

public class Parser {
    String filename;
    int readBytes;
    FileReader fileStream;
    BufferedReader bufferedStream;
    {
        readBytes = 0;
    }
    Parser (){
        this.filename = "Undefined";
    }
    Parser(String file){
        this.filename = file;
    }
    void init(){
        try {
            this.fileStream = new FileReader(filename);
            this.bufferedStream = new BufferedReader(this.fileStream);
        }
        catch (Exception ex){
            System.out.println("Exception!\n");
        }
    }
    void read(int count, Stack<Operation> operations, Stack<Double> numbers){
        String line;
        try {
            while((line = this.bufferedStream.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (Exception ex){
            System.out.println("Error!");
        }
    }
}
