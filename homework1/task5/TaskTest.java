package homework1.task5;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class TaskTest {

    private static final Random random = new Random();

    @Test
    public void testSums() {
        int v1 = random.nextInt(100);
        int v2 = random.nextInt(100);
        int v3 = random.nextInt(100);
        int v4 = random.nextInt(100);
        int v5 = random.nextInt(100);
        int v6 = random.nextInt(100);
        assertEquals(Main.sum(v1, v2), v1 + v2);
        assertEquals(Main.sum(v1, v2, v3), v1 + v2 + v3);
        assertEquals(Main.sum(v1, v2, v3, v4), v1 + v2 + v3 + v4);
        assertEquals(Main.sum(v1, v2, v3, v4, v5), v1 + v2 + v3 + v4 + v5);
        assertEquals(Main.getSum(v1, v2, v3, v4, v5, v6), v1 + v2 + v3 + v4 + v5 + v6);
    }

    @Test
    public void testCompare() {
        assertTrue(Main.compare("abc", "cde") < 0);
        assertTrue(Main.compare(random.nextInt(30) + 5, random.nextInt(5)) > 0);
        assertEquals(0, Main.compare(2.2, 2.2));
    }

}
