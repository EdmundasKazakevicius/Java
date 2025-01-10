public class Main {
    public static void main(String[] args) {
        numberPattern(4);
    }

    public static void numberPattern(int rows) {

        System.out.println("1");
        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                if (j == i) System.out.println("");

            }

        }

    }
}