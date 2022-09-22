package homework1.task10;

import java.util.*;

public class Main {

    public static Integer[] printMaxAndRemove(Integer[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(i, max);
        }
        int cnt = 0;
        for (int i : arr) {
            if (i == max) {
                cnt++;
            }
        }
        System.out.println(max);
        try {
            throw new ArrayModificationException();
        } catch (ArrayModificationException e) {
            int k = 0;
            Integer[] newArr = new Integer[arr.length - cnt];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != max) {
                    newArr[k] = arr[i];
                    k++;
                }
            }
            return newArr;
        }
    }

    public static void printIndexes(Integer[] arr) {
        try {
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i == arr[i]) {
                    System.out.print(i + " ");
                    cnt++;
                }
            }
            if (cnt == 0) {
                throw new ArrayModificationException();
            }
        } catch (ArrayModificationException e) {
            System.out.print(e.getMessage());
        } finally {
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.print("array:\n");
        Integer[] arr = new Integer[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = new Random().nextInt(15);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        System.out.print("print indexes: \n");
        printIndexes(arr);
        System.out.print("print max and remove: \n");
        printMaxAndRemove(arr);
    }
}
