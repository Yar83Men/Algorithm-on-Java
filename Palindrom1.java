package Algorithm_and_Structure;

public class Palindrom1 {
    public static void main(String[] args) {
        System.out.println(palindrom("деда"));
    }
    private static boolean palindrom(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
