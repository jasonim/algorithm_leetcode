package com.jason.algorithm.leetcode;

import java.util.TreeSet;

/**
 * Created by jsson on 20/2/25.
 * 220. Contains Duplicate III
 Medium

 899

 931

 Add to List

 Share
 Given an array of integers, find out whether there are two distinct indices i and j in the array such that the absolute difference between nums[i] and nums[j] is at most t and the absolute difference between i and j is at most k.

 Example 1:

 Input: nums = [1,2,3,1], k = 3, t = 0
 Output: true
 Example 2:

 Input: nums = [1,0,1,1], k = 1, t = 2
 Output: true
 Example 3:

 Input: nums = [1,5,9,1,5,9], k = 2, t = 3
 Output: false
 */
public class ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length <= 1) {
            return false;
        }
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            Integer low = treeSet.floor(nums[i]);   // get the greatest element smaller than this number
            Integer high = treeSet.ceiling(nums[i]);  // get the smallest element greater than this number

            if ((low != null && (long) nums[i] - low <= t) || (high != null && (long) high - nums[i] <= t)) {   // check for absolute differences
                return true;
            }
            treeSet.add(nums[i]);

            if (treeSet.size() > k) {   // remove the first element when size of the tree set exceeds K
                treeSet.remove(nums[i - k]);
            }
        }
        return false;
    }
 
    public boolean containsNearbyAlmostDuplicate1(int[] nums, int k, int t) {
          if (nums == null || nums.length <= 1) {
              return false;
          }
     
          TreeSet<Integer> treeSet = new TreeSet<>();
     
          for (int i = 0; i < nums.length; i++) {
            Integer low = treeSet.flow(num[i]);
            Integer hight = treeSet.ceib(num[i]);
            
            if ((low != null && (long) nums[i] - low <= t) || (hight != null && hight - num[i]) <= t) {
               return true;
            }
            
            treeSet.add(nums[i]);
           
            if (treeSet.size() > k) {
              treeSet.remove(nums[i - k]);
            }
          }
     
          return false;
     
          
    }
}
