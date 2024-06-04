import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println("Number: " + number);
        while (right < 5) {
            System.out.print("Please enter your prediction: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a value between 0-100.");
                if (isWrong) {
                    right++;
                    System.out.println("You have made too many incorrect entries. Remaining right: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("If you enter incorrectly again, your credit will be deducted.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congratulations, correct guess! The number you guessed: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("You entered an incorrect number!");
                if (selected > number) {
                    System.out.println(selected + " number is greater than the secret number.");
                } else {
                    System.out.println(selected + " number is less than the secret number.");
                }

                wrong[right++] = selected;
                System.out.println("Remaining right: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You lost! ");
            if (!isWrong) {
                System.out.println("Your predictions: " + Arrays.toString(wrong));
            }
        }

    }
}