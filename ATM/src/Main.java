import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Username: ");
            String username = sc.nextLine();
            System.out.print("Password:  ");
            String password = sc.nextLine();

            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = sc.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            int price = sc.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            price = sc.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                        default:
                            System.out.println("Hata.");
                    }
                }
                while (select != 4);
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}