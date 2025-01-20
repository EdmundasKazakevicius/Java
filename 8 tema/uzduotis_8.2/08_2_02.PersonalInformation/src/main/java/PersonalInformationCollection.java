
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First name:");
            String nameFirst = scanner.nextLine();
            if (nameFirst.equals("")) { break; }

            System.out.println("Last name:");
            String nameLast = scanner.nextLine();

            System.out.println("Indentification number:");
            String nameID = scanner.nextLine();

            PersonalInformation person = new PersonalInformation(nameFirst, nameLast, nameID);
            infoCollection.add(person);
        }

        for (int i = 0; i < infoCollection.size(); i++) {
            PersonalInformation person = infoCollection.get(i);
            System.out.println(person.getFirstName()+ " " + person.getLastName());
        }



    }
}
