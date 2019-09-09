package NumberYear;

import java.util.Scanner;


public class NumberYear {


    private static final double DAY_COEFICIENT = 1440;
    private static final long YEAR_CCOEFICIENT = 365;
    private static final double MINUTES_COEFICIENT = 60;

    static double minutes;
    static double hour;
    static double day;
    static double year;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the number of minutes ");

        long n = scanner.nextInt();

        int year = (int) (n / (YEAR_CCOEFICIENT * DAY_COEFICIENT));
        long daysInMinutes = n - (year * (int) (YEAR_CCOEFICIENT * DAY_COEFICIENT));
        int days = (int) (daysInMinutes / DAY_COEFICIENT);


        System.out.print(minutes);
        System.out.printf(" minutes is aproximatly %d years and %d days", year, days);
    }
}
