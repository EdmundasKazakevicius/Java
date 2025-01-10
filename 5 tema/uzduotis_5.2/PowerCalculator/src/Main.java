public class Main {

    public static void main(String[] args) {
        System.out.println(calculatePower(2, 3));
    }

    public static int calculatePower(int base, int exponent) {
// Write your code here...
        int forReturn = 1;

        if (exponent == 0)
            forReturn = 0;
        else
            for (int i = 1; i <= exponent; i++) forReturn = forReturn * base;

        return forReturn;
    }
}