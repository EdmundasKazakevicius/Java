
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.print("Search for? ");
        int numberWitch = Integer.parseInt(scanner.nextLine());
        System.out.println("");

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (number == numberWitch) {
                System.out.println("" + numberWitch + "is at index " + i);
            }

        }

    }
}