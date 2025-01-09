
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberInt;
//        System.out.println("Give a number:");
        numberInt = Integer.parseInt(scanner.nextLine());

        for (int i = numberInt; i <= 100; i++) System.out.println(i);
    }
}
