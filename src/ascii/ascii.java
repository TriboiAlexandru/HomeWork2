package ascii;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an ASCII code");

        int number = in.nextInt();
        char c = (char)number;
        System.out.printf("The character for ASCII code %d is %s", number, c);

    }
}
