package com.jason.algorithm.leetcode;

import java.util.ArrayList;

/**
 * Created by jsson on 20/2/22.
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> list = new ArrayList();
        for (int item: nums) {
            if (item != 0) {
                list.add(item);
            }
        }

        int i = 0;
        for(Integer item: list) {
            nums[i] = item;
            i++;
        }

        for (int j = list.size(); j < nums.length; j ++) {
            nums[j] = 0;
        }
    }

    public void moveZeroes1(int[] nums) {
        int k = 0; // nums 中,[0...k)的元素均为非0的元素
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        for(int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }

    }
}
