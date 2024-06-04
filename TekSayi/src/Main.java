import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number, total = 0;

        do {
            System.out.print("Enter number: ");
            number = sc.nextInt();

            if(number % 4 == 0) {
                total += number;
            }
        }
        while(number % 2 == 0);
        System.out.println("Total: " + total);
    }
}