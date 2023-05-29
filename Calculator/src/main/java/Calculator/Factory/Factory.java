package Calculator.Factory;

import Calculator.Operations.Operation;
import Calculator.Parser.Parser;

import javax.xml.parsers.FactoryConfigurationError;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Factory {
    private static final String CONFIG_FILE_NAME = "config";
    private static final int WORDS_SIZE = 3;
    private static final int OPERATION_NAME = 0;
    private static final int CREATOR_CLASS = 1;
    private static final int OPERATION_CLASS = 2;
    public static ArrayList makeCreators() {
        ArrayList<Creator> creators = new ArrayList<Creator>();
        try {
            String str = new String();
            String[] words = new String[WORDS_SIZE];
            InputStream config = Factory.class.getResourceAsStream(CONFIG_FILE_NAME);
            Scanner input = new Scanner(config);
            while (input.hasNext()) {
                str = input.nextLine();
                Parser.parseString(str);
                if (str != null) {
                    Class creatorClass = Class.forName(words[CREATOR_CLASS]);
                    Creator creator = (Creator) creatorClass.newInstance();
                    creator.initCreator(words[OPERATION_CLASS]);
                    creators.add(creator);
                } else {
                    //throw FactoryConfigurationError;//плохо?
                }
            }
            return creators;
        }  catch (java.lang.InstantiationException e) {
            System.out.println(e.getMessage());
        } catch (java.lang.IllegalAccessException e) {
            System.out.println(e.getMessage());
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return creators;
    }
}
