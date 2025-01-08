
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give a year: ");
        int _year = Integer.parseInt(scan.nextLine());
        if (((_year % 4 == 0) && (_year % 100 != 0)) || ((_year % 100 == 0) && (_year % 400 == 0))) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

    }
}
