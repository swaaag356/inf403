package rpgGame;

import rpgGame.model.*;

public class GameMain {
    public static void main(String[] args) {

        Pillager p1 = new Pillager("Geralt", 34);
        ZombieBull p2 = new ZombieBull("E", 25);

        p1.printInfo();
        p2.printInfo();

        p1.attack(p2);
        p2.printInfo();
    }
}
