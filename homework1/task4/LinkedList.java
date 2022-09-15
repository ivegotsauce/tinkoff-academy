package homework1.task4;

public class LinkedList {
    private Node tail;
    private int size = 0;

    public LinkedList() {

    }

    public void add(int value) {
        if (tail == null) {
            tail = new Node(null, value);
        } else {
            Node node = new Node(null, value);
            node.setPrev(tail);
            tail = node;
        }
        System.err.println("Element " + value + " was added to the end of the list");
        size++;
    }

    public Integer get(int index) {
        //System.err.println("Access to the " + index + "th element was given");
        return getNode(index).getData();
    }

    public void set(int index, int value) {
        getNode(index).setData(value);
    }

    public void insert(int index, int value) {
        Node node = getNode(index);
        node.setPrev(new Node(node.getPrev(), value));
        size++;
        System.err.println("Element " + value + " was inserted to the " + index + "th place");
    }

    public void remove(int index) {
        if (size() == 1) {
            tail = null;
        } else if (index == size() - 1) {
            tail = tail.getPrev();
        } else {
            Node node = getNode(index + 1);
            node.setPrev(node.getPrev().getPrev());
        }
        System.out.println(index + "th element removed");
        size--;
    }

    private Node getNode(int index) {
        Node node = tail;
        for (int i = size() - index - 1; i > 0; i--) {
            node = node.getPrev();
        }
        return node;
    }

    public int size() {
        return size;
    }

    public void sort() {
        for (int j = 1; j < size(); j++) {
            for (int i = 0; i < size() - 1; i++) {
                if (get(i) > get(i + 1)) {
                    int x = get(i);
                    set(i, get(i + 1));
                    set(i + 1, x);
                }
            }
        }
    }

    private static class Node {
        private Node prev;
        private int data;

        public Node(Node prev, int data) {
            this.prev = prev;
            this.data = data;
        }

        public Node getPrev() {
            return prev;
        }

        public int getData() {
            return data;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public void setData(int data) {
            this.data = data;
        }
    }


}
