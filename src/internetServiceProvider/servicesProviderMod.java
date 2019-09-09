//package internetServiceProvider;
//
//import java.util.Scanner;
//
//public class servicesProviderMod {
//
//    private static final double REGULAR_HOURS_A_COEFICIENT =10;
//    private static final double REGULAR_HOURS_B_COEFICIENT =20;
//    private static final double MONTHLY_FEE_A_COEFICIENT =9.95;
//    private static final double MONTHLY_FEE_B_COEFICIENT =13.95;
//    private static final double MONTHLY_FEE_C_COEFICIENT =19.95;
//
//
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//
//        int totalHours, regularHoursA, regularHoursB, regularHoursC, additionalHours;
//        double monthlyFeeA, monthlyFeeB, monthlyFeeC, additionalHoursFee, totalFeeA,totalFeeB,totalFeeC, difference;
//
//
//        System.out.println("Enter the letter of package purchased (either A, B, or C.");
//        char ch = in.next().charAt(0);
//        System.out.println("Enter the number of hours used");
//
//        totalHours = in.nextInt();
//
//
//        switch (ch) {
//            case 'A':
//            case 'a':
//                monthlyFeeA = 9.95;
//                regularHoursA = 10;
//                additionalHours = totalHours - regularHoursA;
//                additionalHoursFee = additionalHours * 2.00;
//                totalFeeA = monthlyFeeA + additionalHoursFee;
//
//                System.out.printf("The total charges is $%5.2f", totalFeeA);
//                difference = (((totalHours - regularHoursA) * 2) + monthlyFeeA) - MONTHLY_FEE_B_COEFICIENT;
//                break;
//
//            if (totalFeeA > monthlyFeeB) {
//                double differenceB= difference;
//            } else
////            difference = (((totalHours - regularHoursA) * 2) + monthlyFeeA) - MONTHLY_FEE_B_COEFICIENT;
//
//            {
//
////                    difference =(regularHoursB-regularHoursA);}
//                switch (ch) {
//                    case 'B':
//                    case 'b':
//                        monthlyFeeB = 13.95;
//                        regularHoursB = 20;
//                        additionalHours = totalHours - regularHoursB;
//                        additionalHoursFee = additionalHours * 1.00;
//                        totalFeeB = monthlyFeeB + additionalHoursFee;
//                        System.out.printf("The total charges is $%5.2f", totalFeeB);
//                        break;
//                    case 'C':
//                    case 'c':
//                        monthlyFeeC = 19.95;
////                regularHours = 20;
////                additionalHours = totalHours-regularHours;
////                additionalHoursFee = additionalHours * 1.00;
////                totalFee = monthlyFee + additionalHoursFee;
//                        System.out.printf("The total charges is $%5.2f", monthlyFeeC);
//                        break;
//                    default:
//                        System.out.println("Eror");
//                }
//            }
//        }
//
//
//    }
//    }