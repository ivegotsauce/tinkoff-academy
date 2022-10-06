package homework1.task2;

import java.util.List;

public class Philosophers {

    public record Philosopher(Object leftFork, Object rightFork,
                              String name) implements Runnable {


        @Override
        public void run() {
            try {
                while (true) {
                    perform("is thinking");
                    synchronized (leftFork) {
                        perform("picked up left fork");
                        synchronized (rightFork) {
                            perform("picked up right fork");
                            perform("is eating");
                            perform("put down right fork");
                        }
                        perform("put down left fork");
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        private void perform(String action) throws InterruptedException {
            System.out.println(name + " " + action);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) {
        final int n = 5;
        Object[] forks = new Object[n];
        Philosopher[] philosophers = new Philosopher[n];
        List<String> names = List.of("Aristotle", "Nietzsche", "Plato", "Socrates", "Confucius");
        for (int i = 0; i < n; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < n; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % n];
            String name = names.get(i);
            if (i != n - 1) {
                philosophers[i] = new Philosopher(leftFork, rightFork, name);
            } else {
                philosophers[i] = new Philosopher(rightFork, leftFork, name);
            }
            Thread tmp = new Thread(philosophers[i]);
            tmp.start();
        }
    }
}
