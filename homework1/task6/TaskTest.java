package homework1.task6;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class TaskTest {

    Random random = new Random();
    private static final float STEP = Float.parseFloat(System.getenv().get("STEP"));

    @Test
    public void testInt() {
        int val = random.nextInt();
        assertEquals(Main.inc(val), val + 1);
    }

    @Test
    public void testFloat() {
        float val = random.nextFloat();
        assertTrue(Main.inc(val) - val - STEP  < 1e-9);
    }

    @Test
    public void testBoolean() {
        assertTrue(Main.inc(false));
        assertTrue(Main.inc(true));
    }

    @Test
    public void testChar() {
        assertEquals(Main.inc('0'), '1');
        assertEquals(Main.inc('9'), 'A');
        assertEquals(Main.inc('A'), 'B');
        assertEquals(Main.inc('Z'), 'a');
        assertEquals(Main.inc('z'), 'z');
    }

    @Test
    public void testSum() {
        int val1 = random.nextInt();
        int val2 = random.nextInt();
        assertEquals(Main.sum(val1, val2), val1 + val2);
    }

}
