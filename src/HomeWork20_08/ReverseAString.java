package HomeWork20_08;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {

        System.out.println("Enter string to reverse:");


        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        StringBuffer buffer = new StringBuffer(str);
            buffer.reverse();
            System.out.println(buffer);
        }
    }
