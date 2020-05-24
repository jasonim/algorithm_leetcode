package com.jason.algorithm.leetcode;

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
