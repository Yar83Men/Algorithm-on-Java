package com.javapoint.algorithm;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {64, 11, 2, 31, 45, 11, 22, 0, 101, 76, 123, 112};
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int devideIndex = partition(arr, start, end);
            quickSort(arr, start, devideIndex - 1);
            quickSort(arr, devideIndex, end);
        }
    }
    private static int partition(int[] arr, int start, int end){
        int rightIndex = end;
        int leftIndex = start;
        int pivot = arr[start + (end-start) / 2];
        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot){
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
