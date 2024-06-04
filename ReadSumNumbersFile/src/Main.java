import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Provide the path to the file.
            String filePath = "C:\\Users\\Gokberk\\Downloads\\file.txt";

            // Use BufferedReader to read the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Initialize variable
            int sum = 0;

            String line;
            // After reading each line in the file, add the digits to the total.
            while ((line = reader.readLine()) != null) {
                sum += Integer.parseInt(line);
            }

            // Printing
            System.out.println("Sum: " + sum);
        } catch (IOException e) {
            // Handle IOException
            System.err.println("File reading error: " + e.getMessage());
        }
    }
}