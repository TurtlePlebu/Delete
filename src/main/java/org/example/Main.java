package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {3,1,5,2,1,4};

        insertionSort(nums); //{1 , 1 , 2 , 3 , 4 , 5}

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

    /*
    315214
    135214
    115234
    112534
    112354
    112345
     */
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int smallestIdx = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[smallestIdx]) {
                    smallestIdx = j;
                }
            }
            //swap nums[i] and nums[smallestIdx]
            int temp = nums[i];
            nums[i] = nums[smallestIdx];
            nums[smallestIdx] = temp;
        }
    }

    /*
    3 15214
    1 35214
    13 5214
    135 514
    133 514
    123 514
    1235 14
    1235 54
    1233 54
    1223 54
    1123 54
    11235 5
    11234 5
    112345
     */
    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length ; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
}