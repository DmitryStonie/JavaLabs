package Calculator.Core;

import java.io.*;
import java.util.Scanner;

public class Reader {
    private Scanner scanner;

    public void init(String filename) {
        if (filename == null) {
            scanner = new Scanner(System.in);
        } else {
            InputStream input = Reader.class.getResourceAsStream(filename);
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
