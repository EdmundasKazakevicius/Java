
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = -1;
        String oldestName = "";

        while (true) {
            String values = scanner.nextLine();
            if (values.equals("")) break;

            String[] detailes = values.split(",");
            int age = Integer.valueOf(detailes[1]);

            if (age > oldest) {
                oldest = age;
                oldestName = detailes[0];
            }

        }
        System.out.println("Name of the oldest: " + oldestName);
    }

}

