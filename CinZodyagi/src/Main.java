import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();

        if(birthYear % 12 == 0) {
            System.out.println("Monkey");
        } else if (birthYear % 12 == 1) {
            System.out.println("Turkey");
        } else if (birthYear % 12 == 2) {
            System.out.println("Dog");
        } else if (birthYear % 12 == 3) {
            System.out.println("Pig");
        } else if (birthYear % 12 == 4) {
            System.out.println("Mouse");
        } else if (birthYear % 12 == 5) {
            System.out.println("Ox");
        } else if (birthYear % 12 == 6) {
            System.out.println("Tiger");
        } else if (birthYear % 12 == 7) {
            System.out.println("Rabbit");
        } else if (birthYear % 12 == 8) {
            System.out.println("Dragon");
        } else if (birthYear % 12 == 9) {
            System.out.println("Snake");
        } else if (birthYear % 12 == 10) {
            System.out.println("Horse");
        } else if (birthYear % 12 == 11) {
            System.out.println("Sheep");
        }
    }
}