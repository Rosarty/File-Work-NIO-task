
package app.service;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static app.utils.Constants.BASE_PATH;

public class FileReadService {
    public static String readFromFile(String fileName) {
        Path filePath = Paths.get(BASE_PATH + fileName + ".txt");
        try {
            return  new String(Files.readAllBytes(filePath));
        } catch (IOException e) {
            return "An error occurred while reading the file: " + e.getMessage();
        }
    }
}