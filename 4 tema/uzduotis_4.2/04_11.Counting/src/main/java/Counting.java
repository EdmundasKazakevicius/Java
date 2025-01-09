
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInt;

        //    System.out.println("Give a number:");
        numberInt = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= numberInt; i++) System.out.println(i);
    }
}
