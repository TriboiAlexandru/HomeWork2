


package phoneKeyPad;

import java.util.Scanner;

public class phoneKeyPad {
    public static void main(String[] args) {

        System.out.print("Enter a letter: ");
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);

//        char chLowerCase = Character.toLowerCase(ch);
        if (Character.isAlphabetic(ch)) {


            switch (ch) {
                case 'a':
                case 'b':
                case 'c':
                    System.out.println("%s The corespunding nomber is 2");
                    break;
                case 'd':
                case 'e':
                case 'f':
                    System.out.println(" The corespunding nomber is 3");
                    break;


                    default:
                        System.out.printf("%s is not a Letter", ch);
                        break;
                }
            }
        }
    }
