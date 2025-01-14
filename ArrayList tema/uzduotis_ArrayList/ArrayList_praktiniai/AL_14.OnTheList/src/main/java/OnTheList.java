
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.print("Search for? ");
        String whatString = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            String oneItem = list.get(i);
            if (oneItem.equals(whatString)) {
                found = true;
                System.out.println(oneItem + " was found!");
                break;
            }

        }
        if (found == false) System.out.println(whatString + " was not found!");

    }
}
