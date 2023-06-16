package calculator.core;

import calculator.exceptions.execution.InitReaderException;

import java.io.*;
import java.util.Scanner;

public class Reader {
    private Scanner scanner;

    public void init(String filename) throws InitReaderException {
        if (filename == null) {
            scanner = new Scanner(System.in);
        } else {
            InputStream input = Reader.class.getResourceAsStream(filename);
            if (input == null) throw new InitReaderException("Exception in reader initialization\n");
            scanner = new Scanner(input);
        }
    }

    public String readString() {
        if (scanner.hasNext()) {
            return scanner.nextLine();
        } else {
            return null;
        }
    }

}
