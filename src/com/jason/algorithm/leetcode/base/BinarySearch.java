package com.jason.algorithm.leetcode.base;

/**
 * Created by jsson on 20/2/19.
 */
public class BinarySearch {
    int binarySearch(int arr[], int n, int target) {
        int l = 0, r = n -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                r = mid -1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

}
