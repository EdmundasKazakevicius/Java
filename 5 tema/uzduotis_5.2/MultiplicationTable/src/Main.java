public class Main {
    public static void main(String[] args) {
        oddMultiplicationTable(5);
    }

    public static void oddMultiplicationTable(int number) {

        if (number % 2 == 0) number = number - 1;

        for (int i = 1; i <= number; i = i + 2) {
            for (int j = 1; j <= number; j = j + 2) {
                System.out.print(i * j + "\t");

                if (j == number && i != number) {
                    System.out.println("");
                    System.out.println("");
                }
            }
        }
    }
}