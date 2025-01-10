public class Main {
    public static void main(String[] args) {
        System.out.println(convertTemp(25));
    }

    public static String convertTemp(double celsius) {
// Write your code here...

        double temperatureFarenheit = celsius * 1.0 * 9 / 5 + 32;

        String forReturn = "" + celsius + "°C is equal to " + temperatureFarenheit + "°F";

        return forReturn;
    }
}