package com.jason.algorithm.leetcode;

/**
Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: You are not suppose to use the library's sort function for this problem.

Example:

Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
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
