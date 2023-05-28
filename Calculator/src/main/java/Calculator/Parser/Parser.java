package Calculator.Parser;

import java.util.Arrays;
public class Parser {
    static final int COMMANDS_SIZE = 9;
    public static void parseString(String str){
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
        int commandIndex = Arrays.binarySearch(commands, words[0]);
    }
}
