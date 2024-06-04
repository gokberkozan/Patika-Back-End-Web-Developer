import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username, password, newPassword;
        int answer;

        System.out.print("Enter your username: ");
        username = sc.nextLine();
        System.out.print("Enter your password: ");
        password = sc.nextLine();

        if((username.equals("abcd")) && (password.equals("1234"))) {
            System.out.println("Login successfully!");
        } else {
            System.out.println("Login failed!");
            System.out.println("Do you want to reset your password?");
            System.out.println("1-Yes");
            System.out.println("2-No");
            answer = sc.nextInt();
            sc.nextLine();

            if (answer == 1) {
                System.out.print("Enter new password: ");
                newPassword = sc.nextLine();
                System.out.println(newPassword);
                if (newPassword.equals(password)) {
                    System.out.println("Do not use your previous password!");
                } else {
                    System.out.println("Login successfully!");
                }
            } else {
                System.out.println("Login Failed!");
            }
        }
    }
}
