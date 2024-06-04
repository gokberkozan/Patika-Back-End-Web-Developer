public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    // On location method
    public boolean onLocation() {
        System.out.println("You are in the safe house.");
        System.out.println("Your life has been renewed.");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());

        if(getPlayer().getInventory().getFoodCount() == 1 && getPlayer().getInventory().getWaterCount() == 1 && getPlayer().getInventory().getFireWoodCount()==1){
            System.out.println("You won the game.");
        }else{
            System.out.println("To win the game, collect the rewards of all regions and return to the safe house again.");
        }
        return true;
    }
}