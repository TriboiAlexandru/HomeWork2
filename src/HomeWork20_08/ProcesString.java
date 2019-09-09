package HomeWork20_08;

import java.util.Scanner;

public class ProcesString {

    public static void main(String[] args) {
        System.out.println("Write your string:");
        Scanner read = new Scanner(System.in);
        String s = read.nextLine();

        for (int i = 0; i < s.length(); i+=2) {

            String odd = "";
            if (i % 2 == 0)
                odd += s.charAt(i);
            System.out.print(" " + odd);
            }


        }
    }



