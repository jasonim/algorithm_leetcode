package com.jason.algorithm.leetcode;

/**
 * Created by jsson on 20/2/23.
 */
public class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        int left = 0, right = nums.length - 1;
        while (true) {
            int pos = partition(nums, left, right);
            if (pos == k - 1) return nums[pos];
            if (pos > k - 1) right = pos - 1;
            else left = pos + 1;
        }
    }
    int partition(int[] nums, int l, int r) {
        int v = nums[l];
        int j = l;
        for (int i = j + 1; i <= r; i++) {
            if (nums[i] < v) {
                swap(nums, j + 1, i);
                j++;
            }
        }
        swap(nums, l, j);
        return j;
    }
//    int partition(int[] nums, int left, int right) {
//        int pivot = nums[left], l = left + 1, r = right;
//        while (l <= r) {
//            if (nums[l] < pivot && nums[r] > pivot) {
//                swap(nums, l++, r--);
//            }
//            if (nums[l] >= pivot) ++l;
//            if (nums[r] <= pivot) --r;
//            print(nums);
//        }
//        swap(nums, left, r);
//        System.out.println(" r: " + r + " l: " + l );
//
//        return r;
//    }

    private void swap(int nums[], int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    private void print(int nums[]) {
        for (int i :
                nums) {

            System.out.print(" " + i + " ");
        }

        System.out.println("");
    }


    public static void main(String[] args){
        int nums[] = {3,2,1,5,6,4};
        new KthLargest().findKthLargest(nums, 2);
    }
}
