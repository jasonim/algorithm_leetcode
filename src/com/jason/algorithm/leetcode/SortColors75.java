package com.jason.algorithm.leetcode;

/**
 * Created by jsson on 20/5/24.
 */
public class SortColors75 {
    void sortColor(int nums[]) {
        int[] count = new int[3];

        for (int i : nums) {
            assert i >= 0 && i <= 2;
            count[i]++;
        }


    }

    void sortColor1(int nums[], int n) {
        int zero = -1;
        int two = n ;

        for (int i = 0; i < two; ) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                two--;
                //swap(nums[i], nums[two])
            } else {
                assert nums[i] == 0;
                zero++;
                //swap(nums[i], nums[zero]
                i++;
            }
        }
    }
}
