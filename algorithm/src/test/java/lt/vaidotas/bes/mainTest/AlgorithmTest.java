package lt.vaidotas.bes.mainTest;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import lt.vaidotas.bes.generatable.BigInteger8BitGeneratable;
import lt.vaidotas.bes.generator.Generator;
import lt.vaidotas.bes.generator.MultiplicativeRemainderGenerator;
import lt.vaidotas.bes.main.AlgorithmLauncher;


public class AlgorithmTest {
    
    @Test
    public void algorithmFirstTest(){
        Generator<BigInteger8BitGeneratable> generatorA = new MultiplicativeRemainderGenerator( 
                new BigInteger("2147483647"), new BigInteger("16807"), new BigInteger("635"));
        Generator<BigInteger8BitGeneratable> generatorB = new MultiplicativeRemainderGenerator( 
                new BigInteger("2147483647"), new BigInteger("48271"), new BigInteger("12"));
        AlgorithmLauncher<BigInteger8BitGeneratable> algorithmLauncher = 
                new AlgorithmLauncher<BigInteger8BitGeneratable>(generatorA, generatorB);
        Assert.assertEquals(algorithmLauncher.doAlgorithm(1000000), 3926 );
    }
    
    @Test
    public void algorithmSecondTest(){
        Generator<BigInteger8BitGeneratable> generatorA = new MultiplicativeRemainderGenerator( 
                new BigInteger("2147483647"), new BigInteger("16807"), new BigInteger("65"));
        Generator<BigInteger8BitGeneratable> generatorB = new MultiplicativeRemainderGenerator( 
                new BigInteger("2147483647"), new BigInteger("48271"), new BigInteger("8921"));
        AlgorithmLauncher<BigInteger8BitGeneratable> algorithmLauncher = 
                new AlgorithmLauncher<BigInteger8BitGeneratable>(generatorA, generatorB);
        Assert.assertEquals(algorithmLauncher.doAlgorithm(1000000), 3868 );
    }
}
