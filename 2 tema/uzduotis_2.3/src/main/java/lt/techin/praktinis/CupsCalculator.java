package lt.techin.praktinis;

public class CupsCalculator {

    public void calculateCups(int numberOfCups) {
        int numberDeziu = numberOfCups/3;
        int numberLieka = numberOfCups- numberDeziu*3;

        System.out.println("Dėžių: " + numberDeziu );
        System.out.println("Liko puodelių: " + numberLieka);
    }

}
