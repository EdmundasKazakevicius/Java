
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String carryOn;
        do {
            System.out.println("Shall we carry on?");
            carryOn = scanner.nextLine();
        }
        while (!(carryOn.equals("no")));
    }
}
