package app;


import app.service.FileReadService;
import app.service.FileWriteService;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriteService fileWriteService = new FileWriteService();

        System.out.println("""
                 Choose an action:");
                1. Create and write to a file");
                2. Read from a file
                """);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                createAndWriteToFile(scanner, fileWriteService);
                break;
            case 2:
                readFromFile(scanner);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static void createAndWriteToFile(Scanner scanner, FileWriteService fileWriteService) {
        System.out.println("Enter the file name (without extension):");
        String fileName = scanner.next();
        System.out.println("Enter the content to write to the file:");
        scanner.nextLine();
        String content = scanner.nextLine();
        String writeResult = fileWriteService.writeToFile(fileName, content);
        System.out.println(writeResult);
    }

    public static void readFromFile(Scanner scanner) {
        System.out.println("Enter the file name to read:");
        String fileToRead = scanner.next();
        String fileContent = FileReadService.readFromFile(fileToRead);
        System.out.println("File content:");
        System.out.println(fileContent);
    }
}