package NegPosZero;

import java.util.Scanner;

public class NegPosZero {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter five numbers>");
        Integer a = in.nextInt();
        Integer b = in.nextInt();
        Integer c = in.nextInt();
        Integer d = in.nextInt();
        Integer e = in.nextInt();

        Integer countOfNegtivNumber = 0;
        Integer countOfPositivNumber =0;
        Integer countOfZero = 0;

        if (a>0){
            countOfPositivNumber++;
        } else if (a < 0){
            countOfNegtivNumber++;
        } else{
            countOfZero++;
        }
        if (b>0){
            countOfPositivNumber++;
        } else if (b < 0){
            countOfNegtivNumber++;
        } else {
            countOfZero++;
        }
        if (c>0){
            countOfPositivNumber++;
        } else if (c < 0){
            countOfNegtivNumber++;
        } else{
            countOfZero++;
        }
        if (d>0){
            countOfPositivNumber++;
        } else if (d < 0){
            countOfNegtivNumber++;
        } else{
            countOfZero++;
        }
        if (e>0){
            countOfPositivNumber++;
        } else if (e < 0){
            countOfNegtivNumber++;
        } else{
            countOfZero++;
        }
        System.out.println(countOfNegtivNumber);
        System.out.println(countOfPositivNumber);
        System.out.println(countOfZero);

        }

    }

