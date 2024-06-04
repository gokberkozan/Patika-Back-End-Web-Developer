import java.util.Scanner;

public class Game {
    public Scanner scan = new Scanner(System.in);
    public void start() {
        System.out.println("Welcome to the adventure game. ");
        System.out.print("Please enter a name:  ");
        String playerName = scan.nextLine();
        Player player = new Player(playerName);
        System.out.println("Dear " + player.getName() + " welcome to the island.");
        player.selectChar();


        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println();
            System.out.println("-----Regions : ");
            System.out.println("1 - Safe House ---> This is a safe house for you, there are no enemies.");
            System.out.println("2 - Item Shop --> You can buy weapons or armor.");
            System.out.println("3 - Cave --> Go to the cave, REWARD: Food");
            System.out.println("4 - Forest ---> Go to the forest, REWARD: Wood");
            System.out.println("5 - River ---> Go to the river, REWARD: Water");
            System.out.println("6 - Mine ---> Go to the mine, REWARD: Weapons, armor and money");
            System.out.println("0 - Log out, end the game.");
            System.out.print("Please select the region you want to go to: ");
            int selectLocation = scan.nextInt();
            switch (selectLocation) {
                case 0:
                    location = null;
                    break;

                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    location = new Mine(player);
                default:
                    System.out.println("Please enter a valid region!");
            }

            if (location == null) {
                System.out.println("The game is over, we wait again.");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("Game OVER!");
                break;
            }
        }
    }
}