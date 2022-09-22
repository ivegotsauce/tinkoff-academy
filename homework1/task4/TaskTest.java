package homework1.task4;

import homework1.task4.thread.safe.ConcurrentLinkedList;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Comparator;
import java.util.Random;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TaskTest {

    private static LinkedList list1;
    private static java.util.LinkedList<Integer> list2;
    private static Random random;
    private final static int n = 10;

    @BeforeClass
    public static void beforeAll() {
        list1 = new LinkedList();
        list2 = new java.util.LinkedList<>();
        random = new Random();

        fillLists();
    }

    public static void fillLists() {
        for (int i = 0; i < n; i++) {
            int val = random.nextInt();
            list1.add(val);
            list2.add(val);
        }
    }

    @Test
    public void test1GetTest() {
        test3SizeTest();
        for (int i = 0; i < list1.size(); i++) {
            assertEquals(list1.get(i), list2.get(i));
        }
    }

    @Test
    public void test2SetTest() {
        test3SizeTest();
        for (int i = 0; i < list1.size(); i++) {
            int val = random.nextInt();
            list1.set(i, val);
            list2.set(i, val);
        }
        test1GetTest();
    }

    @Test
    public void test3SizeTest() {
        assertEquals(list1.size(), list2.size());
    }

    @Test
    public void test4RemoveTest() {
        test3SizeTest();
        int ind = random.nextInt(list1.size());
        list1.remove(ind);
        list2.remove(ind);
        test1GetTest();
    }

    @Test
    public void test5SortTest() {
        list1.sort();
        list2.sort(Comparator.naturalOrder());
        test1GetTest();
    }

    @Test
    public void test6ThreadSafeTest() {
        list1 = new ConcurrentLinkedList();
        list2 = new java.util.LinkedList<>();
        fillLists();
        test1GetTest();
        test2SetTest();
        test3SizeTest();
        test4RemoveTest();
        test5SortTest();
    }

}
