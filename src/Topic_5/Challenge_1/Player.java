package Topic_5.Challenge_1;

public class Player {
    private String name;
    private int health;
    private int energy;

    public Player(String name, int health, int energy) {
        this.name = name;
        this.health = health;
        this.energy = energy;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getEnergy() {
        return energy;
    }
    public void takeDamage(int amount) {
        if (amount < 0) {
            return; // Ignore negative damage
        }
        health -= amount;
        if (health < 0) {
            health = 0;
        }
    }
    public boolean isAlive() {
        return health > 0;
    }
    @Override
    public String toString() {
        return "The player :" + name + " has those atributes:\n" 
        + health + " health\n" + energy + " energy.";
    }    
}
