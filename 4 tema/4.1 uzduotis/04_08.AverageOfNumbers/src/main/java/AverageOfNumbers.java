
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInt;
        int numberCount = 0;
        int numberSum = 0;

        do {
            System.out.println("Give a number:");
            numberInt = Integer.parseInt(scanner.nextLine());

            if (numberInt != 0) {
                numberSum = numberSum + numberInt;
                numberCount++;
            }
        }
        while (numberInt != 0);

        Double numberAverage = 1.0 * numberSum / numberCount;
        System.out.println("Average of the numbers: " + numberAverage);
    }
}
