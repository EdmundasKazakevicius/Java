

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int numberTo) {

        for (int i = 1; i <= numberTo; i++)
            System.out.println(i);
    }

}
