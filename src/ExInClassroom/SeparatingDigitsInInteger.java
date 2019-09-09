package ExInClassroom;

import java.util.Scanner;

public class SeparatingDigitsInInteger {
    public static void main(String[] args) {
        int fiveDigitsInteger;

        int firstDigit;
        int secondDigit;
        int thirdDigit;
        int fourthDigit;
        int fifthDigit;

        Scanner in = new Scanner(System.in);
        System.out.println("Write five digit nomber");
        fiveDigitsInteger = in.nextInt();




        fifthDigit = fiveDigitsInteger % 10;
        fourthDigit = (fiveDigitsInteger / 10) %10;
        thirdDigit = (fiveDigitsInteger /100)% 10;
        secondDigit = (fiveDigitsInteger /1000)% 10;
        firstDigit = (fiveDigitsInteger /10000)% 10;


        System.out.println(fifthDigit);
        System.out.println(fourthDigit);
        System.out.println(thirdDigit);
        System.out.println(secondDigit);
        System.out.println(firstDigit);


    }
}
