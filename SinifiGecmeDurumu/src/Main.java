import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int math, physics, turkish, history, music, average;

        System.out.print("Enter your math grade: ");
        math = sc.nextInt();

        System.out.print("Enter your physics grade: ");
        physics = sc.nextInt();

        System.out.print("Enter your turkish grade: ");
        turkish = sc.nextInt();

        System.out.print("Enter your history grade: ");
        history = sc.nextInt();

        System.out.print("Enter your music grade: ");
        music = sc.nextInt();

        average = (math + physics + turkish + history + music) / 5;

        if (average >= 55 && average <= 100) {
            System.out.println("You passed the Class. Congrulations!");
        }
        else if (average < 55 && average >= 00) {
            System.out.println("You failed!");
        }
        else {
            System.out.println("Your average must be between 0 and 100");
        }

    }
}