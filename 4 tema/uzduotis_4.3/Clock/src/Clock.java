public class Clock {

    public static void main(String[] args) {

        String hour, minute;

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {

                if (i < 10) hour = "0" + i;
                else hour = "" + i;

                if (j < 10) minute = "0" + j;
                else minute = "" + j;

                System.out.println(hour + ":" + minute);
            }
        }

    }
}
