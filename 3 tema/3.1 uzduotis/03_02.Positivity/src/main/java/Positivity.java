

import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here

        System.out.println("Give а number:");
        int number = Integer.parseInt(scan.nextLine());
        if (number > 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is not positive.");
        }

        scan.close();

    }
}

