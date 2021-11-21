package Algorithm_and_Structure;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibNumber(10));
        fibNumbersSequence(1);
        System.out.println(Arrays.toString(fibEffective(50)));
    }

    // Неэфффективная операция
    private static long fibNumber(int n) {
        if (n <= 1) return n;
        return fibNumber(n - 2) + fibNumber(n - 1);
    }

    private static void fibNumbersSequence(int n) {
        if (n <= 1) {
            System.out.println(n);
        } else {
            int a = 0;
            int b = 1;
            int temp = 0;
            System.out.print(a + " " + b + " ");
            while (temp <= n) {
                temp = a + b;
                a = b;
                b = temp;
                System.out.print(temp + " ");
            }
        }
    }

    private static long[] fibEffective(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }
}
