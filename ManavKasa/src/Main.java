import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pear, apple, tomato, banana, aubergine;
        double pearKG = 2.14, appleKG = 3.67, tomatoKG = 1.11, bananaKG = 0.95, aubergineKG = 5.00;

        System.out.print("How many kilos of pears?: ");
        pear = sc.nextDouble() * pearKG;

        System.out.print("How many kilos of apples?: ");
        apple = sc.nextDouble() * appleKG;

        System.out.print("How many kilos of tomatoes?: ");
        tomato = sc.nextDouble() * tomatoKG;

        System.out.print("How many kilos of bananas?: ");
        banana = sc.nextDouble() * bananaKG;

        System.out.print("How many kilos of aubergines: ");
        aubergine = sc.nextDouble() * aubergineKG;

        double total = pear + apple + tomato + banana + aubergine;
        System.out.print("Total: " + total);
    }
}