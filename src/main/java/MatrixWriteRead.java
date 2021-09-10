import java.io.InputStreamReader;
import java.io.Reader;
import java.io.FileWriter;
import java.io.Writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MatrixWriteRead {
    public Matrix readMatrixFromFile(String path) {
        try (Reader reader = new InputStreamReader(MatrixWriteRead.class.getResourceAsStream(path), "UTF-8")) {
            Gson gson = new GsonBuilder().create();
            Matrix matrix = gson.fromJson(reader, Matrix.class);
            return matrix;
        } catch (Exception e) {
            System.out.println("File was not found.");
            return null;
        }
    }

    public void writeMatrixToFile(String filename, Matrix matrix) {
        try (Writer writer = new FileWriter(filename)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(matrix, writer);
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
    }
}
