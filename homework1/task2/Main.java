package homework1.task2;

public class Main {
    public static void main(String[] args) {
        Thread john = new Thread(() -> System.out.println("Hi, I am John"));
        Thread paul = new Thread(() -> System.out.println("Hi, I am Paul"));
        Thread george = new Thread(() -> System.out.println("Hi, I am George"));
        Thread ringo = new Thread(() -> System.out.println("Hi, I am Ringo"));
        john.start();
        paul.start();
        george.start();
        ringo.start();
    }
}
