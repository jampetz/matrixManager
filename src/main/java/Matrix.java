import java.util.List;
import java.util.Objects;

public class Matrix {
    private int rows;
    private int columns;
    private List<List<Integer>> matrixBody;
    private String authorName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return rows == matrix.rows &&
                columns == matrix.columns &&
                Objects.equals(matrixBody, matrix.matrixBody) &&
                Objects.equals(authorName, matrix.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rows, columns, matrixBody, authorName);
    }

    public String getAuthor() {
        return authorName;
    }

    public void setAuthor(String authorName) {
        this.authorName = authorName;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public List<List<Integer>> getMatrixBody() {
        return matrixBody;
    }

    public void setMatrixBody(List<List<Integer>> matrixBody) {
        this.matrixBody = matrixBody;
    }
}