package lt.vaidotas.bes.main;

import java.math.BigInteger;
import java.util.Properties;

import lt.vaidotas.bes.generatable.BigInteger8BitGeneratable;
import lt.vaidotas.bes.generator.Generator;
import lt.vaidotas.bes.generator.MultiplicativeRemainderGenerator;

public class MainLauncher {
    
    /**
     * main method, which handles user interface
     * @param args
     */
    public static void main(String[] args) {
        BigInteger bigA = new BigInteger(args[0]); 
        BigInteger bigB = new BigInteger(args[1]);
        Properties prop = PropertiesReader.readProperties();
        if(prop == null){
            System.out.println("Could not read properties file: ");
            System.exit(1);
        }
        Generator<BigInteger8BitGeneratable> generatorA = new MultiplicativeRemainderGenerator( 
                new BigInteger(prop.getProperty("divisor")), new BigInteger(prop.getProperty("generatorA.factor")), bigA);
        Generator<BigInteger8BitGeneratable> generatorB = new MultiplicativeRemainderGenerator( 
                new BigInteger(prop.getProperty("divisor")), new BigInteger(prop.getProperty("generatorB.factor")), bigB);
        AlgorithmLauncher<BigInteger8BitGeneratable> algorithmLauncher = 
                new AlgorithmLauncher<BigInteger8BitGeneratable>(generatorA, generatorB);
        System.out.println("MatchCount: " + 
                algorithmLauncher.doAlgorithm(new Integer(prop.getProperty("repetitionCount"))));
        return;
    }
}
