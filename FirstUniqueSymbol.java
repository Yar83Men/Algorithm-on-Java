package Algorithm_and_Structure;

//Условия следующие:  нам необходимо написать функцию,
// которая принимает в качестве аргумента строку и возвращает индекс первого уникального символа.
// Если мы не найдем ни одного уникального символа, то функция должна вернуть -1.

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueSymbol {
    public static void main(String[] args) {
        String str1 = "leetcode";
        String str2 = "loveleetcode";
        String str3 = "abbac";
        String str4 = "hello Java";
        String str5 = "abbabalalaba";

        System.out.println(firstUniqueChar(str1));
        System.out.println(firstUniqueChar(str2));
        System.out.println(firstUniqueChar(str3));
        System.out.println(firstUniqueChar(str4));
        System.out.println(firstUniqueChar(str5));
    }

    private static int firstUniqueChar(String str) {
        str = str.toLowerCase();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if (!map.containsKey(current)) {
                map.put(current, 1);
            } else {
                map.put(current, map.get(current) + 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
