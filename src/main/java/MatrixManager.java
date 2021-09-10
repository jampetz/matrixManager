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

    public void printArray(Matrix matrixBean) {
        List<List<Integer>> tempList = matrixBean.getMatrixBody();
        for (int i = 0; i < matrixBean.getRows(); i++) {
            for (int j = 0; j < matrixBean.getColumns(); j++) {
                System.out.print(tempList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public int findMin(Matrix matrixBean) {
        List<List<Integer>> tempList = matrixBean.getMatrixBody();
        int minElement = tempList.get(0).get(0);
        for (int i = 0; i < matrixBean.getRows(); i++) {
            for (int j = 0; j < matrixBean.getColumns(); j++) {
                if (tempList.get(i).get(j) < minElement) {
                    minElement = tempList.get(i).get(j);
                }
            }
        }

        return minElement;
    }

    public int findMax(Matrix matrixBean) {
        List<List<Integer>> tempList = matrixBean.getMatrixBody();
        int maxElement = tempList.get(0).get(0);
        for (int i = 0; i < matrixBean.getRows(); i++) {
            for (int j = 0; j < matrixBean.getColumns(); j++) {
                if (tempList.get(i).get(j) > maxElement) {
                    maxElement = tempList.get(i).get(j);
                }
            }
        }
        return maxElement;
    }

    public int findSum(Matrix matrixBean) {
        List<List<Integer>> tempList = matrixBean.getMatrixBody();
        int totalSum = 0;
        for (int i = 0; i < matrixBean.getRows(); i++) {
            for (int j = 0; j < matrixBean.getColumns(); j++) {
                totalSum += tempList.get(i).get(j);
            }
        }
        return totalSum;
    }
}
