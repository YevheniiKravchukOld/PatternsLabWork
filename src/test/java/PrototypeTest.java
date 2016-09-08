package test.java;

import main.java.prototype.Fork;
import main.java.prototype.Plate;
import main.java.prototype.Prototype;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by evgenii on 08.09.16.
 */
public class PrototypeTest {

    private Prototype dishMaker;

    @Before
    public void init() {
       dishMaker = new Prototype();
    }

    @Test
    public void getCloneCreatesPlate() throws Exception {

        Plate plate = new Plate();

        Plate clonedPlate = (Plate) dishMaker.getClone(plate);


        assertEquals(Plate.class, clonedPlate.getClass());
        assertNotSame("Objects do not refer to the same object!", plate, clonedPlate);
    }

    @Test
    public void getCloneCreatesFork() throws Exception {

        Fork fork = new Fork();

        Fork clonedFork = (Fork) dishMaker.getClone(fork);

        assertEquals(Fork.class, clonedFork.getClass());
        assertNotSame("Objects do not refer to the same object!", fork, clonedFork);
    }

}