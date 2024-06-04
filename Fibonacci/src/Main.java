import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n number: ");
        int n = sc.nextInt();

        int n1 = 0, n2 = 1, n3 = 1;

        for(int i = 0; i <= n; i++) {
            System.out.print(n1 + " ");

            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
    }
}