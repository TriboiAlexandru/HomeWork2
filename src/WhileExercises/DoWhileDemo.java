package WhileExercises;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exitSelected = false;
        String phrase = "";

        do{
            System.out.println("Enter a phrase>");
            phrase = in.nextLine();
            if (phrase.toUpperCase().equals("exit")) {
                exitSelected = true;
            } else {
                System.out.println("Entered ["+phrase+"}");
            }

        }while (exitSelected==false);

        System.out.println("While example");
        exitSelected = false;


    }
}
