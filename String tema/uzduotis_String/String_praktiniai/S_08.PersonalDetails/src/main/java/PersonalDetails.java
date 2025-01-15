
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPersons = 0;
        String longestName = "";
        double sumAges = 0;

        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.equals("")) break;

            String[] details = sentence.split(",");
            int yearofBirth = Integer.valueOf(details[1]);

            sumAges = sumAges + yearofBirth;
            numberPersons++;

            String personName = details[0];
            if (personName.length() > longestName.length()) {
                longestName = personName;
            }
        }

        double average = sumAges / numberPersons;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);

    }
}
