package lab10game.model;

public class Ant extends Entity {


    public Ant() {
    }

    public Ant(int x, int y) {
        super("Муравей", x, y);
    }

    @Override
    public void move() {
        int direction = (int) (Math.random() * 4);

        switch (direction) {
            case 0:
                if (y > 0) {
                    --y;
                    break;
                }
            case 1:
                if (x < fieldWidth) {
                    ++x;
                    break;
                }
            case 2:
                if (y < fieldHeight) {
                    ++y;
                    break;
                }
            case 3:
                if (x > 0) {
                    --x;
                    break;
                }
        }
    }
}