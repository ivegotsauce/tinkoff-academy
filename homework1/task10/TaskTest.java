package homework1.task10;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import static org.junit.Assert.*;

public class TaskTest {

    private static final Random random = new Random();
    private static Integer[] arr;

    @BeforeClass
    public static void beforeAll() {
        arr = new Integer[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(21);
        }
    }

    @Test
    public void testPrintMaxAndRemove() {
        int max = Arrays.stream(arr).max(Comparator.naturalOrder()).get();
        int max2 = Arrays.stream(Main.printMaxAndRemove(arr)).max(Comparator.naturalOrder()).get();
        assertTrue(max > max2);
    }

}
