package homework1.task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Add numericalAdd = new NumericalAdd();
        Add stringAdd = new StringAdd();
        System.out.println("numerical add 2 3 = " + numericalAdd.add(2, 3));
        System.out.println("string add \"2\" \"3\" = " + stringAdd.add("2", "3"));

        Print printProduct = new PrintProduct();
        Print printConcat = new PrintConcat();
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        System.out.print("print product 2 3 4 = ");
        printProduct.print(arr);
        System.out.print("print concat 2 3 4 = ");
        printConcat.print(arr);
    }
}
