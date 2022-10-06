package homework1.task13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(2);
        Random random = new Random();
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.size(); j++) {
                matrix.getData()[i][j] = random.nextInt(5);
            }
        }
        matrix.print();
        System.out.println();
        long det = matrix.determinant();
        System.out.println("= " + det);
    }


}
