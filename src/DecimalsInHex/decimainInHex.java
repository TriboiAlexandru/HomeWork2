package DecimalsInHex;

import java.util.Scanner;

public class decimainInHex {

    public static class Exercise_04_11 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            System.out.print("Enter a decimal value (0 to 15): \n");
            int decimal = input.nextInt();
            Integer.toHexString(decimal);

            if (decimal >= 0 && decimal <= 15)
                System.out.printf( " The Hex value is %s",Integer.toHexString(decimal).toUpperCase());

           else
                System.out.println(decimal + " is an invalid input");
        }
    }
}
