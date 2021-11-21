package Algorithm_and_Structure;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(32));
    }

    private static boolean isPrimeNumber(int number) {
        boolean res = true;
        int temp = number / 2;
        if (number == 0 || number == 1) res = false;
        for (int i = 2; i <= temp; i++) {
            if (number % i == 0){
                res = false;
                break;
            }
        }
        return res;
    }
}
