
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");

        int numberOfPoints = Integer.parseInt(scan.nextLine());

        if (numberOfPoints > 100) {
            System.out.println("incredible!");
        } else if (numberOfPoints >= 90) {
            System.out.println("Grade: 5");
        } else if (numberOfPoints >= 80) {
            System.out.println("Grade: 4");
        } else if (numberOfPoints >= 70) {
            System.out.println("Grade: 3");
        } else if (numberOfPoints >= 60) {
            System.out.println("Grade: 2");
        } else if (numberOfPoints >= 50) {
            System.out.println("Grade: 1");
        } else if (numberOfPoints >= 0) {
            System.out.println("Grade: failed");
        } else {
            System.out.println("Impossible!");
        }

        scan.close();

    }
}
