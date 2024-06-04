import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        System.out.println("Array: " + Arrays.toString(arr));

        // Sort the array
        Arrays.sort(arr);

        int current = arr[0];
        int count = 1;

        System.out.println("Repetition numbers");

        // Sorted array iteration
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == current) {
                count++;
            } else {
                System.out.println("Number " + current + " repeated " + count + " times.");
                current = arr[i];
                count = 1;
            }
        }
        // Printing
        System.out.println("Number " + current + " repeated " + count + " times.");
    }
}