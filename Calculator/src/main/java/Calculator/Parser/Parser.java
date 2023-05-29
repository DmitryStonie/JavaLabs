package Calculator.Parser;

import java.util.Arrays;
public class Parser {
    static final int COMMANDS_SIZE = 9;
    public static String[] parseString(String str){
        String[] commands = {"+",
                "DEFINE",
                "/",
                "*",
                "POP",
                "PRINT",
                "PUSH",
                "SQRT",
                "-"
        };
        String[] words = new String[3];
        words = str.split(" ", 3);
        if(words[0].equals()){
            return words;
        } else{
            return null;
        }
    }
}
