package app.service;
import app.utils.Constants;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadService {
    public static void readFromFile(String fileName) {
        String filePath = Constants.BASE_PATH + fileName + ".txt";

        try {
            Path path = Paths.get(filePath);
            byte[] data = Files.readAllBytes(path);
            System.out.println(new String(data));
        } catch (IOException e) {
            System.out.println("Error reading file");
            e.printStackTrace();
        }
    }
}







