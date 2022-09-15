package homework1.task9;

import java.util.*;

public class Main {

    public static void llTime(long start, long end) {
        System.out.print("LinkedList:\nTotal execution time: " + (end - start) + "ms\n");
    }

    public static void alTime(long start, long end) {
        System.out.print("ArrayList:\nTotal execution time: " + (end - start) + "ms\n");
    }

    public static void addElements(List<Integer> list) {
        for (int i = 0; i < 200000; i++) {
            list.add(i % 16);
        }
    }

    public static void addStrings(List<String> list) {
        for (int i = 0; i < 200000; i++) {
            list.add(String.valueOf(i % 16) + "A".repeat(i % 13));
        }
    }

    public static <T> void deleteFirstElement(List<T> list, boolean first) {
        for (int i = 0; i < 50000; i++) {
            if (first) {
                list.remove(0);
            } else {
                list.remove(list.size() - 1);
            }
        }
    }

    public static void deleteLarger(List<Integer> list) {
        list.removeIf(a -> a > 13);
    }

    public static void deleteLargerStrings(List<String> list) {
        list.removeIf(a -> a.length() > 13);
    }

    public static void testAddElements(List<Integer> list1, List<Integer> list2) {
        long start, end;
        start = System.currentTimeMillis();
        addElements(list1);
        end = System.currentTimeMillis();
        alTime(start, end);
        start = System.currentTimeMillis();
        addElements(list2);
        end = System.currentTimeMillis();
        llTime(start, end);
    }

    public static void testAddStrings(List<String> list1, List<String> list2) {
        long start, end;
        start = System.currentTimeMillis();
        addStrings(list1);
        end = System.currentTimeMillis();
        alTime(start, end);
        start = System.currentTimeMillis();
        addStrings(list2);
        end = System.currentTimeMillis();
        llTime(start, end);
    }

    public static <T> void testDeleteElement(List<T> list1, List<T> list2, boolean first) {
        long start, end;
        start = System.currentTimeMillis();
        deleteFirstElement(list1, first);
        end = System.currentTimeMillis();
        alTime(start, end);
        start = System.currentTimeMillis();
        deleteFirstElement(list2, first);
        end = System.currentTimeMillis();
        llTime(start, end);
    }

    public static void testDeleteLarger(List<Integer> list1, List<Integer> list2) {
        long start, end;
        start = System.currentTimeMillis();
        deleteLarger(list1);
        end = System.currentTimeMillis();
        alTime(start, end);
        start = System.currentTimeMillis();
        deleteLarger(list2);
        end = System.currentTimeMillis();
        llTime(start, end);
    }

    public static void testDeleteLargerStrings(List<String> list1, List<String> list2) {
        long start, end;
        start = System.currentTimeMillis();
        deleteLargerStrings(list1);
        end = System.currentTimeMillis();
        alTime(start, end);
        start = System.currentTimeMillis();
        deleteLargerStrings(list2);
        end = System.currentTimeMillis();
        llTime(start, end);
    }

    public static void main(String[] args) {
        System.out.println("--------------Integers--------------");
        ArrayList<Integer> al = new ArrayList<>();
        java.util.LinkedList<Integer> ll = new java.util.LinkedList<>();

        System.out.print("Add element: \n\n");
        testAddElements(al, ll);
        System.out.println("\nDelete first element:\n");
        testDeleteElement(al, ll, true);
        System.out.println("\nDelete last element:\n");
        testDeleteElement(al, ll, false);
        System.out.println("\nDelete in different places:\n");
        testDeleteLarger(al, ll);

        System.out.println("--------------Strings--------------");

        ArrayList<String> stringsAl = new ArrayList<>();
        java.util.LinkedList<String> stringsLl = new LinkedList<>();
        System.out.print("Add element: \n\n");
        testAddStrings(stringsAl, stringsLl);
        System.out.println("\nDelete first element:\n");
        testDeleteElement(stringsAl, stringsLl, true);
        System.out.println("\nDelete last element:\n");
        testDeleteElement(stringsAl, stringsLl, false);
        System.out.println("\nDelete in different places:\n");
        testDeleteLargerStrings(stringsAl, stringsLl);

    }
}
