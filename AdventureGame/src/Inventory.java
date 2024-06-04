public class Inventory {

    private boolean water;
    private int waterCount;
    private boolean food;
    private int foodCount;
    private boolean fireWood;
    private int fireWoodCount;
    private Weapon weapon;
    private Armor armor;


    public Inventory() {
        this.weapon = new Weapon("Fist", -1, 0, 0);
        this.armor = new Armor("Naked", -1, 0, 0);
        this.water = false;
        this.food = false;
        this.fireWood = false;
        this.waterCount = 0;
        this.foodCount = 0;
        this.fireWoodCount = 0;
    }

    public int getWaterCount() {
        return waterCount;
    }

    public void setWaterCount(int waterCount) {
        this.waterCount = waterCount;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    public int getFireWoodCount() {
        return fireWoodCount;
    }

    public void setFireWoodCount(int fireWoodCount) {
        this.fireWoodCount = fireWoodCount;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFireWood() {
        return fireWood;
    }

    public void setFireWood(boolean fireWood) {
        this.fireWood = fireWood;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}