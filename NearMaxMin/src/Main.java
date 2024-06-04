import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Array: " + Arrays.toString(list));
        System.out.println("Entered number: " + num);

        int smallNear = min;
        int bigNear = max;

        for (int i : list) {
            if (i < num) {
                smallNear = (num - smallNear < num - i) ? smallNear : i;
            } else if (i > num) {
                bigNear = (bigNear - num < i - num) ? bigNear : i;
            }
        }

        System.out.println("Minimum: " + smallNear);
        System.out.println("Maximum: " + bigNear);
    }
}