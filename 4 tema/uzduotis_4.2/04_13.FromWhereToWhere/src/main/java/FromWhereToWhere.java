
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        int numberFrom = 0;
        int numberTo = 0;

        System.out.print("Where to? ");
        numberTo = Integer.parseInt(scanner.nextLine());
        System.out.print("Where from? ");
        numberFrom = Integer.parseInt(scanner.nextLine());

        for (int i = numberFrom; i <= numberTo; i++) System.out.println(i);
    }
}
