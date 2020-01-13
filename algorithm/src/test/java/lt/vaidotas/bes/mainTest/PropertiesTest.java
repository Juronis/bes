package lt.vaidotas.bes.mainTest;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

import lt.vaidotas.bes.main.PropertiesReader;


public class PropertiesTest {
    
    @Test
    public void propertiesTest(){
        Properties properties = PropertiesReader.readProperties("app.properties"); 
        Assert.assertEquals(properties.getProperty("repetitionCount"), "10" );
        Assert.assertEquals(properties.getProperty("generatorA.factor"), "12345" );
        Assert.assertEquals(properties.getProperty("generatorB.factor"), "85741" );
        Assert.assertEquals(properties.getProperty("divisor"), "14141414" );
    }
}
