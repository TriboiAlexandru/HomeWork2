package inchesInFeet;


import java.util.Scanner;

public class inchesInFeet {


      private static final int INCHES_COEFICIENT=12;


        public static void main (String [] arg){
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Enter your height in inches ");
            int inch = scanner.nextInt();
            int feet = inch/INCHES_COEFICIENT;
            int remainingInches = inch % 12;

            int result = inch - (int)inch/ INCHES_COEFICIENT;
            System.out.printf(feet + " feet and "+"" + remainingInches + " inches");
        }


    }


