package LoopExercises;

import java.util.Scanner;

public class FindTheHighestScoreOfStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students are there? ");
        int numberOfStudent = input.nextInt();

        String topStudentName = "";
        int topStudentScore = 0;

        String runnerStudentName = "";
        int runnerStudentScore = 0;


        for (int i = 0; i < numberOfStudent; i++)
        {

            System.out.print("What is the student's name: ");
            String studentName = input.next();

            System.out.print("What is the student's score: ");
            int studentScore = input.nextInt();


            if (studentScore > topStudentScore) {
                runnerStudentName = topStudentName;
                runnerStudentScore = topStudentScore;

                topStudentName = studentName;
                topStudentScore = studentScore;
            }

            else if (studentScore > runnerStudentScore) {
                runnerStudentName = studentName;
                runnerStudentScore = studentScore;
            }
        }


        System.out.printf("The best student is %s, and the score is %2d.",
                topStudentName, topStudentScore);
    }
}