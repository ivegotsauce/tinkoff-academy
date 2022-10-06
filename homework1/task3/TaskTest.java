package homework1.task3;

import org.junit.Test;

import java.util.concurrent.Phaser;

import static org.junit.Assert.*;


public class TaskTest {

    @Test
    public void singletonTest() {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        assertEquals(singleton1, singleton2);
        assertEquals(singleton1.hashCode(), singleton2.hashCode());
    }

    @Test
    public void threadSafeSingletonTest() {
        Phaser phaser = new Phaser(1);
        for (int i = 0; i < 5; i++) {
            phaser.register();
            Thread thread = new Thread(() -> {
                Singleton.getSingleton().action();
                phaser.arriveAndDeregister();
            });
            thread.start();
        }
        phaser.arriveAndAwaitAdvance();
    }
}
