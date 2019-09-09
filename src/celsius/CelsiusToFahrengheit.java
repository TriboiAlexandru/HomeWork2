package celsius;

import java.util.Scanner;

public class CelsiusToFahrengheit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius");

        double celsius = scanner.nextDouble();
        double fahrenheit = (int) (9.0/5 * celsius + 32);

        System.out.printf("%d celsius is  %.1f Fahrenheit", (int) celsius, fahrenheit);


    }
}
