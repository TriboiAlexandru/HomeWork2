package LoopExercises;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean running=true;
        boolean imputIsIncorrect = true;
        Scanner in = new Scanner(System.in);
        char c = '0';

        while (running){

        }
            System.out.println("a - tree      b-apple");
            System.out.println("c - car       d- game");
            System.out.println("Enter a letter:");
            while (imputIsIncorrect){
             c = in.nextLine().toLowerCase().charAt(0);
            if (c=='a'|| c=='b' || c=='c' || c=='d') {


                imputIsIncorrect = false;
            } else if (c=='$'){
                imputIsIncorrect=false;
                running=false;
            } else System.out.println("Imput icorrect, enter a b c or d");
        }
            switch (c){
                case 'a':
                    System.out.println("tree");
                    break;
                case 'b':
                    System.out.println("apple");
                    break;
                case'c':
                    System.out.println("car");
                    break;

            }
    }

}
