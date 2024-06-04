import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, i = 1, sum = 0, count = 0, average = 0;

        System.out.print("Enter number: ");
        num = sc.nextInt();

        while(i <= num) {
            i++;
            if((i % 3 == 0) && (i % 4 == 0)) {
                sum +=i;
                count++;
                System.out.println(count + ". number: " + i);
            }
        }
        average = sum / count;
        System.out.println("Average: " + average);
    }
}