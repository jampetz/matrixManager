import java.util.ArrayList;
import java.util.List;

public class MatrixManager {
    public Matrix createArray(int rows, int columns, String authorName) {
        List<List<Integer>> tempList = new ArrayList();
        int randomNumberRange = 10;
        for (int i = 0; i < rows; i++) {
            tempList.add(new ArrayList());
            for (int j = 0; j < columns; j++) {
                tempList.get(i).add((int) (Math.random() * randomNumberRange));
            }
        }
        Matrix matrixBean = new Matrix();
        matrixBean.setRows(rows);
        matrixBean.setColumns(columns);
        matrixBean.setMatrixBody(tempList);
        matrixBean.setAuthor(authorName);
        return matrixBean;
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
}
