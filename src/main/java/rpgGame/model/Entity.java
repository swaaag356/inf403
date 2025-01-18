package rpgGame.model;

public class Entity {
    protected String name;
    protected int age;
    protected int healthPoints = 10;
    protected int armor = 0;

    public Entity() {
    }

    public Entity(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void printInfo() {
        System.out.println(name + " | " + "age = " + age);
    }
}