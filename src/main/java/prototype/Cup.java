package main.java.prototype;

/**
 * Created by evgenii on 07.09.16.
 */
public class Cup extends AbstractDish {

    public Cup() {
        System.out.println("Cup is made!");
    }

    public Cup makeCopy() {

        System.out.println("Cup is being made");

        Cup cupObject = null;

        try {
            cupObject = (Cup) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cupObject;
    }

    public String toString() {
        return "I'm a Cup";
    }
}
