import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number, power, total = 1;

        System.out.print("Enter number: ");
        number = sc.nextInt();
        System.out.print("Enter power: ");
        power = sc.nextInt();

        for(int i = 1; i <= power; i++) {
            total *= number;
        }
        System.out.print(total);
    }
}