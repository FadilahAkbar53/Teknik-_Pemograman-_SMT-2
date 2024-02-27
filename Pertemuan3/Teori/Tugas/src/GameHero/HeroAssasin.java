package GameHero;

public class HeroAssasin extends Hero {
    private String type = "Assassin";

    // Constructor
    public HeroAssasin(String name, double attackPower, double health) {
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
        setHealth(getHealth() - 0.5 * damage);
    }
}
