package rpgGame.model;

public class ZombieBull extends Monster {
    private int healthPoints = 120;
    private int stamina = 100;
    private int damage = 20;
    private int armor = 50;

    public ZombieBull() {
    }

    public ZombieBull(String name, int age) {
        super(name, age);
    }

    @Override
    public void attack(Entity e) {
        if (this.stamina > 0) {
            if (e.armor > 0) {
                e.armor -= this.damage;
                this.stamina -= 10;
            } else {
                e.healthPoints -= this.damage;
                this.stamina -= 10;
            }
        }
    }

    public void eatProteinCookies() {
        this.stamina = 100;
    }

    @Override
    public void printInfo() {
        if (this.healthPoints > 0) {
            System.out.println("Monster | " + name + " | " + age + " | " + healthPoints + " healthPoints | " + damage + " damage | " + armor + " armor | " + stamina + " stamina ");
        } else {
            System.out.println("Monster | " + name + " | dead");
        }
    }
}