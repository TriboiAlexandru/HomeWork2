package methods.sumTheDigitsInAnInteger;

import java.util.Scanner;

public class SumOfIntegers {


    public static int sumDigits(long n) {

        int i, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        long number = s.nextLong();

        while (n > 0) {
            i = (int) n % 10;
            sum = sum + i;
            n = n / 10;
        }
        System.out.println("Sum of Digits:" + sum);
        return sum;
    }
}




