package homework1.task4.thread.safe;

import java.util.Random;

public class Main {

    public static void findMax(ConcurrentLinkedList list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        System.out.println("Max element: " + max);
    }

    public static void removeMin(ConcurrentLinkedList list) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
                minIndex = i;
            }
        }
        list.remove(minIndex);
    }

    public static void addRandomElement(ConcurrentLinkedList list, Random random) {
        list.insert(list.size() / 2, random.nextInt(15));
        printList(list);
        list.sort();
        printList(list);
    }

    public static void printList(ConcurrentLinkedList list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(" ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Random random = new Random();
        ConcurrentLinkedList list2 = new ConcurrentLinkedList();
        for (int i = 0; i < 10; i++) {
            list2.add(random.nextInt(15));
        }
        Thread findMaxThread = new Thread(() -> findMax(list2));
        Thread removeMinThread = new Thread(() -> removeMin(list2));
        Thread addRandomThread = new Thread(() -> addRandomElement(list2, random));
        findMaxThread.start();
        removeMinThread.start();
        addRandomThread.start();
    }
}

