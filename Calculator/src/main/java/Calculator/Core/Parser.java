package Calculator.Core;

import Calculator.Factory.Factory;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser {

    private static final int WORDS_SIZE = 3;
    private static final String CONFIG_FILE_NAME = "../Factory/config";
    private static String[] localWords = new String[3];
    private static ArrayList<String> commands = null;
    public void init(){
            commands = new ArrayList<>();
            String str;
            String[] words;
            InputStream config = Factory.class.getResourceAsStream(CONFIG_FILE_NAME);
            Scanner input = new Scanner(config);
            while (input.hasNext()) {
                str = input.nextLine();
                words = str.split(" ", WORDS_SIZE);
                commands.add(words[0]);
            }
    }

    public int parseString(String str, String[] words){
        localWords = str.split(" ", WORDS_SIZE);
        System.arraycopy(localWords, 0, words, 0, localWords.length);
        return commands.lastIndexOf(words[0]);
    }
}
