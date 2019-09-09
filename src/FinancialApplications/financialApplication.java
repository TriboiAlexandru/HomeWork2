package FinancialApplications;

import java.util.Scanner;




public class financialApplication {
    public static void main(String[] args) {
//        double subtotal ;
//        double gratuity;
        double gratuityRate;
        double total;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter subtotal and gratuity");
        double subtotal = scanner.nextDouble();
        double gratuity= scanner.nextDouble();
        gratuityRate= (subtotal/100)*gratuity;
        System.out.printf("gratuity is $%.1f\n",gratuityRate);
        total =subtotal+gratuityRate;
        System.out.printf("total is $%.1f", total);




    }


}
