package homework1.task14;

public class TenQueue {
    private final int[] data = new int[10];
    private int head, tail;
    private long product = 1;
    private int zeros = 0;
    final int n = 10;
    private int size = 0;

    public TenQueue() {
        head = 0;
        tail = 0;
    }

    synchronized boolean empty() {
        return size() == 0;
    }

    public synchronized void enqueue(int val) {
        if (size() < n) {
            data[tail] = val;
            tail = (tail + 1) % n;
            if (val != 0) {
                product *= val;
            } else {
                zeros++;
            }
            size++;
        }
        System.out.println("Added " + val + " product: " + getProduct());

    }

    public synchronized Integer dequeue() {
        if (empty()) {
            return null;
        }
        int val = data[head];
        head = (head + 1) % n;
        if (val != 0) {
            product /= val;
        } else {
            zeros--;
        }
        size--;
        System.out.println("Removed " + val + " product: " + getProduct());

        return val;
    }

    public long getProduct() {
        return zeros == 0 ? product : 0;
    }

    public int size() {
        return size;
    }
}
