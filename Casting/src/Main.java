import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //User Input
        System.out.print("Enter integer: ");
        int integer = sc.nextInt();
        System.out.print("Enter decimal: ");
        double decimal = sc.nextDouble();

        //Casting
        int newInt = (int) decimal;
        double newDouble = (double) integer;

        //Printing
        System.out.println("New decimal " + newDouble);
        System.out.println("New integer: " + newInt);
    }
}