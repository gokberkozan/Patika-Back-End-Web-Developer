import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type the temperature: ");
        int temperature = sc.nextInt();

        String result = temperature < 5 ? "Ski" : ((temperature >= 5 && temperature <= 15) ? "Cinema" : ((temperature >= 10 && temperature <= 25) ? "Picnic" : ((temperature > 25) ? "Swimming" : "Be safe")));

        System.out.println(result);
    }
}