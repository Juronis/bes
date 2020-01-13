package lt.vaidotas.bes.main;

import lt.vaidotas.bes.generatable.Generatable;
import lt.vaidotas.bes.generator.Generator;

public class AlgorithmLauncher<J extends Generatable<?>> {
    
    private Generator<J> firstGenerator;
    private Generator<J> secondGenerator;
    
    public AlgorithmLauncher(Generator<J> pFirstGenerator, Generator<J> pSecondGenerator){
        this.firstGenerator = pFirstGenerator;
        this.secondGenerator = pSecondGenerator;
    }
    
    public int doAlgorithm(int iterations){
        int matchCounter = 0;
        for (int d=1; d<=iterations; d++){
            if((firstGenerator.nextElement()).compareToGenerated(secondGenerator.nextElement()) == 0){
                matchCounter++;
            }
        }
        return matchCounter;
    }
}
