package Calculator.Core;

import Calculator.Factory.Factory;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser {

    private static final int WORDS_SIZE = 3;
    private static final String CONFIG_FILE_NAME = "../Factory/config";
    private static ArrayList<String> commands;
    public static void initParser(){
        commands = new ArrayList<String>();
        String str = new String();
        String[] words = new String[WORDS_SIZE];
        InputStream config = Factory.class.getResourceAsStream(CONFIG_FILE_NAME);
        Scanner input = new Scanner(config);
        while (input.hasNext()) {
            str = input.nextLine();
            words = str.split(" ", WORDS_SIZE);
            commands.add(words[0]);
        }
    }
    public int parseString(String str, String[] words){
        words = str.split(" ", WORDS_SIZE);
        int operationIndex = commands.lastIndexOf(words[0]);
        return operationIndex;
    }
}
