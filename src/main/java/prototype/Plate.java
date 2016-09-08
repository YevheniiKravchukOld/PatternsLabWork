package main.java.prototype;

/**
 * Created by evgenii on 07.09.16.
 */
public class Plate extends AbstractDish {

    public Plate() {
        System.out.println("Plate is made!");
    }

    public AbstractDish makeCopy() {

        System.out.println("Plate is being made");

        Plate plateObject = null;

        try {
            plateObject = (Plate) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return plateObject;
    }

    public String toString() {
        return "I'm a plate";
    }
}
