import java.util.Arrays;

public class Main {

    // Find method
    static boolean isFind(int[] arr, int value) {
        for(int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // Declare variable
        int [] list = {32, 7, 32, 32, 2, 0, 0, 21, 1, 33, 9, 2};
        int [] duplicate = new int[list.length];
        int startIndex = 0;

        // Main array loop
        for (int i = 0; i < list.length; i ++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && list[i] % 2 == 0) {
                    if (!isFind(duplicate, list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        // Remove zero and print
        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}