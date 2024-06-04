import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int i = 0, sum = 0;

        while(num != 0) {
            sum = (num % 10) + sum;
            num /= 10;
            i++;
        }
        System.out.println("Sum: " + sum);
    }
}