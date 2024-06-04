import java.util.Scanner;

/*
Capricorn (December 22 – January 19)
Aquarius (January 20 – February 18)
Pisces (February 19 – March 20)
Aries (March 21 – April 19)
Taurus (April 20 – May 20)
Gemini (May 21 – June 20)
Cancer (June 21 – July 22)
Leo (July 23 – August 22)
Virgo (August 23 – September 22)
Libra (September 23 – October 22)
Scorpio (October 23 – November 21)
Sagittarius (November 22 – December 21)
*/

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month, day;

        System.out.print("Enter the month: ");
        month = sc.nextInt();
        System.out.print("Enter the day: ");
        day = sc.nextInt();

        if (month == 1) {
            if (day <= 19 && day > 0) {
                System.out.println("Capricorn");
            } else if (day >= 21 && day <= 31) {
                System.out.println("Aquarius");
            }
        } else if (month == 2) {
            if (day <= 18 && day > 0) {
                System.out.println("Aquarius");
            } else if (day >= 19 && day <= 28) {
                System.out.println("Pisces");
            }
        } else if (month == 3) {
            if (day <= 20 && day > 0) {
                System.out.println("Pisces");
            } else if (day >= 21 && day <= 31) {
                System.out.println("Aries");
            }
        }else if (month == 4) {
            if (day <= 19 && day > 0) {
                System.out.println("Aries");
            } else if (day >= 20 && day <= 30) {
                System.out.println("Taurus");
            }
        }else if (month == 5) {
            if (day <= 20 && day > 0) {
                System.out.println("Taurus");
            } else if (day >= 21 && day <= 31) {
                System.out.println("Gemini");
            }
        }else if (month == 6) {
            if (day <= 20 && day > 0) {
                System.out.println("Gemini");
            } else if (day >= 21  && day <= 31) {
                System.out.println("Cancer");
            }
        }else if (month == 7) {
            if (day <= 22 && day > 0) {
                System.out.println("Cancer");
            } else if (day >= 21 && day <= 31) {
                System.out.println("Leo");
            }
        }else if (month == 8) {
            if (day <= 22 && day > 0) {
                System.out.println("Leo");
            } else if (day >= 23 && day <= 30) {
                System.out.println("Virgo");
            }
        }else if (month == 9) {
            if (day <= 22 && day > 0) {
                System.out.println("Virgo");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Libra");
            }
        }else if (month == 10) {
            if (day <= 22 && day > 0) {
                System.out.println("Libra");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Scorpio");
            }
        }else if (month == 11) {
            if (day <= 21 && day > 0) {
                System.out.println("Scorpio");
            } else if (day >= 22 && day <= 30) {
                System.out.println("Sagittarius ");
            }
        }else if (month == 12) {
            if (day <= 22 && day > 0) {
                System.out.println("Sagittarius ");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Capricorn");
            }
        }
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Error. Try again! Months must be between and equal to 1-12");
        }
    }
}