import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int maths, physics, chemistry, turkish, history, music;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your Maths grade: ");
        maths = input.nextInt();

        System.out.print("Please enter your Physics grade: ");
        physics = input.nextInt();

        System.out.print("Please enter your Chemistry grade: ");
        chemistry = input.nextInt();

        System.out.print("Please enter your Turkish grade: ");
        turkish = input.nextInt();

        System.out.print("Please enter your History grade: ");
        history = input.nextInt();

        System.out.print("Please enter your Music grade: ");
        music = input.nextInt();

        int average = (maths + physics + chemistry + turkish + history + music) / 6;
        System.out.println("Your average is: " + average);

        if(average >= 60 && average <= 100) {
            System.out.println("You passed the class. Congratulations!");
        } else if(average < 60 && average >= 0) {
            System.out.println("You failed the class");
        } else {
            System.out.println("Invalid grade");
        }
    }
}