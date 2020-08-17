package com.jason.algorithm.leetcode;

/**
 * Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.

Example: 

Input: s = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: the subarray [4,3] has the minimal length under the problem constraint.
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
