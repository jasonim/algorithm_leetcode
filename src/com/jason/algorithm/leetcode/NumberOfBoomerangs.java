package com.jason.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jsson on 20/2/25.
 * Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).
 * <p/>
 * Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).
 * <p/>
 * Example:
 * <p/>
 * Input:
 * [[0,0],[1,0],[2,0]]
 * <p/>
 * Output:
 * 2
 * <p/>
 * Explanation:
 * The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
 */
public class NumberOfBoomerangs {
    public int numberOfBoomerangs(int[][] points) {
        Map<Double, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                double tmp = getDis(points[i], points[j]);
                map.put(tmp, getOrDefualt(map, tmp) + 1);
            }
            for (double x : map.keySet())
                res += map.get(x) * (map.get(x) - 1);
            map.clear();
        }
        return res;
    }

    private int getOrDefualt(Map<Double, Integer> map, Double key) {
        Integer integer = map.get(key);
        if (integer == null) {
            return 0;
        }

        return integer;
    }
    public double getDis(int[] x, int[] y) {
        return (x[0] - y[0]) * (x[0] - y[0]) + (x[1] - y[1]) * (x[1] - y[1]);
    }
}
