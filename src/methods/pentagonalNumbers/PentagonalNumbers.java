package methods.pentagonalNumbers;

import java.util.Scanner;

public class PentagonalNumbers {


    public static void main(String[] args) {
        System.out.println("The first 100 pentagonal number is:");
        int n;
        for (n = 1; n <= 100; n++) {
            System.out.printf("%7d", getPentagonalNumber(n));
            if (n % 10 == 0)
                System.out.println();
        }

    }

    public static int getPentagonalNumber(int n) {
        return (n * (3 * n - 1)) / 2;


    }
}
