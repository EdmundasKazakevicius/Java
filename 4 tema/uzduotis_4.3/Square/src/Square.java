public class Square {
    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) System.out.print("# ");

        System.out.println("");

        for (int j = 1; j <= 6; j++) {
            System.out.print("#");

            for (int k = 1; k <= 13; k++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
        for (int i = 1; i <= 8; i++) System.out.print("# ");
    }
}