import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }

            System.out.println("Pages:");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.println("Publication year:");
            int yearOfPublication = Integer.parseInt(scanner.nextLine());
            Book bookList1 = new Book(title, pages, yearOfPublication);
            bookList.add(bookList1);
        }

        System.out.println("What information will be printed?");
        String enteredText = scanner.nextLine();

        for (int i = 0; i < bookList.size(); i++) {
            Book list = bookList.get(i);
            if (enteredText.equals("everything")) {
                System.out.println(list.getTitle() + ", " + list.getPages() + " pages, " + list.getYearOfPublication());
            } else if (enteredText.equals("name")) {
                System.out.println(list.getTitle());
            } else if (enteredText.equals("pages")) {
                System.out.println(list.getPages());
            } else if (enteredText.equals("yearOfPublication")) {
                System.out.println(list.getYearOfPublication());
            }
        }


    }
}
