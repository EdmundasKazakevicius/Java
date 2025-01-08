
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInt;
        int numberCount = 0;
        do {
            System.out.println("Give a number:");
            numberInt = Integer.parseInt(scanner.nextLine());
            if (numberInt < 0) numberCount++;
        }
        while (numberInt != 0);
        System.out.println("Number of negative numbers: " + numberCount);


    }
}
