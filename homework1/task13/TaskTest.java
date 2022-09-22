package homework1.task13;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskTest {

    @Test
    public void test2X2() {
        Matrix matrix = new Matrix(2);
        matrix.getData()[0][0] = 2;
        matrix.getData()[0][1] = 4;
        matrix.getData()[1][0] = 3;
        matrix.getData()[1][1] = 8;
        assertEquals(4, matrix.determinant());
    }

    @Test
    public void test3X3() {
        Matrix matrix = new Matrix(3);
        matrix.getData()[0][0] = 1;
        matrix.getData()[0][1] = 2;
        matrix.getData()[0][2] = 3;
        matrix.getData()[1][0] = 4;
        matrix.getData()[1][1] = 5;
        matrix.getData()[1][2] = 6;
        matrix.getData()[2][0] = 7;
        matrix.getData()[2][1] = 8;
        matrix.getData()[2][2] = 9;
        assertEquals(0, matrix.determinant());
    }

}
