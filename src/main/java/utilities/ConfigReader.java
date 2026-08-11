package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class ConfigReader {

//  ConfigReader is a Utility Class that reads values from the config.properties file.
//   Utility classes are usually declared final to prevent inheritance because they only contain helper methods and shared functionality.
//    Properties is a java class
//    Private cannot be accessed outside of the class
//    static wil have only one copy in the meory, if 500 tc execute only 1 copy in the memory because of static


    private static final Properties properties = new Properties();

    static {

        try (FileInputStream fis = new FileInputStream(
                System.getProperty("user.dir")
                        + "/src/test/resources/config.properties")) {

//      FileInputStream opens config.properties

            properties.load(fis);

//     properties.load(fis); reads values like browser=chrome
//url=https://google.com

        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
    }

    private ConfigReader() {

    }

    public static String get(String key) {

        return properties.getProperty(key);

    }

}
//Utility classes don't need objects.
//
//Everything is static.
//
//Interview Question
//
//Why private constructor?
//
//Answer
//
//To prevent object creation because the class only contains static utility methods.