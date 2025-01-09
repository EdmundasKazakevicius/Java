
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int numberTo = Integer.parseInt(scanner.nextLine());

        int factorial = 1;
        for (int i = 1; i <= numberTo; i++) factorial = factorial * i;

        System.out.println("Factorial: " + factorial);
    }
}
