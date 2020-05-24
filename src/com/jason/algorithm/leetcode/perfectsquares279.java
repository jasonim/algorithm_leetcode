package com.jason.algorithm.leetcode;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jsson on 20/3/1.
 * 279. Perfect Squares
 Medium

 2153

 167

 Add to List

 Share
 Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

 Example 1:

 Input: n = 12
 Output: 3
 Explanation: 12 = 4 + 4 + 4.
 Example 2:

 Input: n = 13
 Output: 2
 Explanation: 13 = 4 + 9.
 */
public class perfectsquares279 {
    public int numSquares(int n) {
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<Integer, Integer>(n, 0));
        Boolean arrays[] = new Boolean[n + 1];
        ArrayList<Boolean> visited = new ArrayList<>(Arrays.asList(arrays));
        visited.add(n, true);
        while (!queue.isEmpty()) {
            Pair<Integer, Integer> top  = queue.poll();
            int m = top.getKey();
            int step = top.getValue();

            if (m == 0) {
                return step;
            }


            for (int i = 1 ; ; i++ ) {
                int t = m - i * i;
                if (t < 0) {
                    break;
                }
                if ( visited.get(t)) {
                    queue.add(new Pair<>(t, step + 1));
                    visited.add(t, true);
                }
            }
        }

        return -1;
    }
}
