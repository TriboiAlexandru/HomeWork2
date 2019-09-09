package vowelConsonat;

import java.util.Scanner;

public class vowelConsonat1 {

        public static void main(String[] args) {
            System.out.println("Enter a letter: ");
            Scanner in = new Scanner(System.in);
            char ch = in.next().charAt(0);
            if (Character.isAlphabetic(ch)) {
                if (ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.printf("%s is vowel", ch);
                } else {
                    System.out.printf("%s is consonant", ch);
                }

            } else {
                System.out.printf("%s is not a Letter", ch);
            }
        }
    }

