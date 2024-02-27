package GameHero;

public class HeroMage extends Hero {
    private String type = "Mage";

    // Constructor
    public HeroMage(String name, double attackPower, double health) {
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
        setHealth(getHealth() - 0.3 * damage);
    }
}
