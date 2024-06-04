import java.util.Scanner;

public class Main {
    public static int exponential(int base, int exponent) {
        //Base calculation
        if(exponent == 0) {
            return 1;
        } else {
            int result = base * exponential(base, exponent - 1);
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //User input
        System.out.print("Enter base number: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent number: ");
        int exponent = sc.nextInt();

        //Calculate and print
        System.out.println("Result: " + exponential(base, exponent));
    }
}