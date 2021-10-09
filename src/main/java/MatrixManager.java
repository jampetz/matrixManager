import java.util.ArrayList;
import java.util.List;

public class MatrixManager {
    public Matrix createArray(int rows, int columns, String authorName) {
        List<List<Integer>> tempList = new ArrayList<>();
        int randomNumberRange = 10;
        for (int i = 0; i < rows; i++) {
            tempList.add(new ArrayList<Integer>());
            for (int j = 0; j < columns; j++) {
                tempList.get(i).add((int) (Math.random() * randomNumberRange));
            }
        }
        Matrix matrix = new Matrix();
        matrix.setRows(rows);
        matrix.setColumns(columns);
        matrix.setMatrixBody(tempList);
        matrix.setAuthor(authorName);
        return matrix;
    }

    public void printArray(Matrix matrix) {
        List<List<Integer>> tempList = matrix.getMatrixBody();
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                System.out.print(tempList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public int findMin(Matrix matrix) {
        List<List<Integer>> tempList = matrix.getMatrixBody();
        int minElement = tempList.get(0).get(0);
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                if (tempList.get(i).get(j) < minElement) {
                    minElement = tempList.get(i).get(j);
                }
            }
        }
        return minElement;
    }

    public int findMax(Matrix matrix) {
        List<List<Integer>> tempList = matrix.getMatrixBody();
        int maxElement = tempList.get(0).get(0);
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                if (tempList.get(i).get(j) > maxElement) {
                    maxElement = tempList.get(i).get(j);
                }
            }
        }
        return maxElement;
    }

    public int findSum(Matrix matrix) {
        List<List<Integer>> tempList = matrix.getMatrixBody();
        int totalSum = 0;
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                totalSum += tempList.get(i).get(j);
            }
        }
        return totalSum;
    }

    public void printArrayInfo(Matrix matrix) {
        System.out.println("Min/max: " + findMin(matrix) + " / " + findMax(matrix));
        System.out.println("Sum: " + findSum(matrix));
        System.out.println("Author: " + matrix.getAuthor());
        System.out.println();
    }
}
