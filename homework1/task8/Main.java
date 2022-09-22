package homework1.task8;

import homework1.task10.ArrayModificationException;

import java.util.*;

public class Main {

    public static Integer[] printMaxAndRemove(Integer[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(i, max);
        }
        System.out.println(max);
        int cnt = 0;
        for (int i : arr) {
            if (i == max) {
                cnt++;
            }
        }
        Integer[] newArr = new Integer[arr.length - cnt];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                newArr[k] = arr[i];
                k++;
            }
        }
        return newArr;
    }

    public static Integer[] printMaxRemoveAndThrow(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(i, max);
        }
        System.out.println(max);
        int k = 0;
        for (int i : list) {
            if (i == max) {
                list.remove(k);
            }
            k++;
        }
        return list.toArray(new Integer[0]);
    }

    public static boolean printIndexes(Integer[] arr) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr[i]) {
                found = true;
                System.out.print(i + " ");
            }
        }
        if (found) {
            System.out.println();
        }
        return found;
    }

    public static void printIndexesOrMessage(Integer[] arr) {
        if (!printIndexes(arr)) {
            System.out.println("No values equal to their indexes");
        }
    }

    public static void main(String[] args) throws Exception {
        Integer[] arr = new Integer[10];
        System.out.print("array:\n");
        for (int i = 0; i < 10; i++) {
            arr[i] = new Random().nextInt(15);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("print max and remove: \n");
        printMaxAndRemove(arr);
        System.out.print("print indexes: \n");
        printIndexes(arr);
        System.out.print("print indexes or message: \n");
        printIndexesOrMessage(arr);
        System.out.print("print max, remove and throw: \n");
        printMaxRemoveAndThrow(arr);
    }
}
