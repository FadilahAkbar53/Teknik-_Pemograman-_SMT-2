package GameHero;

public class Main {
    public static void main(String[] args) {
        HeroAssasin hero1 = new HeroAssasin("Gusion", 25, 100);
        HeroMage hero2 = new HeroMage("Lunox", 20, 100);
        Lord lord = new Lord("Lord", 80, 1500);

        // tampilan sebelum penyerangan
        hero1.display();
        hero2.display();
        lord.display();

        hero1.attack(lord);
        hero2.attack(hero1);
        lord.attack(hero2);

        // tampilan setelah menerima serangan
        hero1.display();
        hero2.display();
        lord.display();
    }
}
