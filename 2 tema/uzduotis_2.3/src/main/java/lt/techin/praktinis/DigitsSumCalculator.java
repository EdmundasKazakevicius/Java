package lt.techin.praktinis;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        // Write your program here

        int number1 = number / 1000;
        int number2 = (number - number1 * 1000) / 100;
        int number3 = (number - number1 * 1000 - number2 * 100) / 10;
        int number4 = number % 10;

        number = number1 + number2 + number3 + number4;

        System.out.println(number);

    }
}
