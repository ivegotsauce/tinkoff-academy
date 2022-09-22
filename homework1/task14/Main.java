package homework1.task14;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        TenQueue queue = new TenQueue();
        Random random = new Random();
        CountDownLatch latch = new CountDownLatch(15);
        for (int i = 0; i < 4; i++) {
            service.submit(() -> {
                while (!service.isShutdown()) {
                    int val = random.nextInt(15);
                    if (random.nextBoolean()) {
                        queue.enqueue(val);
                    } else {
                        queue.dequeue();
                    }
                    latch.countDown();
                }
            });
        }
        try {
            latch.await();
            service.shutdown();
        } catch (InterruptedException e) {
            //
        }
    }
}
