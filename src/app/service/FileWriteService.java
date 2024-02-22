package app.service;
import app.utils.Constants;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteService {
    public static void writeToFile(String fileName, String content) {
        String filePath = Constants.BASE_PATH + fileName + ".txt";

        try {
            Path path = Paths.get(filePath);
            Files.write(path, content.getBytes());
            System.out.println("File successfully created");
        } catch (IOException e) {
            System.out.println("Error creating file");
            e.printStackTrace();
        }
    }
}





