import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1, number2;

        System.out.print("Enter the first number: ");
        number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        number2 = sc.nextInt();

        System.out.print("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\nChoose one of the following actions: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Addition: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Subtraction: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Multiplication: " + (number1 * number2));
                break;
            case 4:
                if(number2 != 0) {
                    System.out.println("Division: " + (number1 / number2));
                }else {
                    System.out.println("Number cannot be divided by 0");
                }
                break;
            default:
                System.out.println("You made the wrong choice. Numbers must be 1, 2, 3, or 4. Try again!");
        }
    }
}