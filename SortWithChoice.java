package com.javapoint.algorithm;

import java.util.Arrays;

public class SortWithChoice {
    public static void main(String[] args) {
        int[] arr = {64, 11, 2, 31, 45, 11, 22, 0, 101, 76, 123, 112};

        for (int k = 0; k < arr.length; k++) {
            int index = min(arr, k);
            int temp = arr[k];
            arr[k] = arr[index];
            arr[index] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int min(int[] arr, int start) {
        int minValue = arr[start];
        int minIndex = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
