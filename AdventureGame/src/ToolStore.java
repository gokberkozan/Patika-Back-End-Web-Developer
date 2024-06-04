public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "ToolStore");
    }

    // On location method
    public boolean onLocation() {
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("-----------Welcome to Store--------");
            System.out.println("1- Weapons");
            System.out.println("2- Armors");
            System.out.println("3- Log out");
            System.out.print("Your choice: ");
            int selectCase = scan.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.print("Invalid value, enter again:  ");
                selectCase = scan.nextInt();
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("We hope you come again");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    // Print weapon method
    public void printWeapon() {
        System.out.println("-----------Weaponry-----------");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + "- " + w.getName() + " Money: " + w.getPrice() + " Damage: " + w.getDamage());
        }
        System.out.println("0 - Sign Out");
    }

    // Buy weapon method
    public void buyWeapon() {
        System.out.print("Choose a weapon: ");
        int selectWeaponID = scan.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Invalid value, enter again:");
            selectWeaponID = scan.nextInt();
        }

        if (selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                } else {
                    System.out.println(selectedWeapon.getName() + " You bought the gun.");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your remaining money: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }
            }
        }
    }

    // Print armot method
    public void printArmor() {
        System.out.println("-----------Armors-----------");
        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() + " - " + a.getName() + " Money: " + a.getPrice() + " Defence: " + a.getDefence());
        }
        System.out.println("0 - Sign Out");
    }

    // Buy armor method
    public void buyArmor() {
        System.out.print("Choose an armor: ");
        int selectArmorID = scan.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
            System.out.print("Invalid value, enter again: ");
            selectArmorID = scan.nextInt();
        }

        if (selectArmorID != 0) {
            Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("You don't have enough money.");
                } else {
                    System.out.println(selectedArmor.getName() + " You bought the armor.");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your remaining money: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                }
            }
        }

    }
}