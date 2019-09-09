package homeWork24_08.Exercises6_6.rockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner=new Scanner(System.in);
        String computerChoice;
        String userChoice;
        String winner ;
//        System.out.println(genarateComputerChoice(random));
        usersMenu();

        computerChoice=genarateComputerChoice(random);
        userChoice=getUserChoice(scanner);
        winner = choseWiner(computerChoice, userChoice);
        System.out.println("You chose : " + userChoice + "\nComputer chose: " + computerChoice);
        while (winner.equals("No winner won")) {
            System.out.println("It's the same choice, Please try again");
            usersMenu();
            computerChoice=genarateComputerChoice(random);
            userChoice=getUserChoice(scanner);
            winner = choseWiner(computerChoice, userChoice);
            System.out.println("You chose is: " + userChoice + "\nComputer chose: " + computerChoice);
            System.out.println(winner);
        }
        }






    public static String genarateComputerChoice(Random random) {
        int wordNumber;
        wordNumber = random.nextInt(3) + 1;
        String computerChoice = "";

        if (wordNumber == 1) {
            computerChoice = "rock";
        } else if (wordNumber == 2) {
            computerChoice = "paper";
        } else if (wordNumber == 3) {
            computerChoice = "scissors";
        }

        return computerChoice;


    }

    public static void usersMenu() {
        System.out.println("Users Menu:\n 1-rock\n 2-paper\n 3-scissors");
    }

    public static String getUserChoice(Scanner scanner) {
        String userChoice;
        System.out.println("Make your choice!");
        userChoice = scanner.nextLine();
        return userChoice;
    }
    public static String choseWiner (String computerChoice, String userChoice){
        String winner="No winner";
        String finalMessage;
        if(computerChoice.equals("rock") && userChoice.equals("scissors")) {
            winner = "Computer";
        } else if (userChoice.equals("rock") && computerChoice.equals("scissors")) {
            winner = "User";
        }
        if (computerChoice.equals("paper") && userChoice.equals("rock")) {
            winner = "Computer";
        } else if (userChoice.equals("paper") && computerChoice.equals("rock")) {
            winner = "User";
        }
         if (computerChoice.equals("scissors") && userChoice.equals("paper")) {
            winner = "Computer";
        } else if (userChoice.equals("scissors") && computerChoice.equals("paper")) {
            winner = "User";
         }
        finalMessage = winner + " won";
         if (finalMessage.equals("No winner won")) {
             finalMessage = "No winner won";
             return finalMessage;
         } else{
             return finalMessage;
         }

//         IgnoreCase

    }
    }


