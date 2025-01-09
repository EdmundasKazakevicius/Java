
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        // ask the user for how many times should the text be printed
        // then call the printText-method multiple times with a while-loop

        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.println("How many times?");
        number = Integer.parseInt(scanner.nextLine());

        // Don't change the next line that defines the method!
        // (We aren't giving a method a parameter yet)

        for (int i = 0; i < number; i++) printText();

    }

    public static void printText() {
        // write some code here
        System.out.println("In a hole in the ground there lived a method");
    }
}
