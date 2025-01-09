
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int sumNumbers = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sumNumbers);

        int differenceNumbers = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + differenceNumbers);

        int MultiplicationNumbers = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + MultiplicationNumbers);

        Double quotientNumbers = firstNumber * 1.0 / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotientNumbers);


    }
}
