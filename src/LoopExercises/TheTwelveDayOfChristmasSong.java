package LoopExercises;

public class TheTwelveDayOfChristmasSong {
    public static void main(String[] args) {


        int number;

        String gift = "";
        String day = "";
        String song = "";

        System.out.println(); {

        }

        number = 12;

        System.out.println();

        for (int j = 1; j <= number; j++) {
            switch (j) {
                case 1:
                    day = "First";
                    gift = "A Partridge in a Pear Tree \n ";

                    break;

                case 2:

                    day = "Second";
                    gift = "\nTwo turtle doves, \nAnd " + gift;

                    break;

                case 3:
                    day = "Third";
                    gift = "\nThree French Hens," + gift;
                    break;

                case 4:
                    day = "Four";
                    gift = "\nFour Calling Birds," + gift;
                    break;

                case 5:
                    day = "Five";
                    gift = "\nFive Golden Rings," + gift;
                    break;

                case 6:
                    day = "Six";
                    gift = "\nSix Geese a Laying," + gift;
                    break;

                case 7:
                    day = "Seven";
                    gift = "\nSeven Swans a Swimming," + gift;
                    break;

                case 8:
                    day = "Eight";
                    gift = "\nEight Maids a Milking," + gift;
                    break;

                case 9:
                    day = "Nine";
                    gift = "\nNine Ladies Dancing," + gift;
                    break;

                case 10:
                    day = "Ten";
                    gift = "\nTen Lords a Leaping," + gift;
                    break;

                case 11:
                    day = "Eleven";
                    gift = "\nEleven Pipers Piping," + gift;
                    break;

                case 12:
                    day = "Twelve";
                    gift = "\n12 Drummers Drumming," + gift;
                    break;
            }

            song += "\n On the " + day + " day of Christmas my true love sent to me:\n " + gift;
        }
        System.out.println(song);
    }
}






