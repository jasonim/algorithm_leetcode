package com.jason.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jsson on 20/2/25.
 * 219. Contains Duplicate II
 Easy

 691

 845

 Add to List

 Share
 Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

 Example 1:

 Input: nums = [1,2,3,1], k = 3
 Output: true
 Example 2:

 Input: nums = [1,0,1,1], k = 1
 Output: true
 Example 3:

 Input: nums = [1,2,3,1,2,3], k = 2
 Output: false
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
            if (set.size() == k + 1) {
                set.remove(nums[i - k]);
            }
        }


        return false;
    }
 
    public boolean containsNearByDuplicate1(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
           if (set.contains(nums[i])) {
              return true;
           }
         
           set.add(nums[i]);
           if (set.size() == k + 1)) {
              set.remove(nums[i - k]);
           }
        }
     
        return false;
    }
}
