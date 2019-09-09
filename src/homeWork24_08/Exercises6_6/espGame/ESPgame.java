package homeWork24_08.Exercises6_6.espGame;

import java.util.Random;
import java.util.Scanner;

public class ESPgame {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String computerColor;
        String userColor;
        int userCorrectGuesses = 0;


        for (int i = 1; i <= 10; i++) {
            computerColor = generateComputerColor(random);
            userColor = getUserColor(scanner);
            System.out.println("The computer selected: " + computerColor + "\n You selected: " + userColor);

            if (compareColors(computerColor, userColor)) {
                userCorrectGuesses = userCorrectGuesses + 1;

            }
        }

        displayCorrectGuesses(userCorrectGuesses);

    }

    public static String getUserColor(Scanner scaner) {
        String userColor;
        System.out.println("User, guess the computer's color: ");
        userColor = scaner.nextLine();

        return userColor;


    }

    public static String generateComputerColor(Random random) {
        int colorIndex;
        colorIndex = random.nextInt(5);
        String computerChosenColor = "";
        if (colorIndex == 0) {
            computerChosenColor = "Red";
        } else if (colorIndex == 1) {
            computerChosenColor = "Green";
        } else if (colorIndex == 2) {
            computerChosenColor = "Blue";
        } else if (colorIndex == 3) {
            computerChosenColor = "Orange";
        } else if (colorIndex == 4) {
            computerChosenColor = "Yellow";

        }
        System.out.println("Computer has chosen a color");
        return computerChosenColor;
    }


    public static boolean compareColors(String color1, String color2) {
        if (color1.equalsIgnoreCase(color2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void displayCorrectGuesses(int userCorrectGuesses) {
        System.out.println("The user correct guessed " + userCorrectGuesses + " time");

    }
}


