package homework1.task3;

public class Singleton {
    private static Singleton singleton;

    @SuppressWarnings("all")
    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
            System.out.println("Singleton created");
        }

        return singleton;
    }

    private Singleton() {

    }

    public void action() {
        System.out.println("Singleton was called");
    }

}
