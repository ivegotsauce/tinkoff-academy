package homework1.task13;

import java.util.ArrayList;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        double[][] matrix = new double[10][10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = random.nextInt(5);
            }
        }
        print(matrix);

        for (int i = 0; i < 10; i++) {
            if (matrix[i][i] == 0) {
                for (int j = i; j < 10; j++) {
                    if (matrix[j][i] != 0) {
                        for (int p = i; p < 10; p++) {
                            double x = matrix[i][p];
                            matrix[i][p] = matrix[j][p];
                            matrix[j][p] = x;
                        }
                        break;
                    }
                }
                if (matrix[i][i] == 0) {
                    System.out.println(0);
                    return;
                }
            }
            for (int j = i + 1; j < 10; j++) {
                double c = matrix[j][i];
                for (int k = i; k < 10; k++) {
                    matrix[j][k] -= matrix[i][k] * c / matrix[i][i];
                }
            }
            print(matrix);
        }

        double det = 1;
        for (int i = 0; i < 10; i++) {
            det *= matrix[i][i];
        }
        System.out.println(det);



    }

    public static void print(double[][] matrix) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
