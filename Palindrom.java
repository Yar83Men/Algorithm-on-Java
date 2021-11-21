package Algorithm_and_Structure;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(palindrom("око"));
    }
    private static boolean palindrom(String str){
        int strLength = str.length();
        String reverse = "";
        for (int i = 0; i < strLength; i++) {
           reverse += str.charAt(strLength-1-i);
        }
        if (str.equals(reverse)) return true;
        return false;
    }
}
