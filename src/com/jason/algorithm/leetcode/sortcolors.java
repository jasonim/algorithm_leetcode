package com.jason.algorithm.leetcode;

/**
 * Created by jsson on 20/2/23.
 */
public class sortcolors {
    public void sortColors(int[] nums) {
        int count[] = new int[3];

        for(int i = 0; i < nums.length; i++) {
            assert (nums[i] >=0 && nums[i] <= 2);
            count[nums[i]] ++;
        }

        int index = 0;
        for (int i = 0; i < count[0]; i++) {
            nums[index++] = 0;
        }

        for (int i = 0; i < count[0]; i++) {
            nums[index++] = 1;
        }

        for (int i = 0; i < count[0]; i++) {
            nums[index++] = 2;
        }

    }

    public void sortColors1(int[] nums) {
        int zero = -1; //nums[0...zero] == 0
        int two = nums.length; // nums[two..n-1] == 2

        for(int i = 0 ; i< two;) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 0) {
                zero++;
                swap(nums, zero, i);
                i++;
            } else if(nums[i] == 2) {
                two--;
                swap(nums, i, two);
            }
        }

    }

    private void swap(int nums[], int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
