package LoopExercises;

import java.util.Scanner;

public class CumulativesSumOfEntriesDate {
    public static void main(String[] args) {


//        Scanner in = new Scanner(System.in);
//        int total;
//        int sum =0;
//
//       System.out.println("Enter a number");
//        int number = in.nextInt();
//
//
//       if (number > 0) {
//           System.out.println("Enter your next number");
//           int newnomber = in.nextInt();
//           sum+=newnomber;
//           System.out.printf("The total is %d", sum);
//
//       } else {
//           System.out.println("end");
//       }
//

//        total+= newnomber;
//        System.out.printf("The total is %d", total);

//        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            int sum = 0;
            boolean notZero = true;
            do {
                System.out.println("enter an integer: -> ");
                int number = in.nextInt();
                if (number != 0) {
                    sum += number;
                    System.out.println(sum);
                } else {
                    notZero = false;
                    System.out.println("end");
                }
            } while (notZero);
        }
    }


//        }
//    }
