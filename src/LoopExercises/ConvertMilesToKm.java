package LoopExercises;

import java.util.Scanner;

public class ConvertMilesToKm {
    private static final double MILES_COEFICIENT =1.609;
    public static void main(String[] args) {


        System.out.printf("%-15s%-30s\n", "Miles", " Kilometers");

        for (int i=1; i<=10; i++){
            System.out.printf("%-15s%-30s\n", i, (i * MILES_COEFICIENT));
        }

    }
}



