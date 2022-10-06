package homework1.task13;

public class Matrix {
    private final Integer[][] data;
    private final int size;

    public int size() {
        return size;
    }

    public Matrix(int size) {
        data = new Integer[size][size];
        this.size = size;
    }

    public Integer[][] getData() {
        return data;
    }

    public Matrix minor(int i, int j) {
        Matrix minor = new Matrix(size - 1);
        int k = 0;
        int m = 0;
        for (int p = 0; p < size; p++) {
            if (p == i) {
                continue;
            }
            for (int q = 0; q < size; q++) {
                if (q == j) {
                    continue;
                }
                minor.getData()[k][m] = data[p][q];
                m = (m + 1) % (size - 1);
            }
            k++;
        }
        return minor;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0) {
                    System.out.print('|');;
                }
                System.out.print(data[i][j] + (j == size - 1 ? "|" : " "));
            }
            System.out.println();
        }
    }

    public long determinant() {
        if (size == 1) {
            System.out.println(data[0][0]);
            return data[0][0];
        }
        long det = 0;
        for (int i = 0; i < size; i++) {
            long val = (long) data[0][i] * (i % 2 == 0 ? 1 : (-1));
            System.out.print(val + " * ");
            if (size > 2) {
                System.out.print("(");
            }
            System.out.println();
            det += val * minor(0, i).determinant();
            if (size > 2) {
                System.out.print(")");
                if (i != size - 1) {
                    System.out.println(" +");
                } else {
                    System.out.println();
                }
            }
            else if (i != size - 1) {
                System.out.println("+");
            }
        }
        return det;
    }

}
