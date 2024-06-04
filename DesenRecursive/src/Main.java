import java.util.Scanner;

public class Main {
    //Recursive method pattern
    public static void pattern(int number) {
        if (number <= 0) {
            System.out.print(number + " ");
        } else {
            System.out.print(number + " ");
            pattern(number - 5);

            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //User input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        pattern(number);

    }
}