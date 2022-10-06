package homework1.task4;


import java.util.Random;

public class Main {

    public static void findMax(LinkedList list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        System.out.println("Max element: " + max);
    }

    public static void removeMin(LinkedList list) {
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

    public static void addRandomElement(LinkedList list, Random random) {
        list.insert(list.size() / 2, random.nextInt(15));
        printList(list);
        list.sort();
        printList(list);
    }

    public static void printList(LinkedList list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(" ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        System.err.println("-".repeat(15) + "Classic" + "-".repeat(15));
        System.out.println("-".repeat(15) + "Classic" + "-".repeat(15));
        LinkedList list = new LinkedList();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(15));
        }
        findMax(list);
        removeMin(list);
        addRandomElement(list, random);
    }
}
