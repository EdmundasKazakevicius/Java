import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> box = new ArrayList<>();

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        int sum = 0;
        for (Item i : box) {
            sum = sum + i.getWeight();
        }
        if (sum + item.getWeight() <= capacity) {
            box.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return box.contains(item);
    }

}
