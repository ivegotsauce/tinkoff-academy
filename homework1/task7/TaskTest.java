package homework1.task7;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class TaskTest {

    private static final Random random = new Random();

    @Test
    public void testNumericalAdd() {
        int val1 = random.nextInt();
        int val2 = random.nextInt();
        Add add = new NumericalAdd();
        assertEquals((int) add.add(val1, val2), val1 + val2);
    }

    @Test
    public void testStringAdd() {
        String val1 = "hello";
        String val2 = "world";
        Add add = new StringAdd();
        assertEquals((String) add.add(val1, val2), "helloworld");
    }

}
