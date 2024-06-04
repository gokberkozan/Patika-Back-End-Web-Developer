import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();

        System.out.print("Enter the measure of the central angle of the circle: ");
        int a = sc.nextInt();

        double pi = 3.14;

        double area = (pi * (r * r) * a) / 360;
        System.out.print("Area: " + area);
    }
}