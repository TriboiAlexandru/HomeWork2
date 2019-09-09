package HomeWork20_08;

import java.util.Random;

public class SimulationHeadOrTails {
    public static void main(String[] args) {

        int head = 0;
        int rnd;
        int tail=0;
        int n = 1000000;

        Random r = new Random();



        for (int i = 0; i < n; i++) {
            rnd = r.nextInt(2);

            if (rnd == 0){
                head++;

    }      else {
                tail ++;
            }}


        System.out.printf("head %d\n", head);
        System.out.printf("tail %d", tail);
    }
}
