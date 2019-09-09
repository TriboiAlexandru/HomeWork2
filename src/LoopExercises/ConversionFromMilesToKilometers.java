package LoopExercises;

public class ConversionFromMilesToKilometers {
    public static void main(String[] args) {

        System.out.printf("%-14s%-10s%-5s%-10s%-10s\n", "Miles", " Kilometers", "|", "Kilometers", "Miles");


        for (int i = 1, j = 20; i <= 10; i ++, j += 5) {
            double Kilometers = i * 1.609;
            double Miles = j * 0.6215;

            System.out.printf("%-15d%-14.3f%-10d%-10.3f\n", i, Kilometers, j, Miles);
        }
    }
}