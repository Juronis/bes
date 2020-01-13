package lt.vaidotas.bes.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
    public static Properties readProperties( String path) {
        try (InputStream input = ClassLoader
                .getSystemResourceAsStream(path)) {
            Properties prop = new Properties();
            prop.load(input);
            return prop;
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
