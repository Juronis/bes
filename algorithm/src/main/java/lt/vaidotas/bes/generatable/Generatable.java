package lt.vaidotas.bes.generatable;

/**
 * 
 * @author Vaidotas
 *
 * @param <K>
 * Wrapper for holding generated objects and comparing them in 
 * preferred way
 */
public abstract class Generatable<K> {
    
    private K objectHolder;
    
    public K getObjectHolder() {
        return objectHolder;
    }

    public Generatable(K pObjectHolder){
        this.objectHolder = pObjectHolder;
    }
    
    public abstract int compareToGenerated(Object toCompare);
    
    public abstract String stringRepresentation();
    
}
