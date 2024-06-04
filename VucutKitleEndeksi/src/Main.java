import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your height (in meters): ");
        double height = sc.nextDouble();

        System.out.print("Please enter your weight: ");
        double weight = sc.nextDouble();

        double body_mass_index = weight / (height * height);
        System.out.print("Body mass index: " + body_mass_index);
    }
}