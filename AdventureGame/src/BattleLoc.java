import java.util.Random;

public abstract class BattleLoc extends Location {
    private Monster monster;
    private String award;
    private int maxMonster;
    public Random random = new Random();

    public BattleLoc(Player player, String name, Monster monster, String award, int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }

    // On location method
    boolean onLocation() {
        int monstNumber = this.randomMonsterNumber();
        System.out.println("You are here now: " + this.getName());
        System.out.println("Be careful here " + monstNumber + " unit " + this.getMonster().getName() + " is alive.");
        System.out.print("Press <F> to fight, press <K> to escape: ");
        String selectBattle = scan.nextLine().toUpperCase();
        if (selectBattle.equals("F") && combat(monstNumber)) {
            System.out.println(this.getName() + " You have killed all the enemies of the zone.");
            return true;
        }

        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("You are dead.");
            return false;
        }
        return true;
    }

    // Combat method
    public boolean combat(int monstNumber) {
        for (int i = 1; i <= monstNumber; i++) {
            this.getMonster().setHealth(this.getMonster().getOrginalHealth());
            playerStats();
            monsterStats(i);

            boolean playerFirst = Math.random() > 0.5;
            while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {
                System.out.println();
                System.out.print("<H>it veya <R>un: ");
                String selectCombat = scan.nextLine().toUpperCase();

                if (playerFirst) {
                    if (selectCombat.equals("H")) {
                        System.out.println(this.getPlayer().getName() + " hit");
                        this.monster.setHealth(this.monster.getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();

                    } else {
                        return false;
                    }
                } else {
                    if (this.getMonster().getHealth() > 0) {
                        System.out.println();
                        System.out.println(this.getMonster().getName() + " hits you.");
                        int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getDefence();
                        if (monsterDamage < 0) {
                            monsterDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                        afterHit();
                        if (this.getPlayer().getHealth() <= 0) {
                            System.out.println("You are dead.");
                            return false;
                        }
                    }
                }
            }
            if (this.getMonster().getHealth() < this.getPlayer().getHealth()) {
                int count = 0;
                System.out.println("You have defeated the enemy.");
                System.out.println(this.getMonster().getAwardMoney() + " You made money.");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMonster().getAwardMoney());
                System.out.println("Your current money: " + this.getPlayer().getMoney());
                if (i == monstNumber && this.getMonster().getName().equals("Zombie")) {
                    this.getPlayer().getInventory().setFood(true);
                    count++;
                    System.out.println("Congratulations, you won a meal.");
                    this.getPlayer().getInventory().setFoodCount(count);
                } else if (i == monstNumber && this.getMonster().getName().equals("Vampire")) {
                    this.getPlayer().getInventory().setFireWood(true);
                    count++;
                    System.out.println("Congratulations, you earned wood.");
                    this.getPlayer().getInventory().setFireWoodCount(count);
                } else if (i == monstNumber && this.getMonster().getName().equals("Bear")) {
                    this.getPlayer().getInventory().setWater(true);
                    count++;
                    System.out.println("Congratulations, you have won water.");
                    this.getPlayer().getInventory().setWaterCount(count);

                } else if (i == monstNumber && this.getMonster().getName().equals("Snake")) {
                    getSnake();
                }
            }
        }
        return true;
    }

    // After hit method
    public void afterHit() {
        System.out.println("Your life: " + this.getPlayer().getHealth());
        System.out.println(this.getMonster().getName() + " life: " + this.getMonster().getHealth());
        System.out.println("------------");
    }

    // Player stats method
    public void playerStats() {
        System.out.println("Player values: ");
        System.out.println("------------");
        System.out.println("Health: " + this.getPlayer().getHealth());
        System.out.println("Weapon: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Armor: " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Defence: " + this.getPlayer().getInventory().getArmor().getDefence());
        System.out.println("Total Damage: " + this.getPlayer().getTotalDamage());
        System.out.println("Money: " + this.getPlayer().getMoney());
        System.out.println();
    }

    // Monster stats method
    public void monsterStats(int i) {
        System.out.println(i + ". " + this.getMonster().getName() + " Values");
        System.out.println("-------------------");
        System.out.println("Health: " + this.getMonster().getHealth());
        System.out.println("Damage: " + this.getMonster().getDamage());
        System.out.println("Prize Money: " + this.getMonster().getAwardMoney());
    }

    // Random monster number method
    public int randomMonsterNumber() {
        Random r = new Random();
        return r.nextInt(this.getMaxMonster()) + 1;
    }

    // Get snake method
    public void getSnake() {
        int randomNumber = random.nextInt(100);
        if (randomNumber <= 15) {
            weaponRate();
        } else if (randomNumber <= 30) {
            armorRate();
        } else if (randomNumber <= 55) {
            moneyRate();
        } else {
            System.out.println("You haven't won anything.");
        }
    }

    // Weapon rate method
    public void weaponRate() {
        int randomNum = random.nextInt(1, 101);
        if (randomNum <= 50) {
            System.out.println("You won a gun.");
            this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(1));
        } else if (randomNum <= 80) {
            System.out.println("You have won the sword.");
            this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(2));
        } else if (randomNum <= 100) {
            System.out.println("You won a rifle.");
            this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(3));
        }
    }

    // Armor rate method
    public void armorRate() {
        int randomNum = random.nextInt(1, 101);
        if (randomNum <= 50) {
            System.out.println("You gain light armor.");
            this.getPlayer().getInventory().setArmor(Armor.getArmorObjByID(1));
        } else if (randomNum <= 80) {
            System.out.println("You gain medium armor.");
            this.getPlayer().getInventory().setArmor(Armor.getArmorObjByID(2));
        } else if (randomNum <= 100) {
            System.out.println("You gained heavy armor.");
            this.getPlayer().getInventory().setArmor(Armor.getArmorObjByID(3));
        }
    }

    // Money rate method
    public void moneyRate() {
        int randomNum = random.nextInt(1, 101);
        int money = 0;
        if (randomNum <= 50) {
            money = 1;
            System.out.println("You won 1 coins.");
            this.getPlayer().setMoney(getPlayer().getMoney() + money);
        } else if (randomNum <= 80) {
            money = 5;
            System.out.println("You won 5 coins.");
            this.getPlayer().setMoney(getPlayer().getMoney() + money);
        } else if (randomNum <= 100) {
            money = 10;
            System.out.println("You won 10 coins.");
            this.getPlayer().setMoney(getPlayer().getMoney() + money);
        }
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }
}