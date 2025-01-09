
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int numberFrom = Integer.parseInt(scanner.nextLine());
        System.out.print("Last number? ");
        int numberTo = Integer.parseInt(scanner.nextLine());

        int sumSeq = 0;
        for (int i = numberFrom; i <= numberTo; i++) sumSeq = sumSeq + i;

        System.out.println("The sum is " + sumSeq);
    }
}
