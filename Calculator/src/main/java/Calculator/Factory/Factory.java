package Calculator.Factory;

import Calculator.Core.Parser;
import Calculator.Core.Reader;
import Calculator.Exceptions.Factory.CreatorException;
import Calculator.Exceptions.Factory.CreatorInitializationException;
import Calculator.Exceptions.Factory.CreatorMakingException;

import java.util.ArrayList;

public class Factory {
    private static final String CONFIG_FILE_NAME = "../Factory/config";
    private static final int WORDS_SIZE = 3;
    private static final int CREATOR_CLASS_INDEX = 1;
    private static final int OPERATION_CLASS_INDEX = 2;

    public static ArrayList makeCreators() throws CreatorException {
        try {
            ArrayList<Creator> creators = new ArrayList<>();
            Reader reader = new Reader();
            Parser parser = new Parser();
            parser.init();
            reader.init(CONFIG_FILE_NAME);
            String str;
            String[] words = new String[WORDS_SIZE];
            int operationIndex;
            while (true) {
                str = reader.readString();
                if (str == null) break;
                operationIndex = parser.parseString(str, words);
                if (operationIndex == -1) break;
                Class creatorClass = Class.forName(words[CREATOR_CLASS_INDEX]);
                Creator creator = (Creator) creatorClass.newInstance();
                creator.initCreator(words[OPERATION_CLASS_INDEX]);
                creators.add(creator);
            }
            return creators;
        } catch (java.lang.InstantiationException | java.lang.IllegalAccessException |
                 java.lang.ClassNotFoundException e) {
            throw new CreatorMakingException("Can't make creator\n");
        } catch (CreatorInitializationException e) {
            throw e;
        }
    }
}
