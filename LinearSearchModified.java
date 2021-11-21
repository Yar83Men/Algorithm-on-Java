package Algorithm_and_Structure;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchModified {
    public static void main(String[] args) {
        int[] s = {2, 0, 4, 5, 11, 34, -4, 8, 19, 33, 47};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            list.add(s[i]);
        }
        System.out.println(search(list, 47));

    }

    public static int search(List<Integer> arr, int element) {
        arr.add(element);
        int lastIndex = arr.size() - 1;
        int i = 0;
        for ( ; element != arr.get(i); ) {
            i++;
        }
        arr.remove(element);
        if (i != lastIndex) {
            return i;
        }
        return -1;
    }
}
