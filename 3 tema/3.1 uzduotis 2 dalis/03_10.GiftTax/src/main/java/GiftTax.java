
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Value of the gift?");
        int giftInt = Integer.parseInt(scan.nextLine());
        if (giftInt < 5000) {
            System.out.println("No tax!");
        } else if ((giftInt >= 5000) && (giftInt < 25000)) {
            Double tax = 100.00 + (giftInt - 5000) * 8 / 100;
            System.out.println("Tax: " + tax);
        } else if ((giftInt >= 25000) && (giftInt < 55000)) {
            Double tax = 1700.00 + (giftInt - 25000) * 10 / 100;
            System.out.println("Tax: " + tax);
        } else if ((giftInt >= 55000) && (giftInt < 200000)) {
            Double tax = 4700.00 + (giftInt - 55000) * 12 / 100;
            System.out.println("Tax: " + tax);
        } else if ((giftInt >= 200000) && (giftInt < 1000000)) {
            Double tax = 22100.00 + (giftInt - 200000) * 15 / 100;
            System.out.println("Tax: " + tax);
        } else if (giftInt >= 1000000) {
            Double tax = 142100.00 + (giftInt - 1000000) * 17 / 100;
            System.out.println("Tax: " + tax);
        }
    }
}
