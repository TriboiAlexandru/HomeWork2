package SumDigit;

import java.util.Scanner;

public class SumDigit {

    public static void main(String[] args) {
        int threeDigitInteger;

        int firstDigit;
        int secondDigit;
        int thirdDigit;
        int summ;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your  nomber between 0 and 1000");
        threeDigitInteger = in.nextInt();



        thirdDigit =  threeDigitInteger % 10;
        secondDigit = (threeDigitInteger / 10) %10;
        firstDigit = (threeDigitInteger /100)% 10;
        summ = thirdDigit+secondDigit+firstDigit;
        System.out.printf("The summ of all digit is %d", summ);


    }
}
