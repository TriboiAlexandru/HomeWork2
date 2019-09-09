package vowelConsonat;

import java.util.Scanner;

public class vowelConsonant {

    public static void main(String[] args) {
        String vowels = "ayeiou";
        String consonants = "bcdfghjklmnpqrstvxzwy";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Imput:");
        char ch = scanner.next().charAt(0);

        char chLowerCase = Character.toLowerCase(ch);

        if (vowels.indexOf(chLowerCase) > 0) {
            System.out.println(ch + "is vowel");
        } else if (consonants.indexOf(chLowerCase) >= 0) {
            System.out.println(ch + " is consonants");
        } else {
            System.out.println(ch + " is not letter");
        }
    }
}