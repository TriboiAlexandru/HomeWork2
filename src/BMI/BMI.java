package BMI;

import javax.xml.bind.SchemaOutputResolver;
import java.net.SocketOption;
import java.util.Scanner;

public class BMI {

    private static final double INCHES_COEFICIENT=12;
    private static final double METERS_COEFICIENT=0.0254;
    private static final double KG_COEFICIENT=2.2;
    static double kg;
    static double feet;
    static double meters;
    static double bmi;

    public static void main (String [] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter your height in inches ");
        int inch = scanner.nextInt();

        feet = inch / INCHES_COEFICIENT;
        meters = inch * METERS_COEFICIENT;

        System.out.printf("%d feet %.0f and inches\n", (int)feet, inch % INCHES_COEFICIENT);
        System.out.printf("%d meters %d and cm\n", (int)meters, fraction(meters, 2));

        System.out.println("Enter your weight in pounds");
        int pounds = scanner.nextInt();

        kg  = pounds / KG_COEFICIENT;

        System.out.printf("%d kg and %d grams\n", (int)kg, fraction(kg, 3) );

        bmi = kg /Math.pow(meters, 2);
        System.out.printf("Your BMI %.2f", bmi);
    }

    private static int fraction(double x, int digit) {

        int number = (int) x;
        return (int) ((x - number) * Math.pow(10, digit));
    }


}

