package homework1.task1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        User u1 = new User(1, "Alexander", "Sharipov");
        User u2 = new User(2, "Alexander", "Sharipov");
        Message m1 = new Message(1, "Hello!");
        Message m2 = new Message(4, "Hi!");
        HashMap<Object, Integer> map = new HashMap<>();
        map.put(u1, 1);
        map.put(u2, 2);
        map.put(m1, 3);
        map.put(m2, 4);
        Hashtable<Object, Integer> table = new Hashtable<>();
        for (Map.Entry<Object, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
        System.out.println();
        table.put(u1, 1);
        table.put(u2, 2);
        table.put(m1, 3);
        table.put(m2, 4);
        for (Map.Entry<Object, Integer> entry : table.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
        System.out.println();
    }
}
