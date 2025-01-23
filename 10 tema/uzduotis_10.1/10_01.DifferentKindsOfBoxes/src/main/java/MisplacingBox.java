import java.util.ArrayList;

public class MisplacingBox extends Box {
    private ArrayList<Item> box = new ArrayList<>();

    public MisplacingBox() {

    }

    @Override
    public void add(Item item) {
        box.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        box.contains(item);
        return false;
    }
}
