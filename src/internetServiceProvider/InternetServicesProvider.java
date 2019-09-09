package internetServiceProvider;

import java.util.Scanner;

public class InternetServicesProvider {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int totalHours, regularHours, additionalHours ;
        double monthlyFee, additionalHoursFee, totalFee;


        System.out.println("Enter the letter of package purchased (either A, B, or C.");
        char ch = in.next().charAt(0);
        System.out.println("Enter the number of hours used");

        totalHours = in.nextInt();


        switch (ch) {
            case 'A':
            case 'a':
                monthlyFee = 9.95;
                regularHours = 10;
                additionalHours = totalHours-regularHours;
                additionalHoursFee = additionalHours * 2.00;
                totalFee = monthlyFee + additionalHoursFee;
                System.out.printf("The total charges is $%5.2f", totalFee );
                break;
            case 'B':
            case 'b':
                monthlyFee = 13.95;
                regularHours = 20;
                additionalHours = totalHours-regularHours;
                additionalHoursFee = additionalHours * 1.00;
                totalFee = monthlyFee + additionalHoursFee;
                System.out.printf("The total charges is $%5.2f", totalFee );
                break;
            case 'C':
            case 'c':
                monthlyFee = 19.95;

                System.out.printf("The total charges is $%5.2f", monthlyFee );
                break;
                default:
                    System.out.println("Eror");
        }
    }
}
