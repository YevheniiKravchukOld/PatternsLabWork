package main.java.prototype;

/**
 * Created by evgenii on 07.09.16.
 */
public class Fork extends AbstractDish {

    public Fork() {
        System.out.println("Fork is made!");
    }

    public Fork makeCopy() {

        System.out.println("Fork is being made!");

        Fork forkObject = null;

        try {
            forkObject = (Fork) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return forkObject;
    }

    public String toString() {
        return "I'm a Fork";
    }
}
