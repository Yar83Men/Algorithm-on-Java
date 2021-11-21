package Algorithm_and_Structure;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(primeNumber(4));
    }

    private static boolean primeNumber(int number) {
        if (number <= 1) { return false;}
        for (int i = 2; i < number / 2; i++) {
            if (number % 2 == 0) {return false;}
        }
        return true;
    }
}
