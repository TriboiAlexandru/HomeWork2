package LoopExercises.LoopExercises19_08.PaternExercises;

public class PaternExercisesD {
    public static void main(String[] args) {


        System.out.println("Pattern D");
        for (int r = 1; r <= 6; r++) {
            for (int c = r; c > 1; c--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 7 - r; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}



