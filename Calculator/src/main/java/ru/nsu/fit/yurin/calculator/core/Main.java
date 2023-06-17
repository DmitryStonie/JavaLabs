package ru.nsu.fit.yurin.calculator.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import ru.nsu.fit.yurin.calculator.exceptions.execution.InitReaderException;
import ru.nsu.fit.yurin.calculator.exceptions.execution.OperationException;
import ru.nsu.fit.yurin.calculator.exceptions.execution.ParserException;
import ru.nsu.fit.yurin.calculator.factory.Creator;
import ru.nsu.fit.yurin.calculator.exceptions.factory.CreatorException;
import ru.nsu.fit.yurin.calculator.operations.Operation;
import ru.nsu.fit.yurin.calculator.exceptions.execution.InvalidCommandException;
import ru.nsu.fit.yurin.calculator.factory.Factory;

public class Main {
    public static final Logger logger = Logger.getLogger(Main.class.getName());
    private static final int COMMANDS_FILE_INDEX = 0;
    private static final int WORDS_SIZE = 3;
    public static void main(String[] args) {
        try {
            LogManager.getLogManager().readConfiguration();
            logger.log(Level.INFO, "Application started and constructed.");
            ArrayList<Creator> creators = Factory.makeCreators();
            logger.log(Level.INFO, "Creators created.");
            ExecutionContext context = new ExecutionContext();
            Reader reader = new Reader();
            Parser parser = new Parser();
            parser.init();
            logger.log(Level.INFO, "Parser initialized.");
            String[] words = new String[WORDS_SIZE];
            String str;
            int creatorIndex;
            if (args.length == 0) {
                reader.init(null);
                logger.log(Level.INFO, "Reader initialized from console.");
            } else {
                reader.init(args[COMMANDS_FILE_INDEX]);
                logger.log(Level.INFO, "Reader initialized from file.");
            }
            while (true) {
                str = reader.readString();
                logger.log(Level.INFO, "New command string read.");
                if (str == null) break;
                creatorIndex = parser.parseString(str, words);
                logger.log(Level.INFO, "String parsed into words.");
                Operation operation = creators.get(creatorIndex).createOperation();
                logger.log(Level.INFO, "Created operation instance.");
                operation.doOperation(words, context);
                logger.log(Level.INFO, "Operation completed.");
            }
            logger.log(Level.INFO, "Program completed.");
        } catch(CreatorException | InvalidCommandException e) {
            System.out.println(e.getMessage());
            logger.log(Level.SEVERE, "Error in main.", e);
            System.exit(1);
        }
        catch (OperationException | ParserException | InitReaderException | IOException e){
            System.out.println(e.getMessage());
            logger.log(Level.SEVERE, "Error in main.", e);
        }
    }

}