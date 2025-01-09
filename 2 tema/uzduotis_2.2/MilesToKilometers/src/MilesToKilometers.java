
import java.util.Scanner;

public class MilesToKilometers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter miles:");
        Double numberMiles = Double.parseDouble(scanner.nextLine());
        Double numberKilometers = numberMiles * 1.6;
        System.out.println(numberMiles + " miles is " + numberKilometers + " kilometers");

    }
}
