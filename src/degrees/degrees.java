package degrees;

import java.util.Scanner;

public class degrees {
    public static final int MINUTES_COEFICIENT=60;
    public static final int SECONDS_COEFICIENT=3600;


 public static void main (String [] arg){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter a latitude in degrees, mintutes, and second");
     System.out.println("First, enter the degrees ");
     int degrees = scanner.nextInt();
     System.out.println("Next, enter the minutes of arc");
     int minutes = scanner.nextInt();
     System.out.println("Next, enter the minutes of arc");
     int seconds = scanner.nextInt();
     System.out.println("Enter the seonds of arc");

     double result = degrees + ((double)minutes/ MINUTES_COEFICIENT) + ((double)seconds/ SECONDS_COEFICIENT);
     System.out.printf(degrees + " degrees," + minutes +" minutes," + seconds + " seconds = " + "%.4f" + " degrees", result);
 }


}
