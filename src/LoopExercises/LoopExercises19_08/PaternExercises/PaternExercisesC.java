package LoopExercises.LoopExercises19_08.PaternExercises;

public class PaternExercisesC {
    public static void main(String[] args) {

        System.out.println("Pattern C");
        for (int r = 1; r <= 6; r++) {
            for (int c = 1; c <= 6-r; c++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= r; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

