package lt.vaidotas.bes.generator;

import lt.vaidotas.bes.generatable.Generatable;
/**
 * 
 * @author Vaidotas
 *
 * @param <T>
 * Interface for generating elements of any type in any way
 */
public interface Generator<T extends Generatable<?>> {
    
    public abstract T nextElement();
}
