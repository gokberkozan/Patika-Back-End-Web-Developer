import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N number: ");
        int n = sc.nextInt();

        double result = 0;

        for(double i = 1; i <= n; i++) {
            result += 1 / i;
        }
        System.out.println("Result: " + result);
    }
}