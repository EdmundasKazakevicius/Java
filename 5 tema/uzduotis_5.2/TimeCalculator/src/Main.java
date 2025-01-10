public class Main {

    public static void main(String[] args) {
        System.out.println(minutesToTime(185));
    }

    public static String minutesToTime(int minutes) {

        int howManyHours = minutes / 60;
        int howManyMinutes = minutes % 60;

        String forReturn = "" + howManyHours + " hours and " + howManyMinutes + " minutes";

        return forReturn;
    }
}