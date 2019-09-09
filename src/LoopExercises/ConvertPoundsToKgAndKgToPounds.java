package LoopExercises;

public class ConvertPoundsToKgAndKgToPounds {

    private static final double POUNDS_COEFICIENT = 2.2;
    private static final double KG_COEFICIENT = 9.09;

    public static void main(String[] args) {


        System.out.printf("%-14s%-10s%-5s%-10s%-10s\n", "Kilograms", " Pounds", "|", "Pounds", "Kilograms");

//        double i=1;
//        double j=20;
//         do {
//
//             double Kg = (int) (i * POUNDS_COEFICIENT);
//             i += 2;
//             System.out.printf("%-15s%5.1f\n", i, Kg);
//             double pounds = j * KG_COEFICIENT;
//             j+=5;
        for (int i=1, j=20; i<=200; i+=2, j+=5) {
            double Kg =i* 2.20462;
            double pounds =j* 0.453592;

            System.out.printf("%-15d%-14.2f%-10d%-10.2f\n", i, Kg, j, pounds);
        }

//         } while (i<200 && j<515);
//         do {
//             double pounds = j * KG_COEFICIENT;
//             j+=5;
//            System.out.printf("%-15%-30s%5.1f\n", j, pounds);
//         }while ( j<=515);
//        System.out.printf("%-15%-30s%5.1f\n", j, pounds);
//        for (int i = 1; i <= 200; i += 2 ) {
//            double Kg= i*POUNDS_COEFICIENT;
//            System.out.printf("%-15s%5.1f", i, Kg);
//            for (int j = 20; j <= 515; j += 5) {
//                double pounds= j*KG_COEFICIENT;
//                System.out.printf("%-15s%-14s\n",j, pounds);}
//                System.out.printf("%-15d%-14d%-10d\n", i, Kg,j, pounds);}
//            for (int j = 20; j <= 515; j += 5) {
//                System.out.printf("%-30s%-5.1f\n", j, (j * KG_COEFICIENT));
            }

//            System.out.printf("%15s%-5.1f\n", i, (i * POUNDS_COEFICIENT));}


//                System.out.printf("%-15s%-5.1f\n\", j, (j * K)");}
        }



//}



