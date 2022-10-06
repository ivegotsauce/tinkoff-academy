package homework1.task7;

public class PrintProduct extends Print{

    @Override
    public void print(int[] arr) {
        long product = 1;
        for (int i : arr) {
            product *= i;
        }
        System.out.println(product);
    }
}
