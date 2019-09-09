package DHMS;

import java.util.Scanner;

public class DHMS {
//    Writie the program that asks the user to enter the number of seconds as an  integer value (use type long)
//    and that then displays the equivalet time in days, hours, minutes, and secons. Use symbilic constants
//    to represent the number of hours in th day, the numerber of minutes in an hour, and the nomber of seconds in a minutes.


    private static final double MINUTES_COEFICIENT = 60;
    private static double HOURS_COEFICIENT = 60;
    private static final double DAY_COEFICIENT = 24;
    private static final long SECONDS_CCOEFICIENT = 3600;
    static double minutes;
    static double hour;
    static double day;
    static double seconds;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter your nomber ");
        long n = scanner.nextInt();

        int day = (int) (n / (DAY_COEFICIENT* SECONDS_CCOEFICIENT));

        n = (int) (n % (HOURS_COEFICIENT * SECONDS_CCOEFICIENT));
        int hour = (int) (n / SECONDS_CCOEFICIENT);

        n %= SECONDS_CCOEFICIENT;
        int minutes = (int) (n / MINUTES_COEFICIENT);

        n %= MINUTES_COEFICIENT;
        int seconds = (int) n;

        System.out.printf("%d day %d hours %d minutes %d seconds", day, hour, minutes,seconds);
    }
}
