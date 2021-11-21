package Algorithm_and_Structure;
import java.util.Arrays;

public class GreedyAlgorithm1 {
    public static void main(String[] args) {
        int[] digits = {3, 1, 7, 9, 9, 5, 0};
        System.out.println(maxNumberFromDigits(digits));
    }
    public static String maxNumberFromDigits(int[] digits) {
        String str = "";
       Arrays.sort(digits);
       for (int i = 0; i < digits.length; i++) {
           str += digits[digits.length-1-i];
       }
       return str;
    }

}
