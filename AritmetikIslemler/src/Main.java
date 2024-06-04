import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1.Number:");
        int a = scanner.nextInt();
        System.out.println("Enter 2.Number:");
        int b = scanner.nextInt();
        System.out.println("Enter 3.Number:");
        int c = scanner.nextInt();

        int islem = a + b * c - b;
        System.out.println(islem);
    }
}