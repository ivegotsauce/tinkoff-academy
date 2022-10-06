package homework1.task11;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskTest {

    @Test
    public void testCache() {
        LRUCache cache = new LRUCache();
        String json1 = cache.get(1);
        cache.get(2);
        String json3 = cache.get(3);
        String json4 = cache.get(4);
        cache.get(5);
        assertEquals(json3, cache.get(3));
        assertEquals(json1, cache.get(1));
        cache.get(6);
        assertEquals(json4, cache.get(4));
    }

}
