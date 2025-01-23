import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> items;

    public Herd() {
        this.items = new ArrayList<>();
    }

    public String toString() {
        String sum = "";
        for (Movable item : items) {
            if (item instanceof Organism) {
                Organism i = (Organism) item;
                String h = "x: " + i.getX() + "; y: " + i.getY() + "\n";
                sum = sum + h;
            }

        }
        return sum;
    }

    public void addToHerd(Movable movable) {
        this.items.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable item : items) {
            item.move(dx, dy);
        }

    }
}
