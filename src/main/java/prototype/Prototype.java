package main.java.prototype;

/**
 * Created by evgenii on 07.09.16.
 */
public class Prototype {

    public AbstractDish getClone(AbstractDish dishSample) {
        return dishSample.makeCopy();
    }

}
