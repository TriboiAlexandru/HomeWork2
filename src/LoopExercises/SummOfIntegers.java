package LoopExercises;

import java.util.Scanner;

public class SummOfIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your first nomber");
        int number =  in.nextInt();

        System.out.println("Entere your 2-nd nomber");
        int number2 = in.nextInt();



        int summ= 0;
        for(int i =number; i<=number2 ; i++ )
            summ+=i;
        System.out.printf("The summ of Integer between your nomber  is: %d", summ);

    }
}
