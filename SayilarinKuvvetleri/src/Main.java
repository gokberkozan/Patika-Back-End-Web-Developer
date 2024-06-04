import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Enter number: ");
        number = sc.nextInt();

        for(int i = 1; i <= number; i *= 4)  {
            System.out.print(" " + i);
        }
        System.out.println();

        for(int i = 1; i <= number; i *= 5)  {
            System.out.print(" " + i);
        }
    }
}