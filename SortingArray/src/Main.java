import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". element: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int max = arr[i];
                    arr[i] = arr[j];
                    arr[j] = max;
                }
            }
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}