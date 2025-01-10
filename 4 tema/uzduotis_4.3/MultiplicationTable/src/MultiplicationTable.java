public class MultiplicationTable {
    public static void main(String[] args) {


        System.out.println("Multiplication Table");
        System.out.print("   ");
        for (int i = 1; i <= 9; i++) System.out.print("   " + i);
        System.out.println("");

        System.out.print("---");
        for (int i = 1; i <= 9; i++) System.out.print("----");
        System.out.println("--");

        for (int i = 1; i <= 9; i++) {
            System.out.print(" " + i + " |");

            for (int j = 1; j <= 9; j++) {
                int multiplication = i * j;
                if (multiplication < 10) System.out.print("   " + multiplication);
                else
                    System.out.print("  " + multiplication);
            }
            System.out.println("");
        }
    }
}