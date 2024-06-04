import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n number: ");
        int n = sc.nextInt();

        int min = 0, max = 0;

        for(int i = 1; i <= n; i++) {
            System.out.print(i + ". number: ");
            int number = sc.nextInt();

            if(i == 1) {
                max = number;
                min = number;
            }else if(number > max ) {
                max = number;
            }else if(number < min){
                min = number;
            }
        }
        System.out.println("Max number:  " + max);
        System.out.println("Min number:  " + min);
    }
}