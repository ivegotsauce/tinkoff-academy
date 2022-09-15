package homework1.task8;

import homework1.task10.ArrayModificationException;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void printMaxAndRemove(int[] arr) {
        try {
            printMaxRemoveAndThrow(arr);
        } catch (ArrayModificationException e)  {
            arr[0] = 16;
        }
    }

    public static void printMaxRemoveAndThrow(int[] arr) throws ArrayModificationException {
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for (int i : arr) {
            max = Math.max(i, max);
        }
        for (int i : arr) {
            if (i == max) {
                cnt++;
            }
        }
        int[] newArr = new int[arr.length - cnt];
        int k = 0;
        for (int i : arr) {
            if (i != max) {
                newArr[k] = i;
                k++;
            }
        }
        arr = newArr;
        System.out.println(max);
        throw new ArrayModificationException();
    }

    public static boolean printIndexes(int[] arr) {
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

    public static void printIndexesOrMessage(int[] arr) {
        if (!printIndexes(arr)) {
            System.out.println("No values equal to their indexes");
        }
    }

    public static void main(String[] args) throws Exception {
        int[] arr = new int[10];
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
