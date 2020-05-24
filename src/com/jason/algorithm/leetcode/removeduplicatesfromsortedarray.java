package com.jason.algorithm.leetcode;

/**
 * Created by jsson on 20/2/23.
 */
public class removeduplicatesfromsortedarray {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i -1] != nums[i]) {
                k++;
                nums[k] = nums[i];
            }
        }

        return k + 1;
    }
}
