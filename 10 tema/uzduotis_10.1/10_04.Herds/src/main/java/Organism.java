
public class Organism implements Movable {
    private int x;
    private int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + x + "; y: " + y;
    }

    public void move(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
