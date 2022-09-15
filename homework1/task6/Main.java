package homework1.task6;

import java.util.Random;

public class Main {

    static int inc(int a) {
        ++a;
        return a;
    }

    static char inc(char a) {
        if (a >= 48 && a < 57 || a >= 65 && a < 90 || a >= 97 && a < 122) {
            return (char) (a + 1);
        } else if (a == '9') {
            return 'A';
        } else if (a == 'Z') {
            return 'a';
        } else {
            return a;
        }
    }

    static boolean inc(boolean a) {
        return true;
    }

    static float inc(float inc) {
        return inc + Float.MIN_VALUE;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(15);
        int b = random.nextInt(15);
        char c = 'A';
        boolean bl = random.nextBoolean();
        float f = random.nextFloat();
        System.out.println("inc(" + a + ") = " + inc(a));
        System.out.println("inc(" + c + ") = " + inc(c));
        System.out.println("inc(" + bl + ") = " + inc(bl));
        System.out.println("inc(" + f + ") = " + inc(f));
        System.out.println("sum(" + a + ", " + b + ") = " + sum(a, b));
    }
}
