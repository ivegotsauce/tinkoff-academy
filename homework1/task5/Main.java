package homework1.task5;

import java.util.Arrays;

public class Main {

    public static int getSum(int... args) {
        int s =  Arrays.stream(args).sum();
        for (int i = 0; i <  args.length - 1; i++) {
            System.out.print(args[i] + " + ");
        }
        System.out.println(args[args.length - 1] + " = " + s);
        return s;
    }

    public static int sum(int a, int b) {
        return getSum(a, b);
    }

    public static int sum(int a, int b, int c) {
        return getSum(a, b, c);
    }

    public static int sum(int a, int b, int c, int d) {
        return getSum(a, b, c, d);
    }

    public static int sum(int a, int b, int c, int d, int e) {
        return getSum(a, b, c, d, e);
    }

    public static <T extends Comparable<T>> int compare (T a, T b) {
        return a.compareTo(b);
    }

    public static void main(String[] args) {
        sum(1, 2);
        sum(1, 2, 3);
        sum(1, 2, 3 ,4);
        sum(1, 2, 3, 4 ,5);
        System.out.println("compare(4, 4) = " + compare(4, 4));
        System.out.println("compare(\"abc\", \"cde\") = " +  compare("abc", "cde"));
    }
}
