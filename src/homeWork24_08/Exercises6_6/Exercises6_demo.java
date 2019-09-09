package homeWork24_08.Exercises6_6;

import java.util.Scanner;

public class Exercises6_demo {

    public static void main(String[] args) {

        Exercises6 ex = new Exercises6();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        ex.addNumber(input.nextInt());
        ex.displayPattern(1);

        System.out.print("Enter the second number: ");
        ex.addNumber(input.nextInt());
        ex.displayPattern(2);

        System.out.print("Enter the third number: ");
        ex.addNumber(input.nextInt());
        ex.displayPattern(3);

    }
}
