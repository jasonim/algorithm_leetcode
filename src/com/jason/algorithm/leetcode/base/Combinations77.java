package com.jason.algorithm.leetcode.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsson on 20/3/8.
 * 77. Combinations
 Medium

 1187

 60

 Add to List

 Share
 Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

 Example:

 Input: n = 4, k = 2
 Output:
 [
 [2,4],
 [3,4],
 [2,3],
 [1,2],
 [1,3],
 [1,4],
 ]
 */
public class Combinations77 {
    private List<List<Integer>> res = new ArrayList<>();
    private void generateCombine(int n, int k, int start, List<Integer> c) {
        if (c.size() == k) {
            System.out.println( c.toString());
            res.add(new ArrayList<>(c));
            return;
        }

        // 还有 k - c.size() 个空位, 所以, [i...n] 中至少要有 k - c.size()个元素
        for (int i = start; i <= n - (k - c.size()) + 1; i++) {
            c.add(i);
            generateCombine(n, k, i + 1, c);
            c.remove(new Integer(i));
        }
    }
    public List<List<Integer>> combine(int n, int k) {

        List<Integer> c = new ArrayList<>();
        generateCombine(n, k, 1, c);
        return res;
    }
}
