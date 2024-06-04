import java.util.Scanner;

public class Main {
    static boolean primeNumber(int number, int i) {

        //If number is prime or not
        if (number <= 1) {
            return false;
        } else if (number == 2) {
            return true;
        } else if (number % i == 0) {
            return false;
        } else if (i * i > number) {
            return true;
        }
        return primeNumber(number, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //User input
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        //Printing
        boolean result = primeNumber(number, 2);

        if(primeNumber(number, 2)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}