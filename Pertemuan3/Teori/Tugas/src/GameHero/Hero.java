package GameHero;

abstract class Hero {
    // attributes
    private String name;
    private double attackPower;
    private double health;

    // superClass Constructor
    public Hero(String name, double attackPower, double health) {
        this.name = name;
        this.attackPower = attackPower;
        this.health = health;
    }

    // Methods
    public void display() {
        System.out.println("\nName: " + name);
        System.out.println("Attack: " + attackPower);
        System.out.println("Health: " + health);
    }

    public void attack(Hero enemy) {
        System.out.println("\n" + name + " Menyerang Ke " + enemy.getName());
        enemy.takeDamage(attackPower);
    }

    public void takeDamage(double damage) {
        System.out.println(name + " Menerima Serangan Sebesar " + damage);
        health -= damage;
    }

    // Setters
    public void setHealth(double health) {
        this.health = health;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public double getHealth() {
        return health;
    }
}
