package com.javapoint.algorithm;

public class SecondMinElem {
    public static void main(String[] args) {
        int[] arr = {64, 11, 2, 31, 45, 11, 22, 0, 101, 76, 123, 112};

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2 && arr[i] != min1) {
                min2 = arr[i];
            }
        }

        if (min2 != Integer.MAX_VALUE) {
            System.out.println(min1 + "  " + min2);
        } else {
            System.out.println(min1);
        }

    }
}
