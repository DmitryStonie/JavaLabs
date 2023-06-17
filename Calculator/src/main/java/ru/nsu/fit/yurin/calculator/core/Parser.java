package ru.nsu.fit.yurin.calculator.core;

import ru.nsu.fit.yurin.calculator.exceptions.execution.InitParserException;
import ru.nsu.fit.yurin.calculator.exceptions.execution.InvalidCommandException;
import ru.nsu.fit.yurin.calculator.factory.Factory;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser {

    private static final int WORDS_SIZE = 3;
    private static final String CONFIG_FILE_NAME = "../factory/config";
    private static final int COMMAND_INDEX = 0;
    private static ArrayList<String> commands = null;

    public void init() throws InitParserException {
        commands = new ArrayList<>();
        String str;
        String[] words;
        InputStream config = Factory.class.getResourceAsStream(CONFIG_FILE_NAME);
        if (config == null) throw new InitParserException("Error in parser initialization\n");
        Scanner input = new Scanner(config);
        while (input.hasNext()) {
            str = input.nextLine();
            words = str.split(" ", WORDS_SIZE);
            commands.add(words[COMMAND_INDEX]);
        }
    }

    public int parseString(String str, String[] words) throws InvalidCommandException {
        String[] localWords = str.split(" ", WORDS_SIZE);
        System.arraycopy(localWords, 0, words, 0, localWords.length);
        int commandIndex = commands.lastIndexOf(words[COMMAND_INDEX]);
        if(commandIndex == -1) throw new InvalidCommandException("Exception. No such command.");
        return commandIndex;
    }
}
