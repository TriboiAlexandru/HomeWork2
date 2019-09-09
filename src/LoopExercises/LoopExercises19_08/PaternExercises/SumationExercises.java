package LoopExercises.LoopExercises19_08.PaternExercises;

public class SumationExercises {
    public static void main(String[] args) {

        double sum = 0.0;
        double n = 1.0;

        for ( n=1.0; n <= 624.0; n ++) {
            sum += 1 / (Math.sqrt(n) + Math.sqrt(n + 1));
        }



         System.out.println("Sum of sumation: " + sum);
    }
}
