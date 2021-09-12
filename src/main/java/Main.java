import java.io.File;

public class Main {
    public static void main(String[] args) {
        MatrixManager matrixManager = new MatrixManager();
        MatrixWriteRead matrixWriteRead = new MatrixWriteRead();
        String absolutePath = new File("").getAbsolutePath();
        System.out.println("First matrix:");
        Matrix matrixOne = matrixManager.createArray(2, 2, "Jason Builder");
        matrixManager.printArray(matrixOne);
        System.out.println("Min/max: " + matrixManager.findMin(matrixOne) + " / " + matrixManager.findMax(matrixOne));
        System.out.println("Sum: " + matrixManager.findSum(matrixOne));
        System.out.println("Author: " + matrixOne.getAuthor());
        matrixWriteRead.writeMatrixToFile(absolutePath + "/WriteSample.txt", matrixOne);
        System.out.println();
        System.out.println("Second matrix:");
        Matrix matrixTwo = matrixWriteRead.readMatrixFromFile(absolutePath + "/WriteSample.txt");
        matrixManager.printArray(matrixTwo);
        System.out.println("Min/max: " + matrixManager.findMin(matrixTwo) + " / " + matrixManager.findMax(matrixTwo));
        System.out.println("Sum: " + matrixManager.findSum(matrixTwo));
        System.out.println("Author: " + matrixTwo.getAuthor());
    }
}