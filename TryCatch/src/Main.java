import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare variables
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        // Call index method
        indexOfArr(arr,index);
    }

    static public void indexOfArr(int[] arr, int index){
        try{
            // Code block when an error is expected to happen
            System.out.println(arr[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            // Throw error message
            System.out.println(e.getMessage());
        }
    }
}