package com.jason.algorithm.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * Created by jsson on 20/2/23.
 */
public class TowSum11 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length -1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i+1, j + 1};
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return null;
    }

    public int[] twoSum1(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                return new int[] {map.get(numbers[i]), i};
            } else {
                map.put(target - numbers[i], i);
            }
        }

        return null;
    }
}
