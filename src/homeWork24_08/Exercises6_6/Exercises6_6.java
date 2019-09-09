package homeWork24_08.Exercises6_6;

import java.util.Scanner;

public class Exercises6_6 {
    public static class Prog17 {
        public static void main(String[] args) {
//Create a scanner
            Scanner input = new Scanner(System.in);
//Prompt the user to enter three numbers, in double
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();
            System.out.print("Enter the third number: ");
            int num3 = input.nextInt();
            System.out.println("The numbers in ascending order are: ");
            PaternforExercises6_6.DisplayPattern(num1, num2, num3);

        }
//Put the numbers in order
        public static void displaySortedNumbers(double num1, double num2, double num3) {
            if ( (num1 < num2) && (num1 < num3) ) {
                System.out.print(num1);
                if (num2 < num3)
                System.out.println(" " + num2 + " " + num3);
  else
                System.out.println(" " + num3 + " " + num2);
            }
else if ( (num2 < num1) && (num2 < num3) ) {
                System.out.print(num2);
                if (num1 < num3)
                System.out.println(" " + num1 + " " + num3);
 else
                System.out.println(" " + num3 + " " + num1);
            }
else if ( (num3 < num1) && (num3 < num2) ) {
                System.out.print(num3);
                if (num1 < num2)
                System.out.println(" " + num1 + " " + num2);
 else
                System.out.println(" " + num2 + " " + num1);
            }
        }
    }

}

//  System.out.println("Pattern C");
//          for (int r = 1; r <= 6; r++) {
//          for (int c = 1; c <= 6-r; c++) {
//          System.out.print("  ");
//          }
//          for (int j = 1; j <= r; j++) {
//          System.out.print(j + " ");
//          }
//          System.out.println();
//          }
//          }
//          }