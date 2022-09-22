package homework2.src;


import java.util.ArrayList;
import java.util.List;

public class Main {
    @SuppressWarnings("all")
    public static void main(String[] args) throws InterruptedException {
        List<Integer[]> list = new ArrayList<>();
        int i = 0;
        while (true) {
            System.out.println(i++);
            Integer[] array = new Integer[10000 * 10000];
            list.add(array);
            Thread.sleep(2000);
        }
    }
}
