import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Scanner declaration
        Scanner sc = new Scanner(System.in);

        // List Initialization
        List<Product> productList = new ArrayList<>();

        // Adding Products to the List
        productList.add(new Laptop(1, "HUAWEI Matebook 14", 7000.0, "Huawei", 512, 14.0, 16));
        productList.add(new Laptop(2, "LENOVO V14 IGL", 3699.0, "Lenovo", 1024, 14.0, 8));
        productList.add(new Laptop(3, "ASUS Tuf Gaming", 8199.0, "Asus", 2048, 15.6, 32));
        productList.add(new MobilePhone(1, "SAMSUNG GALAXY A51", 3199.0, "Samsung", 128, 6.5, 32, 4000.0, 6, "Black"));
        productList.add(new MobilePhone(2, "iPhone 11 64 GB", 7379.0, "Apple", 64, 6.1, 5, 3046.0, 6, "Blue"));
        productList.add(new MobilePhone(3, "Redmi Note 10 Pro 8GB", 4012.0, "Xiaomi", 128, 6.5, 35, 4000.0, 12, "White"));

        while (true) {
            // Cases for different user choices
            System.out.println("\nPatikaStore Product Management Panel !");
            System.out.println("1 - Laptop Operations");
            System.out.println("2 - MobilePhone Operations");
            System.out.println("3 - List Brands");
            System.out.println("0 - Exit");
            System.out.print("Your Choice: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("\nLaptop List\n");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    System.out.println("| ID | Product Name                  | Price     | Brand     | Storage   | Screen    | RAM         |");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    for (Product product : productList) {
                        if (product instanceof Laptop) {
                            System.out.println(product);
                        }
                    }
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("\nSmartphone List\n");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| ID | Product Name                  | Price     | Brand     | Storage   | Screen    | Camera    | Battery   | RAM       | Color     |");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
                    for (Product product : productList) {
                        if (product instanceof MobilePhone) {
                            System.out.println(product);
                        }
                    }
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("\nOur Brands\n--------------");
                    for (Product product : productList) {
                        System.out.println("- " + product.brand);
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}