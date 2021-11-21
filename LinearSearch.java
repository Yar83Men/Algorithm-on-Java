package Algorithm_and_Structure;

public class LinearSearch {
    public static void main(String[] args) {
        int[] s = {2, 0, 4, 5, 11, 34, -4, 8, 19, 33, 47};
        System.out.println(search(s, -4));
    }

    private static int search(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) return i;
        }
        return -1;
    }
}
