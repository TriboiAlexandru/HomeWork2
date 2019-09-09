package LoopExercises;

import java.util.Scanner;

public class CountPositiveAndNegativeNumbers {
    public static void main(String[] args) {

        int numbers;
        int total = 0;
        double average = 0;
        int positive = 0;
        int negative = 0;
        int count = 0;

        Scanner input = new Scanner(System.in);

        // initial input and continue until 0 is entered
        System.out.print ("Enter an int value (The program exits if the input is 0): ");
        numbers = input.nextInt();


        while (numbers != 0) {
            total += numbers; //add input to running total
            count++;
            if (numbers <0) { negative++; }//count positive by adding 1 to the count
        else {positive++;} //count negative integers
            System.out.print ("Enter your next number: ");
            numbers = input.nextInt();
        }

        // end result of user input

        average = ((double)total) / count;
        System.out.println ("The number of positives is " + positive);
        System.out.println ("The number of negatives is " + negative);
        System.out.println ("The total is " + total);
        System.out.println ("The average is " + average);



    }
}
