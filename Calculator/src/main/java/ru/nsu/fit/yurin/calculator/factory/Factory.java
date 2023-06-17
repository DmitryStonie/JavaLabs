package ru.nsu.fit.yurin.calculator.factory;

import ru.nsu.fit.yurin.calculator.core.Main;
import ru.nsu.fit.yurin.calculator.core.Parser;
import ru.nsu.fit.yurin.calculator.core.Reader;
import ru.nsu.fit.yurin.calculator.exceptions.execution.InitParserException;
import ru.nsu.fit.yurin.calculator.exceptions.execution.InitReaderException;
import ru.nsu.fit.yurin.calculator.exceptions.execution.InvalidCommandException;
import ru.nsu.fit.yurin.calculator.exceptions.factory.CreatorException;
import ru.nsu.fit.yurin.calculator.exceptions.factory.CreatorInitializationException;
import ru.nsu.fit.yurin.calculator.exceptions.factory.CreatorMakingException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Factory {
    public static final Logger logger = Logger.getLogger(Main.class.getName());
    private static final String CONFIG_FILE_NAME = "../factory/config";
    private static final int WORDS_SIZE = 3;
    private static final int CREATOR_CLASS_INDEX = 1;
    private static final int OPERATION_CLASS_INDEX = 2;

    public static ArrayList<Creator> makeCreators() throws CreatorException, IOException {
        try {
            LogManager.getLogManager().readConfiguration();
            logger.log(Level.INFO, "Factory started.");
            ArrayList<Creator> creators = new ArrayList<>();
            Reader reader = new Reader();
            Parser parser = new Parser();
            parser.init();
            logger.log(Level.INFO, "Factory parser inited.");
            reader.init(CONFIG_FILE_NAME);
            logger.log(Level.INFO, "Factory reader inited.");
            String str;
            String[] words = new String[WORDS_SIZE];
            while (true) {
                str = reader.readString();
                if (str == null) break;
                parser.parseString(str, words);
                Class<?> creatorClass = Class.forName(words[CREATOR_CLASS_INDEX]);
                Creator creator = (Creator) creatorClass.newInstance();
                logger.log(Level.INFO, "Factory new creator made.");
                creator.initCreator(words[OPERATION_CLASS_INDEX]);
                logger.log(Level.INFO, "Factory new creator inited.");
                creators.add(creator);
                logger.log(Level.INFO, "Factory new creator added.");
            }
            return creators;
        } catch (java.lang.InstantiationException | java.lang.IllegalAccessException |
                 java.lang.ClassNotFoundException e) {
            logger.log(Level.INFO, "Error in factory.", e);
            throw new CreatorMakingException("Can't make creator\n");
        } catch (InitParserException | InitReaderException | CreatorInitializationException | InvalidCommandException e){
            System.out.println(e.getMessage());
            logger.log(Level.INFO, "Error in factory.", e);
            throw new CreatorMakingException("Can't make creator\n");
        }
    }
}
