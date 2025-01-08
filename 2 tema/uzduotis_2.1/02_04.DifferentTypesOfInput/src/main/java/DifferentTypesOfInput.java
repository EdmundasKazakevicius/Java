
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String text = scan.nextLine();
        System.out.println("Give an integer:");
        int numberInt = Integer.parseInt(scan.nextLine());
        System.out.println("Give a double:");
        Double numberDouble = Double.parseDouble(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean bn = scan.nextBoolean();

        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + numberInt);
        System.out.println("You gave the double " + numberDouble);
        System.out.println("You gave the boolean " + bn);

    }
}
