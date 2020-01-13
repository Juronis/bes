package lt.vaidotas.bes.mainTest;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import lt.vaidotas.bes.generator.MultiplicativeRemainderGenerator;

public class GeneratorTest {
    
    @Test
    public void generatorTest(){
        MultiplicativeRemainderGenerator generator = new MultiplicativeRemainderGenerator(
                new BigInteger("100"),new BigInteger("2"), new BigInteger("1"));
        Assert.assertEquals(generator.nextElement().getObjectHolder().toString(), "2" );
        Assert.assertEquals(generator.nextElement().getObjectHolder().toString(), "4" );
        Assert.assertEquals(generator.nextElement().getObjectHolder().toString(), "8" );
        Assert.assertEquals(generator.nextElement().getObjectHolder().toString(), "16" );
        Assert.assertEquals(generator.nextElement().getObjectHolder().toString(), "32" );
        Assert.assertEquals(generator.nextElement().getObjectHolder().toString(), "64" );
        Assert.assertEquals(generator.nextElement().getObjectHolder().toString(), "28" );
        Assert.assertEquals(generator.nextElement().getObjectHolder().toString(), "56" );
        Assert.assertEquals(generator.nextElement().getObjectHolder().toString(), "12" );
    }
   
}
