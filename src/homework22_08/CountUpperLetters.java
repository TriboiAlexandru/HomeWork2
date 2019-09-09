package homework22_08;

import java.util.Scanner;

public class CountUpperLetters {
    public void CountUpperLetters(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string!");
        String s = scan.nextLine();

        int uppercase = 0, lowercase = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                uppercase++;
            } else if (Character.isLowerCase(s.charAt(i))) {
                lowercase++;

            }
        }
        System.out.println("Number of uppercase letter : " + uppercase);
        System.out.println("Number of lowercase: " + lowercase);
    }
}



