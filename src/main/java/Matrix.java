import java.util.List;
import java.util.Objects;

public class Matrix {
    private int rows;
    private int columns;
    private List<List<Integer>> matrixBody;
    private String author;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return rows == matrix.rows &&
                columns == matrix.columns &&
                Objects.equals(matrixBody, matrix.matrixBody) &&
                Objects.equals(author, matrix.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rows, columns, matrixBody, author);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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