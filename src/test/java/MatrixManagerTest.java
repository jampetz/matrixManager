import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MatrixManagerTest {
    Matrix matrix = new Matrix();
    MatrixManager matrixManager = new MatrixManager();

    @Before
    public void initMatrix() {
        List<List<Integer>> matrixBody = new ArrayList<>();
        int number = 1;
        for (int i = 0; i < 2; i++) {
            matrixBody.add(new ArrayList<Integer>());
            for (int j = 0; j < 2; j++) {
                matrixBody.get(i).add(number);
                number++;
            }
        }
        matrix.setMatrixBody(matrixBody);
        matrix.setRows(2);
        matrix.setColumns(2);
    }

    @Test
    public void findMin() {
        assertEquals(1, matrixManager.findMin(matrix));
    }

    @Test
    public void findMax() {
        assertEquals(4, matrixManager.findMax(matrix));
    }

    @Test
    public void findSum() {
        assertEquals(10, matrixManager.findSum(matrix));
    }
}