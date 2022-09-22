package homework1.task7;

public class PrintConcat extends Print{
    @Override
    public void print(int[] arr) {
        StringBuilder s = new StringBuilder();
        for (int i : arr) {
            s.append(i);
        }
        System.out.println(s.toString());
    }
}
