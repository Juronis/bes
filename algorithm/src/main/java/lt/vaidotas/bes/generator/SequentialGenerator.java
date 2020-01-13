package lt.vaidotas.bes.generator;

import lt.vaidotas.bes.generatable.Generatable;

/**
 * 
 * @author Vaidotas
 *
 * @param <V>
 * Abtract implementation of generator where value is generated based on one previous
 * value. 
 */
public abstract class SequentialGenerator<V extends Generatable<?>> implements Generator<V> {
    
    /**
     * Flag for checking if this is first call or not
     */
    private boolean firstElement = true;
    
    /**
     * reference to previously returned value
     */
    protected V currentElement;

    public abstract V generateNextFromCurrent(V current);

    /**
     * First call to this method returns current element, all other
     * calls should generate a new value
     */
    public V nextElement(){
        if(firstElement){
            firstElement = false;
            return currentElement;
        }
        else{
            V toReturn = generateNextFromCurrent(currentElement);
            currentElement = toReturn;
            return toReturn;
        }
    }
}
