
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);

        int numberInt;
        int numberSum = 0;
        int numberOfNumbers = 0;
        int numberOfEven = 0;
        int numberOfOdd = 0;

        System.out.println("Give numbers:");
        do {
            numberInt = Integer.parseInt(scanner.nextLine());
            if (numberInt != -1) {
                numberSum = numberSum + numberInt;
                numberOfNumbers++;
                if (numberInt % 2 == 0) numberOfEven++;
                else numberOfOdd++;
            }
        }
        while (numberInt != -1);
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + numberSum);
        System.out.println("Numbers: " + numberOfNumbers);
        Double average = 1.0 * numberSum / numberOfNumbers;
        System.out.println("Average: " + average);
        System.out.println("Even: " + numberOfEven);
        System.out.println("Odd: " + numberOfOdd);
    }
}
