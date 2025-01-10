public class Main {

    public static void main(String[] args) {
        System.out.println(digitSum(123));
    }

    public static int digitSum(int number) {
// Write your code here...
        int forReturn = 0;
        int ending = number;

        do {
            forReturn = forReturn + ending % 10;
            ending = ending / 10;
        } while (ending != 0);
        return forReturn;
    }
}