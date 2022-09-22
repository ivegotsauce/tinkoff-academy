package homework1.task14;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TaskTest {


    private static TenQueue queue;

    @BeforeClass
    public static void beforeAll() {
        queue = new TenQueue();
    }

    @Test
    public void test1Empty() {
        assertTrue(queue.empty());
    }

    @Test
    public void test2Enqueue() {
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i + 1);
        }
        assertEquals(120, queue.getProduct());
    }

    @Test
    public void test3Dequeue() {
        for (int i = 0; i < 3; i++) {
            queue.dequeue();
        }
        assertEquals(20, queue.getProduct());
    }

    @Test
    public void test4Zeros() {
        queue.enqueue(0);
        queue.enqueue(0);
        queue.enqueue(6);
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();
        assertEquals(0, queue.getProduct());
        queue.dequeue();
        assertEquals(0, queue.getProduct());
        queue.dequeue();
        assertEquals(30, queue.getProduct());
    }

}
