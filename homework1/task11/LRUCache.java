package homework1.task11;

import java.util.Random;
import java.util.WeakHashMap;


public class LRUCache {

    private final Random random = new Random();

    private enum Data {
        John,
        Paul,
        George,
        Ringo
    }

    private final WeakHashMap<Integer, Node> cache;
    private Node LRU;
    private Node MRU;
    private int size;

    public LRUCache() {
        cache = new WeakHashMap<Integer, Node>();
        this.size = 0;
        LRU = new Node(null, null, 0, null);
        MRU = LRU;
    }

    public String get(int key) {
        Node tmp = cache.get(key);
        if (tmp == null) {
            String value =
                    "{\n" +
                            "\"data\":\"" + Data.values()[random.nextInt(Data.values().length)].toString() + "\"\n"
                            + "}";
            Node node = new Node(MRU, null, key, value);
            MRU.next = node;
            cache.put(key, node);
            MRU = node;
            size++;
            if (size > 5) {

                cache.remove(LRU.key);
                LRU = LRU.next;
                LRU.prev = null;
                size = 5;
            } else if (size == 1) {
                LRU = node;
            }

            printLog(LRU);
            return value;
        } else if (tmp.key == MRU.key) {
            return MRU.value;
        }
        Node next = tmp.next;
        Node prev = tmp.prev;
        if (tmp.key != LRU.key) {
            prev.next = next;
            next.prev = prev;
        } else {
            next.prev = null;
            LRU = next;
        }
        MRU.next = tmp;
        tmp.prev = MRU;
        MRU = tmp;
        tmp.next = null;
        printLog(LRU);
        return tmp.value;
    }

    private static class Node {
        Node prev;
        Node next;
        int key;
        String value;

        public Node(Node prev, Node next, int key, String value) {
            this.prev = prev;
            this.next = next;
            this.key = key;
            this.value = value;
        }
    }

    private void printLog(Node LRU) {
        for (Node n = LRU; ; n = n.next) {
            System.out.print(n.key + " ");
            if (n.next == null) {
                break;
            }
        }
        System.out.println();
    }
}