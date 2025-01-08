
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInt;
        do {
            System.out.println("Give a number:");
            numberInt = Integer.parseInt(scanner.nextLine());
        }
        while (numberInt != 4);
    }
}
