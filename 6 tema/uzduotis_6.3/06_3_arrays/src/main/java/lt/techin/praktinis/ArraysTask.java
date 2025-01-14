package lt.techin.praktinis;

import java.util.Arrays;
import java.util.Random;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        //int[] arr = {3, 2, 1, 4, 6, 5};
        //int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr = {9};

        int[] arrWithRemovedElement = removeElementAndReturnNewArray(arr, 0);
        System.out.println(Arrays.toString(arrWithRemovedElement));
//        int[] arrWithAddedElement = insertElementAndReturnNewArray(arr, 0, 8);
//        System.out.println(Arrays.toString(arrWithAddedElement));
//        System.out.println(Arrays.toString(arr));
//        int[] arrReversed = reverseArray(arr);
//        System.out.println(Arrays.toString(arrReversed));
//        int[] arrReversed2 = reverseInPlace(arr);
//        System.out.println(Arrays.toString(arrReversed2));
//        reverseInPlace(arr);
    }

    // Parašykite metodą, kuris sukuria nustatyto dydžio sveikųjų skaičių masyvą
    // ir užpildo jį atsitiktinai sugeneruotais skaičiais iš nurodyto intervalo.
    public static int[] generateRandomArray(int size, int min, int max) {

        int[] arr = new int[size];
        Random ran = new Random();
        for (int i = 1; i <= size; i++) arr[i - 1] = ran.nextInt(max - min + 1) + min;
        return arr;
    }


    //Parašykite metodą, kuris pašalintų masyvo arr[n] k-tąjį elementą (su indeksu k),
    //surašant reikiamus elementus į naują masyvą b[n-1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] removeElementAndReturnNewArray(int[] arr, int k) {

        System.out.println(Arrays.toString(arr));
        System.out.println(k);

//        if ((arr.length <= 1) || (k < 0) || (k >= arr.length - 1)) return null;
        if ((arr.length <= 1) || (k < 0) || (k > (arr.length - 1))) {
            System.out.println(arr.length);
            System.out.println(k);
            return null;
        }

        int[] arr1 = new int[arr.length - 1];

        for (int i = 0; i < k; i++) arr1[i] = arr[i];

        for (int i = k + 1; i < arr.length; i++) arr1[i - 1] = arr[i];

        System.out.println(Arrays.toString(arr1));
        return arr1;
    }

    //Parašykite metodą, kuris įterptų į masyvą arr[n] prieš k-tąjį elementą reikšmę x,
    //surašant reikiamus elementus į naują masyvą b[n+1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] insertElementAndReturnNewArray(int[] arr, int k, int x) {


        System.out.println(Arrays.toString(arr));

        if ((k < 0) || (k > arr.length - 1)) return null;
        int[] arr1 = new int[arr.length + 1];

        if (arr.length == 1) {
            arr1[0] = x;
            arr1[1] = arr[0];
//            System.out.println(Arrays.toString(arr1));
            return arr1;
        }

        for (int i = 0; i < k; i++) arr1[i] = arr[i];
        arr1[k] = x;
        for (int i = k + 1; i <= arr.length; i++) arr1[i] = arr[i - 1];
        return arr1;
    }

    //Parašykite metodą, kuris grąžintų duoto masyvo apverstą kopija.
    public static int[] reverseArray(int[] arr) {

        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) arr1[i] = arr[arr.length - 1 - i];
        return arr1;
    }

    //Parašykite metodą, kuris apverstu duotą masyvą (nekuriant naujo masyvo)
    public static void reverseInPlace(int[] arr) {


//        System.out.println(Arrays.toString(arr));

        int value;

        for (int i = 0; i < arr.length / 2; i++) {
            value = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = value;
        }

//        System.out.println(Arrays.toString(arr));

//        return arr;
    }


}
