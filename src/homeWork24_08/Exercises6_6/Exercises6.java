package homeWork24_08.Exercises6_6;

import java.util.Arrays;

public class Exercises6 {

    private int index;
    private int[] nums;

    public Exercises6() {

        nums = new int[3];
        index = 0;
    }


    public void addNumber(int num) {
        nums[index] = num;
        index++;
    }



    public void displayPattern(int n) {

        int[] clonedNums = nums.clone();
        Arrays.sort(clonedNums);

        for (int i=0; i<3-n; i++) {
            System.out.print("  ");
        }

        for (int i = 2; i>2-n; i--) {
            System.out.print(clonedNums[i] + " ");
        }
        System.out.println();
    }

}
