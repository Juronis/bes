package lt.vaidotas.bes.generatable;

import java.math.BigInteger;

/**
 * 
 * @author Vaidotas
 * Wrapper for BigInteger, with comparison based in last 8 bits
 */
public class BigInteger8BitGeneratable extends Generatable<BigInteger>{

    static final BigInteger TwoToPowerEight = new BigInteger("256");
    
    public BigInteger8BitGeneratable(BigInteger pObjectHolder) {
        super(pObjectHolder);
    }
    
    @Override
    public int compareToGenerated(Object toCompare) {
        if(!(toCompare instanceof BigInteger8BitGeneratable)){
            throw new ClassCastException("Invalid class type. Expected: BigInteger8BitGeneratable, got: "
                + toCompare.getClass().getCanonicalName());
        }
        return getObjectHolder().remainder(TwoToPowerEight)
                .compareTo(((BigInteger8BitGeneratable)toCompare).getObjectHolder().remainder(TwoToPowerEight));
    }

    @Override
    public String stringRepresentation() {
        return getObjectHolder().toString();
    }
    
}
