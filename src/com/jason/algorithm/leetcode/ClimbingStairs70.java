package com.jason.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jsson on 20/3/8.
 * 70. Climbing Stairs
 Easy

 3467

 113

 Add to List

 Share
 You are climbing a stair case. It takes n steps to reach to the top.

 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 Note: Given n will be a positive integer.

 Example 1:

 Input: 2
 Output: 2
 Explanation: There are two ways to climb to the top.
 1. 1 step + 1 step
 2. 2 steps
 Example 2:

 Input: 3
 Output: 3
 Explanation: There are three ways to climb to the top.
 1. 1 step + 1 step + 1 step
 2. 1 step + 2 steps
 3. 2 steps + 1 step
 */
public class ClimbingStairs70 {
    private int memo[];
    public int climbStairs(int n) {
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return calcWays(n);
    }

    public int climbStairs1(int n) {
         memo = new int[n + 1];
         Arrays.fill(memo, -1);
         return calcWays(n);
    }
    private int calcWays(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        if (memo[n] == -1) {
            memo[n] = (calcWays(n - 1) + calcWays(n -2));
        }

        return memo[n];

    }
 
    
 
    private int calcWays1(int n) {
        if ( n == 1) {
            return 1;
        }
     
        if ( n == 2) {
            return 2;
        }
     
     if (memo[n] == -1) {
          memo[n] = (calcWays(n - 1) + calcWays(n - 2));
     }
     
     return memo[n];
    }
}
