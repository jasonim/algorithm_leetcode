package com.jason.algorithm.leetcode;

/**
 * Created by jsson on 20/5/24.
 */
public class MinimumSizeSubarraySum209 {
    int miniSubarryLen(int s, int[] nums) {
        int l = 0;
        int r = -1;
        int sum = 0;
        int res = nums.length -1;

        while (l < nums.length) {
            if (sum < s) {
                sum += nums[r + 1];
                r++;
            } else {
                sum -= nums[l];
                l++;
            }

            if (sum >= s) {
                res = Math.min(res, r - l + 1);
            }
        }

        return res;
    }
}
