package lt.techin.praktinis;

public class NumberReverter {
    public void revert(int number) {
        // Write your program here

        int number1 = number/100;
        int number3 = number%10;
        int number2 = (number-number1*100)/10;

        number = number3*100 + number2*10 + number1;

        System.out.println(number);
    }
}
