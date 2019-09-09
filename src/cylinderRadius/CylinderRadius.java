package CylinderRadius;

import java.util.Scanner;

public class CylinderRadius {
    public static void main(String[] args) {

    double area;
    double volume;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Radius and Lenght of Cylinder");
        double radius= scanner.nextDouble();
        double lenght= scanner.nextDouble();

        area= Math.pow(radius, 2)* Math.PI;
        volume = area*lenght;

        System.out.printf(" The area is %.4f\n The Volume is %.1f", area, volume);


    }
}
