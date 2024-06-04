import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Specify the name of the file
        String fileName = "Notepad.txt";

        // Receive text input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        // Write the text to the file
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(text);
            printWriter.close();
            System.out.println("The text was saved to file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Read the last saved text from the file and print it to the screen
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String readText = bufferedReader.readLine();
            if (readText != null) {
                System.out.println("Last recorded text: " + readText);
            } else {
                System.out.println("The file is empty.");
            }
        } catch (IOException e) {
            System.err.println("File read error: " + e.getMessage());
        }
    }
}