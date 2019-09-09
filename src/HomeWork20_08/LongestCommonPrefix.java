package HomeWork20_08;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println("Enter the first string:");
        Scanner read = new Scanner(System.in);
        String str1 = read.nextLine();
        System.out.println("Enter the second string:");
        Scanner read2 = new Scanner(System.in);
        String str2 = read.nextLine();
        String result = "";


        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i))
                break;
            else
                result += str1.charAt(i);


        }
        if (result.length() > 0)
            System.out.println("The commmon prefix is " + result);
        else
            System.out.println(str1 + " and " + str2 +
                    " have no commmon prefix");

    }
}

