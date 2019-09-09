package ascii;

import java.io.IOException;
import java.util.Scanner;

public class CharToAscii {
//    public static void main(String[] args) {
public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your character");

        char ch = (char) System.in.read();
        int unicodeVal = Character.getNumericValue(ch);
        System.out.println(unicodeVal);
    }
}
