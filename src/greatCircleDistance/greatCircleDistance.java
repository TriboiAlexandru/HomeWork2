package greatCircleDistance;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class greatCircleDistance {

    public static void main(String[] args) {

        double radius = 6371.01;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter point 1(latitude and logitude) in degrees");

        double x1= in.nextDouble();
        double y1 = in.nextDouble();
        System.out.println("Enter point 2(latitude and logitude) in degrees");
        double x2= in.nextDouble();
        double y2 = in.nextDouble();
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);

        double d = radius * Math.acos((Math.sin(x1))* Math.sin(x2)+ Math.cos(x1)* Math.cos(x2)* Math.cos(y1-y2));
        System.out.printf("The distance between 2 point is %f", d);

    }
}
