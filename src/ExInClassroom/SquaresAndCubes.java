package ExInClassroom;

import java.sql.SQLOutput;

public class SquaresAndCubes {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s\n", "numbers", "square", "cube");
        System.out.printf("%-10d%-10d%-10d\n", 1, 1*1, 1*1*1);
        System.out.printf("%-10d%-10d%-10d\n", 2, 2*2, 2*2*2);
        System.out.printf("%-10d%-10d%-10d\n", 3, 3*3, 3*3*3);
        System.out.printf("%-10d%-10d%-10d\n", 4, 4*4, 4*4*4);

        System.out.printf("%-10d%-10d%-10d\n", 1,(int) Math.pow(1, 2), (int) Math.pow(1, 3));

    }
}
