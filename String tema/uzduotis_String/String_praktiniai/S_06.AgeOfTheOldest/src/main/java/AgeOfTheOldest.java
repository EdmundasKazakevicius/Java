
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = -1;
        while (true) {
            String values = scanner.nextLine();
            if (values.equals("")) {
                break;
            }

            String[] details = values.split(",");
            int number = Integer.valueOf(details[1]);
            if (number > oldest) oldest = number;

        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
