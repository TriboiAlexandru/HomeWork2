package LoopExercises;

import java.util.Scanner;

public class MultiplicationTabe {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int number, counter, total;
        System.out.println("Enter the number");
        number = in.nextInt();
        System.out.println("Enter the range");
        counter = in.nextInt();

        for (int i=0; i<=counter; i++){
            total = number*i;
            System.out.println(number+ "x" + i+ "=" + total);
        }

    }
}
