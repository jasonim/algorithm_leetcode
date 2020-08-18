package com.jason.algorithm.leetcode;

/**
 Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: You are not suppose to use the library's sort function for this problem.

Example:

Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
 * Created by jsson on 20/5/24.
 */
public class SortColors75 {
    void sortColor(int nums[]) {
        int[] count = new int[3];

        for (int i : nums) {
            assert i >= 0 && i <= 2;
            count[i]++;
        }


    }

    void sortColor1(int nums[], int n) {
        int zero = -1;
        int two = n ;

        for (int i = 0; i < two; ) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                two--;
                //swap(nums[i], nums[two])
            } else {
                assert nums[i] == 0;
                zero++;
                //swap(nums[i], nums[zero]
                i++;
            }
        }
    }
}
