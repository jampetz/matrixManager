import java.io.File;

public class Main {
    public static void main(String[] args) {
        MatrixManager matrixManager = new MatrixManager();
        MatrixWriteRead matrixWriteRead = new MatrixWriteRead();

        System.out.println("First matrix:");
        Matrix matrixOne = matrixWriteRead.readMatrixFromFile("ReadSample.txt");
        matrixManager.printArray(matrixOne);
        System.out.println("Min/max: " + matrixManager.findMin(matrixOne) + " / " + matrixManager.findMax(matrixOne));
        System.out.println("Sum: " + matrixManager.findSum(matrixOne));
        System.out.println("Author: " + matrixOne.getAuthor());
        System.out.println();

        System.out.println("Second matrix:");
        Matrix matrixTwo = matrixManager.createArray(2, 2, "Jason Builder");
        matrixManager.printArray(matrixTwo);
        System.out.println("Min/max: " + matrixManager.findMin(matrixTwo) + " / " + matrixManager.findMax(matrixTwo));
        System.out.println("Sum: " + matrixManager.findSum(matrixTwo));
        System.out.println("Author: " + matrixTwo.getAuthor());

        File fileOrig = new File("ReadSample.txt");
        File fileAbsolute = fileOrig.getAbsoluteFile();
        matrixWriteRead.writeMatrixToFile(fileAbsolute.getParent() + "/WriteSample.txt", matrixTwo);
    }
}