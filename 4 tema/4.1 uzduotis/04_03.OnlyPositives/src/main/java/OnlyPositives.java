
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInt;
        do {
            System.out.println("Give a number:");
            numberInt = Integer.parseInt(scanner.nextLine());
            if (numberInt > 0) System.out.println(numberInt * numberInt);
            if (numberInt < 0) System.out.println("Unsuitable number");
        }
        while (numberInt != 0);


    }
}
