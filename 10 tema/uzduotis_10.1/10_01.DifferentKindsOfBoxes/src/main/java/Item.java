import java.util.Objects;

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        Item forCompare = (Item) obj;
        return Objects.equals(name, forCompare.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
