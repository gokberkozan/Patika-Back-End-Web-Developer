import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y, z;
        System.out.print("Enter the first side of triangle: ");
        x = sc.nextInt();
        System.out.print("Enter the second side of triangle: ");
        y = sc.nextInt();
        System.out.print("Enter the third side of triangle: ");
        z = sc.nextInt();

        int u = (x + y + z) / 2;
        double area = Math.sqrt(u * (u-x) * (u-y) * (u-z));

        System.out.println("Area of the triangle: " + area);
    }
}