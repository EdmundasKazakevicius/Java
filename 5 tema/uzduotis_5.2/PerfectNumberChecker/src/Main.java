public class Main {
    public static void main(String[] args) {
        System.out.println(isPerfect(6));
        System.out.println(isPerfect(15));
    }

    public static boolean isPerfect(int number) {

        int sumOfDivisors = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) sumOfDivisors = sumOfDivisors + i;
        }
        if (sumOfDivisors == number) return true;
        else return false;

    }
}