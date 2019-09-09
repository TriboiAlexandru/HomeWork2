package LoopExercises.LoopExercises19_08.PaternExercises;

public class PaternExercisesB {
    public static void main(String[] args) {


        System.out.println("Pattern B");
        for (int r = 6; r >= 1; r--) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

