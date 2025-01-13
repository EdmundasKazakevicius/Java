package lt.techin.praktinis;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {3, 2, 1, 4, 6, 5};

        int minMark = getMin(arr);
        System.out.printf("Min mark: %d\n", minMark);

    }

    //Metodas turi grąžinti pirmą masyvo elementą
    public static int getFirstElement(int[] arr) {
        //TODO
        return arr[0];
    }

    //Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {
        //TODO
        return arr[arr.length - 1];
    }

    //Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
        //TODO
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) if (arr[i] < min) min = arr[i];
        return min;
    }

    //Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        //TODO
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) if (arr[i] > max) max = arr[i];
        return max;
    }

    //Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        //TODO
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) sum = sum + arr[i];
        return sum;
    }

    //Raskite masyvo elementų vidurkį
    public static double getAverage(int[] arr) {
        //TODO
        int sum = getSum(arr);
        return 1.0 * sum / arr.length;
    }


    //Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        //TODO
        int howMany = 0;
        for (int i = 0; i < arr.length; i++) if (arr[i] > n) howMany++;
        return howMany;
    }

    //Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        //TODO
        boolean isThere = false;
        for (int i = 0; i < arr.length; i++) if (arr[i] == n) isThere = true;
        return isThere;
    }

    //Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        //TODO
        int witchThere = -1;
        for (int i = 0; i < arr.length; i++) if (arr[i] == n) witchThere = i;
        return witchThere;
    }


}
