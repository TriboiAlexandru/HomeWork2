package faGramCalculator;

import java.util.Scanner;

public class FatGramCalculator {
    public static void main(String[] args) {


        Scanner in = new Scanner (System.in);


        double fatGrams;
        double calories;
        double percent;


        System.out.print("Enter the amount of fat grams: ");
        fatGrams = in.nextDouble();

        System.out.print("Enter the amount of calories: ");
        calories = in.nextDouble();



            percent = (fatGrams * 9) / calories;

                        System.out.printf("The percent of calories is %5.2f ", percent);
            {
                if (percent <30)

                System.out.println("This food is low fat");
                else
                    System.out.println("This food is too fat");







            }

        }
    }


