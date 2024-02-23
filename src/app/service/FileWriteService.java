package app.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static app.utils.Constants.BASE_PATH;

public class FileWriteService {


    public String writeToFile(String fileName, String content) {
        Path filePath = Paths.get(BASE_PATH + fileName + ".txt");
        try {
            Files.write(filePath, content.getBytes());
            return "File " + fileName + ".txt created and written successfully.";
        } catch (IOException e) {
            return "An error occurred while writing to the file: " + e.getMessage();
        }
    }
}