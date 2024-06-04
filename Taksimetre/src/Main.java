import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int  start_Price = 10;
        double km, price, perKm = 2.20;

        System.out.print("Enter the distance in km: ");
        km = sc.nextInt();

        km = (km * perKm) + start_Price;
        price = km > 20 ? km : 20.0;

        System.out.print("Total Price: " + price);
    }
}