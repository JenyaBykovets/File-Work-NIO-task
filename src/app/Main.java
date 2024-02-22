package app;
import app.service.FileReadService;
import app.service.FileWriteService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Create and save file:");
        System.out.println("2. Read file:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            createAndSaveFile(scanner);
        } else if (choice == 2) {
            readFile(scanner);
        } else {
            System.out.println("Error");
        }

        scanner.close();
    }

    public static void createAndSaveFile(Scanner scanner) {
        System.out.println("Enter your name:");
        String fileName = scanner.next();

        System.out.println("Enter your text:");
        String content = scanner.next();

        FileWriteService.writeToFile(fileName, content);
        getOutput(fileName);
    }

    public static void readFile(Scanner scanner) {
        System.out.println("Enter name file:");
        String fileName = scanner.next();

        getOutput(fileName);
    }

    public static void getOutput(String fileName) {
        System.out.println("\nResult : " + fileName + ".txt:");
        FileReadService.readFromFile(fileName);
    }
}








