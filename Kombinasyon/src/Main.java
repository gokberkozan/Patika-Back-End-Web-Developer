import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 1;

        System.out.print("Enter n number: ");
        int n = sc.nextInt();
        System.out.print("Enter r number: ");
        int r = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            total = total * i;
        }

        for (int i = 1; i <= r; i++) {
            total = total / i;
        }

        for (int i=1; i <= (n-r); i++) {
            total = total / i;
        }

        //C(n,r) = n! / (r! * (n-r)!)
        System.out.println("C(n,r): " + total);
    }
}