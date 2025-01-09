import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // OK

        System.out.println("Enter x1:");
        Double point1_x = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter y1:");
        Double point1_y = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter x2:");
        Double point2_x = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter y2:");
        Double point2_y = Double.parseDouble(scanner.nextLine());

        Double distance = Math.sqrt(Math.pow((point2_x - point1_x), 2) + Math.pow((point2_y - point1_y), 2));

        System.out.println("The distance between two points is: " + distance);

    }
}
