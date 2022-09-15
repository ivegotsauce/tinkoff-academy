package homework1.task14;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TenQueue queue = new TenQueue();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(random.nextInt(5) + 1);
        }
        for (int i = 0; i < 10; i++) {
            queue.dequeue();
        }
    }
}
