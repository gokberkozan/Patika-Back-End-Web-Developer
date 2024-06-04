import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fee: ");
        double fee = sc.nextInt();
        double vat = fee > 1000 ? 8 : 18;
        double taxedFee = fee + (fee * vat / 100);
        System.out.print("The new price of the product you will purchase with VAT: " + taxedFee);

    }
}