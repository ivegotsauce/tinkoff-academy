package homework1.task14;

public class TenQueue {
    int[] data = new int[10];
    int head, tail;
    int product = 1;
    final int n = 10;
    int size = 0;

    public TenQueue() {
        head = 0;
        tail = 0;
    }

    boolean empty() {
        return size() == 0;
    }

    public void enqueue(int val) {
        if (size() < n) {
            data[tail] = val;
            tail = (tail + 1) % n;
            product *= val;
            size++;
        }
        System.out.println(product);
    }

    public Integer dequeue() {
        if (empty()) {
            return null;
        }
        int val = data[head];
        head = (head + 1) % n;
        product /= val;
        System.out.println(product);
        size--;
        return val;
    }

    int size() {
        return size;
    }
}
