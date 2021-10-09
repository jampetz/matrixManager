import java.io.File;

public class Main {
    public static void main(String[] args) {
        MatrixManager matrixManager = new MatrixManager();
        MatrixWriteRead matrixWriteRead = new MatrixWriteRead();
        String absolutePath = new File("").getAbsolutePath();
        Matrix matrixOne = matrixManager.createArray(2, 2, "Jason Builder");
        matrixManager.printArray(matrixOne);
        matrixManager.printArrayInfo(matrixOne);
        matrixWriteRead.writeMatrixToFile(absolutePath + "/WriteSample.txt", matrixOne);
        Matrix matrixTwo = matrixWriteRead.readMatrixFromFile(absolutePath + "/WriteSample.txt"); //Loading up the exact same copy of the first matrix
        matrixManager.printArray(matrixTwo);
        matrixManager.printArrayInfo(matrixTwo);
    }
}