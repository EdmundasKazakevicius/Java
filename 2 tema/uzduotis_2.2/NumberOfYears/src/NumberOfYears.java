
import java.util.Scanner;

public class NumberOfYears {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of minutes:");
        int numberMinutes = Integer.parseInt(scanner.nextLine());
        int numberYears = (int) (numberMinutes/60.0/24.0/365);
        int numberRestMinutes = (numberMinutes-numberYears*365*24*60)/60/24;

        System.out.println(numberMinutes + " is aproximatelly " +numberYears+" and " + numberRestMinutes + " days");

    }
}
