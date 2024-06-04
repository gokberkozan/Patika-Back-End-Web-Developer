import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        int i = 1, ebob = 1;

        while(i <= number1) {
            if(number1 % i == 0 && number2 % i == 0)
                ebob = i;
                i++;
        }
        int ekok = (number1 * number2) / ebob;
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}