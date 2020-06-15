package com.jason.algorithm.leetcode;

import java.util.Arrays;

/**
 * Created by jsson on 20/5/24.
 */
public class InsertSort {
    void insertSort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            for(int j = i; j > 0; j--){
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    void insertSort2(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j;
            for(j = i; j > 0; j--){
                if (temp < arr[j-1]) {
                    arr[j] = arr[j -1];
                } else {
                    break;
                }
            }
            arr[j] = temp;
        }
    }

    void bundleSort(int arr[], int n) {
        for(int i = n -1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j] = temp;
                }
            }
        }
    }

    void selectSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j= i + 1; j < n; j++){
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }

    int partition(int arr[], int l, int r) {
        int v = arr[l];
        int j = l;
        for (int i = j + 1; i <= r; i++) {
            if (arr[i] < v) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[i];
                arr[j] = temp;
                j++;
            }
        }

        int temp = arr[j];
        arr[j] = arr[l];
        arr[l] = temp;

        return j;
    }

    void shiftUp(int arr[], int k) {
        while (k > 1 && arr[k] > arr[k /2]) {
            //TODO swap(arr[k], arr[k/2])
            k /= 2;
        }
    }

    void shiftDown(int arr[], int k, int count) {
        while(2 * k <= count) {
            int j = 2 * k;
            if (j + 1 <= count && arr[j] < arr[j + 1]) {
                j += 1;
            }

            if(arr[k] > arr[j]) {
                break;
            }

            //todo swap(arr[k], arr[j])
            k = j;
        }
    }
}




/**
 * Created by chengxiao on 2016/12/8.
 */
class MergeSort {
    public static void main(String []args){
        int []arr = {9,8,7,6,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int []arr){
        int []temp = new int[arr.length];//在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
        sort(arr,0,arr.length-1,temp);
    }
    private static void sort(int[] arr,int left,int right,int []temp){
        if(left<right){
            int mid = (left+right)/2;
            sort(arr,left,mid,temp);//左边归并排序，使得左子序列有序
            sort(arr,mid+1,right,temp);//右边归并排序，使得右子序列有序
            merge(arr,left,mid,right,temp);//将两个有序子数组合并操作
        }
    }
    private static void merge(int[] arr,int left,int mid,int right,int[] temp){
        int i = left;//左序列指针
        int j = mid+1;//右序列指针
        int t = 0;//临时数组指针
        while (i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[t++] = arr[i++];
            }else {
                temp[t++] = arr[j++];
            }
        }
        while(i<=mid){//将左边剩余元素填充进temp中
            temp[t++] = arr[i++];
        }
        while(j<=right){//将右序列剩余元素填充进temp中
            temp[t++] = arr[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while(left <= right){
            arr[left++] = temp[t++];
        }
    }
}