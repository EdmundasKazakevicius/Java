
public class Main {

    public static void main(String[] args) {
        // Test your code here!

        CustomTacoBox newBox = new CustomTacoBox(5);
        TripleTacoBox newTripleBox = new TripleTacoBox();

        System.out.println(newBox.tacosRemaining());
        newBox.eat();
        System.out.println(newBox.tacosRemaining());

        System.out.println(newTripleBox.tacosRemaining());
        newTripleBox.eat();
        System.out.println(newTripleBox.tacosRemaining());

    }
}
