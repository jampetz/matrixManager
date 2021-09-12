import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.Writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MatrixWriteRead {
    public Matrix readMatrixFromFile(String path) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF8"))) {
            Gson gson = new GsonBuilder().create();
            Matrix matrix = gson.fromJson(reader, Matrix.class);
            return matrix;
        } catch (Exception e) {
            System.out.println("File was not found.");
            return null;
        }
    }

    public void writeMatrixToFile(String path, Matrix matrix) {
        try (Writer writer = new FileWriter(path)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(matrix, writer);
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
    }
}
