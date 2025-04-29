package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {3,1,5,2,1,4};

        bubbleSort(nums); //{1 , 1 , 2 , 3 , 4 , 5}

        System.out.println(Arrays.toString(nums));
    }

    /*
    31 5214
    1 35 214
    13 52 14
    132 51 4
    1321 54
    132145

    13 2145
    1 32 145
    12 31 45
    121 34 5
    1213 45
    121345

    12 1345
    1 21 345
    11 23 45
    112 34 5
    1123 45
    112345
     */
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1 ; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }


}