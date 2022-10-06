package homework1.task11;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        LRUCache cache = new LRUCache();
        try {
            for (int i = 0; i < 10; i++) {
                int key = random.nextInt(10) + 1;
                cache.get(key);
                TimeUnit.SECONDS.sleep(10);
            }
        } catch (InterruptedException e) {
            //
        }
    }
}
