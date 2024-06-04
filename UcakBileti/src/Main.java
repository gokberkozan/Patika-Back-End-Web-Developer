import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int distance, age, trip, price;

        System.out.print("Enter the distance(km): ");
        distance = sc.nextInt();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter the trip type (1-One Way, 2-Round Trip): ");
        trip = sc.nextInt();

        if((distance > 0) && (age > 0) && ((trip == 1) || (trip == 2))) {
            if(age < 12) {
                if(trip == 2){
                    price = (int) ((distance * 0.10) - (distance * 0.10) * 0.5);
                    price=(int) (price - (price * 0.2));
                    price = price * 2;
                    System.out.println("Total price: " + price);
                } else{
                    price = (int) ((distance * 0.10) - (distance * 0.10) * 0.5);
                    System.out.println("Total price: " + price);
                }
            } else if(age >= 12 && age <= 24){
                if(trip == 2){
                    price = (int) ((distance * 0.10) - (distance * 0.10) * 0.1);
                    price=(int) (price - (price * 0.2));
                    price = price * 2;
                    System.out.println("Total price: " + price);
                } else {
                    price = (int) ((distance * 0.10) - (distance*0.10) * 0.1);
                    System.out.println("Total price: " + price);
                }
            } else if(age > 65){
                if(trip == 2){
                    price = (int) ((distance * 0.10) - (distance * 0.10) * 0.3);
                    price = (int) (price - (price * 0.2));
                    price = price * 2;
                    System.out.println("Total price: " + price);
                }else {
                    price = (int) ((distance * 0.10) - (distance * 0.10) * 0.3);
                    System.out.println("Total price: " + price);
                }
            } else {
                if (trip == 2) {
                    price = (int) ((distance * 0.10));
                    price = (int) (price - (price * 0.2));
                    price = price * 2;
                    System.out.println("Total price: " + price);
                } else {
                    price = (int) ((distance * 0.10));
                    System.out.println("Total price: " + price);
                }
            }
        }else {
            System.out.println("Incorrect Data.");
        }
    }
}