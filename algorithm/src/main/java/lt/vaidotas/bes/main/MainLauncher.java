package lt.vaidotas.bes.main;

import java.math.BigInteger;
import java.util.Properties;

import lt.vaidotas.bes.generatable.BigInteger8BitGeneratable;
import lt.vaidotas.bes.generator.Generator;
import lt.vaidotas.bes.generator.MultiplicativeRemainderGenerator;

public class MainLauncher {
    
    private static final String PATH_TO_PROPERTIES = "app.properties";
    /**
     * main method, which handles user interface
     * @param args
     */
    public static void main(String[] args) {
        Properties prop = PropertiesReader.readProperties(PATH_TO_PROPERTIES);
        if(prop == null){
            System.out.println("Could not read properties file: ");
            System.exit(1);
        }
        Generator<BigInteger8BitGeneratable> generatorA = null;
        Generator<BigInteger8BitGeneratable> generatorB = null;
        try{
            BigInteger bigIntegerA = new BigInteger(args[0]); 
            BigInteger bigIntegerB = new BigInteger(args[1]);
            generatorA = new MultiplicativeRemainderGenerator( 
                    new BigInteger(prop.getProperty("divisor")), new BigInteger(prop.getProperty("generatorA.factor")), bigIntegerA);
            generatorB = new MultiplicativeRemainderGenerator( 
                    new BigInteger(prop.getProperty("divisor")), new BigInteger(prop.getProperty("generatorB.factor")), bigIntegerB);
        }catch(NumberFormatException e){
            System.out.println("Invalid number :" + e.getLocalizedMessage());
            System.exit(1);
        }
        AlgorithmLauncher<BigInteger8BitGeneratable> algorithmLauncher = 
                new AlgorithmLauncher<BigInteger8BitGeneratable>(generatorA, generatorB);
        System.out.println("MatchCount: " + 
                algorithmLauncher.doAlgorithm(new Integer(prop.getProperty("repetitionCount"))));
        return;
    }
}
