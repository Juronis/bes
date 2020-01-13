package lt.vaidotas.bes.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
    public static Properties readProperties() {
        try (InputStream input = ClassLoader
                .getSystemResourceAsStream("app.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            return prop;
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
