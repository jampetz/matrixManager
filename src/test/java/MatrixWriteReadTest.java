import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MatrixWriteReadTest {
    Matrix matrixOne = new Matrix();
    MatrixWriteRead matrixWriteRead = new MatrixWriteRead();

    @Before
    public void initMatrix() {
        List<List<Integer>> matrixBody = new ArrayList();
        int number = 1;
        for (int i = 0; i < 2; i++) {
            matrixBody.add(new ArrayList());
            for (int j = 0; j < 2; j++) {
                matrixBody.get(i).add(number);
                number++;
            }
        }
        matrixOne.setMatrixBody(matrixBody);
        matrixOne.setRows(2);
        matrixOne.setColumns(2);
        matrixOne.setAuthor("MatrixWriteRead Test");
    }

    @Test
    public void writeMatrixToFile() {
        String absolutePath = new File("").getAbsolutePath();
        matrixWriteRead.writeMatrixToFile(absolutePath + "/WriteSampleTest.txt", matrixOne);
        Matrix matrixTwo = matrixWriteRead.readMatrixFromFile(absolutePath + "/WriteSampleTest.txt");
        assertEquals(matrixOne, matrixTwo);
    }
}