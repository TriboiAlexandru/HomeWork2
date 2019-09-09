package speedSound;

import java.util.Scanner;

public class SpeedSound {
    private static final double SPEED_OF_SOUND_IN_AIR =1100;
    private static final double SPEED_OF_SOUND_IN_WATER =4900;
    private static final double SPEED_OF_SOUND_IN_STEEL =16400;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Select conductors Air, Wather or Steel");


        String input;
        input = in.nextLine();


        System.out.println("Enter the distance of conductor");

        int d = in.nextInt();

        if (input.equals("Air")) {

            double timeAir = d / SPEED_OF_SOUND_IN_AIR;
            System.out.printf("Amount Time for Air is %f", timeAir);
        }
                else if (input.equals("Water")) {

            double timeWater = d / SPEED_OF_SOUND_IN_WATER;
            System.out.printf("Amount Time for Water is %f", timeWater);
        }
                else if (input.equals("Steel")) {
            double timeSteel = d / SPEED_OF_SOUND_IN_STEEL;

            System.out.printf("Amount Time for Steel is %f", timeSteel);
        }


        }
    }

