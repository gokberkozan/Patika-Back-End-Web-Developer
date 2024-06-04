import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int originalHealth;
    private int money;
    private String charName;
    private String name;
    public Scanner scan = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    // Select char method
    public void selectChar() {

        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Characters: ");
        System.out.println("---------------------------------------------------------------------------");
        for (GameChar gameChar : charList) {

            System.out.println("ID: " + gameChar.getId() +
                    "\t\t Character: " + gameChar.getName() +
                    "\t\t Damage: " + gameChar.getDamage() +
                    "\t\t Health: " + gameChar.getHealth() +
                    "\t\t Money: " + gameChar.getMoney());

        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.print("Please choose a character to start the game: ");

        int selectChar = scan.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
            default:
                initPlayer(new Samurai());
        }
    }

    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOriginalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    // Print info method
    public void printInfo() {
        System.out.println("------------------------------------------------------------");
        System.out.println(" Weapon: " + this.getInventory().getWeapon().getName() +
                        "\t Armor " + this.getInventory().getArmor().getName() +
                        "\t Defence: " + this.getInventory().getArmor().getDefence() +
                        "\t Damage: " + this.getTotalDamage() +
                        "\t Health: " + this.getHealth() +
                        "\t Money: " + this.getMoney() +
                        "\t Food: " + this.getInventory().getFoodCount() +
                        "\t Wood: " + this.getInventory().getFireWoodCount() +
                        "\t Water: " + this.getInventory().getWaterCount());
        System.out.println("-----------------------------------------------------------");
    }

    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    // Set health method
    public void setHealth(int health) {
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Weapon getWeapon() {
        return this.getInventory().getWeapon();
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}