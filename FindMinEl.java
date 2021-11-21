package com.javapoint.algorithm;

public class FindMinEl {
    public static void main(String[] args) {
        int[] arr = {64, 11, 2, 31, 45, 11, 22, 0, 101, 76, 123, 112};
        int minValue = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        System.out.println("Min element = " + minValue);
        System.out.println("Min index = "+ minIndex);
    }
}
