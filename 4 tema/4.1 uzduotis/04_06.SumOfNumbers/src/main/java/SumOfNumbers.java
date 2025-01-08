
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInt;
        int numberSum = 0;
        do {
            System.out.println("Give a number:");
            numberInt = Integer.parseInt(scanner.nextLine());
            numberSum = numberSum + numberInt;
        }
        while (numberInt != 0);
        System.out.println("Sum of the numbers: " + numberSum);
    }
}
