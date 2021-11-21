package com.javapoint.algorithm;

import java.util.Arrays;

public class BinarySort {
    public static void main(String[] args) {
        int[] arr = {64, 11, 2, 31, 45, 11, 22, 0, 101, 76, 123, 112};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 101));

    }

    private static int binarySearch(int[] arr, int findElement) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == findElement) return mid;
            if (arr[mid] > findElement) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    private static void bubbleSort(int[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
}
