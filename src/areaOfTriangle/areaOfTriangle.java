package areaOfTriangle;

import java.util.Scanner;


public class areaOfTriangle {
    public static void main(String[] args) {

// double area;

        Scanner in= new Scanner(System.in);
        System.out.println("Enter trhee point of triangle");

        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();

        double side2 = Math.sqrt( Math.pow((x2-x1), 2)+ (Math.pow ((y2-y1), 2)));
        double side1 = Math.sqrt( Math.pow((x1-x3), 2)+ (Math.pow ((y1-y3), 2)));
        double side3 = Math.sqrt( Math.pow((x3-x2), 2)+ (Math.pow ((y3-y2), 2)));

        double s = ((side1+side2+side3)/2);

       double area= Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

        System.out.printf("The aria of triangle is %5.2f", area);



    }
}
