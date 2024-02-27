package GameHero;

public class Lord extends Hero {
    private String type = "LORD";

    // Constructor
    public Lord(String name, double attackPower, double health) {
        super(name, attackPower, health);
    }

    // Methods
    @Override
    public void display() {
        super.display();
        System.out.println("Type: " + type);
    }

    @Override
    public void takeDamage(double damage) {
        System.out.println(getName() + " Menerima Serangan Sebesar " + damage);
        setHealth(getHealth() - 0.2 * damage); // Mengurangi hanya 30% dari damage
    }
}

