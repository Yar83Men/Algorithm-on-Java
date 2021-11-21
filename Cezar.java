package Algorithm_and_Structure;

public class Cezar {
    public static void main(String[] args) {
        System.out.println(cezarCode("ABBA", 2));
    }

    private static String cezarCode(String str, int key) {
        if (str.isEmpty()) return "";
        char[] chars = str.toCharArray();
        char[] newChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            newChars[i] = (char) (chars[i] + key);
        }
        return new String(newChars);
    }
}
