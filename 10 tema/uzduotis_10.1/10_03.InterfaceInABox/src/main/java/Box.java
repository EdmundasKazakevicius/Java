import java.util.ArrayList;

public class Box implements Packable {
    private double capasity;
    private ArrayList<Packable> items;

    public Box(double capasity) {
        this.capasity = capasity;
        items = new ArrayList<>();
    }

    public double weight() {
        double weight = 0;
        for (Packable i : items) {
            weight = weight + i.weight();
        }
        return weight;
    }

    public void add(Packable item) {

        if (weight() + item.weight() <= capasity) {
            items.add(item);
        }

    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }

}
