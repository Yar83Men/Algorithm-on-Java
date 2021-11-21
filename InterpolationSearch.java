package Algorithm_and_Structure;

public class InterpolationSearch {
    private static int count = 0;
    public static void main(String[] args) {
        int[] arr = {-2, 0, 3, 5, 7, 9, 11, 15, 18};
        int element = 11;
        System.out.println(interpolationSearch(arr, element)+ " count = " +count);
    }

    private static int interpolationSearch(int[] array, int n) {
        int left = 0;
        int right = array.length - 1;
        for (; array[left] < n && n < array[right]; ) {
            count++;
            if (array[left] == array[right]) {
                break;
            }
            int index = (n - array[left]) * (left - right) / (array[left] - array[right]) + left;
            if (array[index] > n) {
                right = index - 1;
            } else if (array[index] < n) {
                left = index + 1;
            } else return index;
        }
        if (array[left] == n) {
            return left;
        }
        if (array[right] == n) {
            return right;
        }
        return -1;
    }
}
