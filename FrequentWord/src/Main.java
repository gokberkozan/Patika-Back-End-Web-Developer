import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        String frequentWord = findFrequentWord(text);

        System.out.println("Most frequent word: " + frequentWord);
    }

    public static String findFrequentWord(String text) {
        // Split the text into words
        String[] words = text.split("\\s+");

        // Make a hash map and store the words in it.
        Map<String, Integer> wordCounts = new HashMap<>();

        // Count the words as you iterate through them and add them to the hash map.
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        // Find the most frequent word
        String mostFrequentWord = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostFrequentWord;
    }
}