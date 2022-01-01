package lab2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCLassTest {

    @Test
    public void constructor() {
        SimpleCLass s = new SimpleCLass(2);
        assertEquals(2, s.getValue());
    }

    @Test
    public void testToString() {
        SimpleCLass s = new SimpleCLass(2);
        assertEquals(2, s.getValue());
    }

    @Test
    public void incr() {
        SimpleCLass s = new SimpleCLass(2);
        for (int i = 0; i < 100; i++)
            s.incr();
        assertEquals(102, s.getValue());
    }

    @Test
    public void getValue() {
        SimpleCLass s = new SimpleCLass(20);
        assertEquals(20, s.getValue());
    }

    @Test
    public void setValue() {
        SimpleCLass s = new SimpleCLass(20);
        s.setValue(10);
        assertEquals(10, s.getValue());
    }



    @Test
    public void staticTest () {
        SimpleCLass.setNumberOfInst(0);
        int instances = SimpleCLass.getNumberOfInst();
        assertEquals(0, instances);
        SimpleCLass two = new SimpleCLass(2);
        SimpleCLass thirty = new SimpleCLass(30);
        SimpleCLass five = new SimpleCLass(2);
        SimpleCLass forty = new SimpleCLass(30);
        instances = SimpleCLass.getNumberOfInst();
        assertEquals(4,instances);
    }
}
