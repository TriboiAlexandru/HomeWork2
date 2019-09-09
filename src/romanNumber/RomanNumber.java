package romanNumber;

import java.util.Scanner;

public class RomanNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        int number;
        System.out.println("Enter your number");
        int n = in.nextInt();

        switch (n) {
           case 1:

                System.out.println(" The corespunding nomber is I");
                break;

            case 2:
                System.out.println(" The corespunding nomber is II");
                break;
            case 3:
                System.out.println(" The corespunding nomber is III");
                break;
            case 4:
                System.out.println(" The corespunding nomber is IV");
                break;
            case 5:
                System.out.println(" The corespunding nomber is V");
                break;
            case 6:
                System.out.println(" The corespunding nomber is VI");
                break;
            case 7:
                System.out.println(" The corespunding nomber is VII");
                break;
            case 8:
                System.out.println(" The corespunding nomber is VIII");
                break;
            case 9:
                System.out.println(" The corespunding nomber is IX");
                break;
            case 10:
                System.out.println(" The corespunding nomber is X");
                break;




            default:
                System.out.println(" Error");
                break;

        }
    }
}
