
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
//			System.out.println("Enter string:");
            String sentence = scanner.nextLine();

            if (sentence.equals("")) {
//          System.out.println("halted");
                break;
            }
            String[] words = sentence.split(" ");

            for (int i = 0; i < words.length; i++) {

                System.out.println(words[i]);

            }

        }

    }
}
